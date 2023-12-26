package com.issam.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRespository fraudCheckHistoryRespository;
    public boolean isFraudulentCustomer(Integer customerID) {
        fraudCheckHistoryRespository.save(
                FraudCheckHistory.builder()
                        .isFraudster(false)
                        .customerId(customerID)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
