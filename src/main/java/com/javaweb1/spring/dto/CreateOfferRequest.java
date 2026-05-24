package com.javaweb1.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateOfferRequest {
    @NotBlank
    public String title;

    @NotBlank
    public String description;

    @NotNull
    public Double price;

    @NotBlank
    public String customerId;

    @NotBlank
    public String supplierId;
}
