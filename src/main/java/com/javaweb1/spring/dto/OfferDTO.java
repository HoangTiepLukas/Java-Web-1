package com.javaweb1.spring.dto;

import java.time.Instant;
import com.javaweb1.spring.entity.OfferStatus;

public class OfferDTO {
    public String id;
    public String title;
    public String description;
    public double price;
    public String supplierId;
    public String customerId;
    public OfferStatus status;
    public Instant createdAt;
}
