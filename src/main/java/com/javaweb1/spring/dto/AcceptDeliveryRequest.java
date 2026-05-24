package com.javaweb1.spring.dto;

import jakarta.validation.constraints.NotBlank;

public class AcceptDeliveryRequest {
    @NotBlank
    public String customerId;
}
