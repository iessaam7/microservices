package com.issam.customer;

import com.issam.clients.fraud.FraudCheckResponse;
import com.issam.clients.fraud.FraudClient;
import com.issam.clients.notification.NotificationClient;
import com.issam.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final NotificationClient notificationClient;
    private final FraudClient fraudClient;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        //todo check if email is valid
        //todo check if email not taken
        customerRepository.saveAndFlush(customer);
        //todo check if fraudster

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if(fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }
        // todo: make it async use message queue
        notificationClient.sendNotification(new NotificationRequest(customer.getId(), customer.getEmail(), String.format("Hi %s, Welcome to Amigoscode", customer.getFirstName())));
    }
}
