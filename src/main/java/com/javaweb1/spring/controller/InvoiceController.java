package com.javaweb1.spring.controller;

import com.javaweb1.spring.dto.CreateInvoiceRequest;
import com.javaweb1.spring.dto.InvoiceDTO;
import com.javaweb1.spring.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceDTO createInvoice(@RequestBody CreateInvoiceRequest request) {
        return invoiceService.createInvoice(request);
    }

    @GetMapping("/{id}")
    public InvoiceDTO getInvoice(@PathVariable String id) {
        return invoiceService.getInvoice(id);
    }

    @GetMapping
    public List<InvoiceDTO> listInvoices() {
        return invoiceService.listInvoice();
    }
}
