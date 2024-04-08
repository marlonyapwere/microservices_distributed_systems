package com.marlon.eurekaserver.fraud.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
