package com.javaweb1.spring.dto;

import jakarta.validation.constraints.NotBlank;

public class AcceptOfferRequest {
    @NotBlank
    public String customerId;
}
