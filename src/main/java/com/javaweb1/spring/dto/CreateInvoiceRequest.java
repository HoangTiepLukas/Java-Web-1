package com.javaweb1.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class CreateInvoiceRequest {
    @NotBlank
    public String offerId;

    @NotBlank
    public String customerId;

    @NotBlank
    public String supplierId;

    @NotNull
    public String invoiceNumber;

    @NotNull
    public double amount;

    @NotBlank
    public LocalDate issuedAt;

    @NotBlank
    public LocalDate dueDate;

    @NotBlank
    public String status;
}
