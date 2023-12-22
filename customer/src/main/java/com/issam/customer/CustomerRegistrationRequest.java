package com.issam.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
