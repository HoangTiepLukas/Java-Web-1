package com.javaweb1.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateOfferRequest {
    public String title;
    public String description;
    public Double price;
}
