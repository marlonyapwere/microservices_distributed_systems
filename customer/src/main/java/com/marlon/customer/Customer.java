package com.marlon.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
