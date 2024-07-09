package com.issam.notification;

import com.issam.clients.fraud.FraudCheckResponse;
import com.issam.clients.fraud.FraudClient;
import com.issam.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerEmail(notificationRequest.customerEmail())
                        .toCustomerId(notificationRequest.customerId())
                        .message(notificationRequest.message())
                        .sender("Amigoscode")
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
