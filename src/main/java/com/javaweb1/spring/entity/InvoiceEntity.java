package com.javaweb1.spring.entity;

import java.time.LocalDate;
import java.time.Instant;
public class InvoiceEntity {
    public String id;
    public String offerId;
    public String customerId;
    public String supplierId;
    public String invoiceNumber;
    public double amount;
    public LocalDate issuedAt;
    public LocalDate dueDate;
    public InvoiceStatus status;
    public Instant createdAt;
}
