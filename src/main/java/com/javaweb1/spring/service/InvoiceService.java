package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateInvoiceRequest;
import com.javaweb1.spring.dto.InvoiceDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceDTO createInvoice(CreateInvoiceRequest request);

    InvoiceDTO getInvoice(String id);

    List<InvoiceDTO> listInvoice();
}
