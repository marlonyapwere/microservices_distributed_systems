package com.marlon.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
