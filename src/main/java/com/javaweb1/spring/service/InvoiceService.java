package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateInvoiceRequest;
import com.javaweb1.spring.entity.InvoiceEntity;

import java.util.List;

public interface InvoiceService {
    InvoiceEntity createInvoice(CreateInvoiceRequest request);

    InvoiceEntity getInvoice(String id);

    List<InvoiceEntity> listInvoice();
}
