package com.javaweb1.spring.entity;

import java.time.Instant;

public class OfferEntity {
    public String id;
    public String title;
    public String description;
    public double price;
    public String supplierId;
    public String customerId;
    public OfferStatus status;
    public Instant createdAt;
}
