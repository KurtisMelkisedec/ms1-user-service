package com.ms1.ms1userservice.web.dtos.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CustomerRequest {

    private Long id;

    private String fullName;
    private String phoneNumber;
}
