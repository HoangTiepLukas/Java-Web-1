package com.javaweb1.spring.dto;

import java.time.Instant;
import java.time.LocalDate;

public class InvoiceDTO {
    public String id;
    public String offerId;
    public String customerId;
    public String supplierId;
    public String invoiceNumber;
    public double amount;
    public LocalDate issuedAt;
    public LocalDate dueDate;
    public String status;
    public Instant createdAt;
}
