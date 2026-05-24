package com.javaweb1.spring.entity;

import java.time.Instant;

public class OfferEntity {
    public String id;
    public String title;
    public String description;
    public double price;
    public String customerId;
    public String supplierId;
    public String status;
    public Instant createdAt;
    public Instant updatedAt;
}
