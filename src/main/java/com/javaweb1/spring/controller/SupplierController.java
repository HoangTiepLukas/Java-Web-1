package com.javaweb1.spring.controller;

import com.javaweb1.spring.dto.CreateSupplierRequest;
import com.javaweb1.spring.dto.SupplierDTO;
import com.javaweb1.spring.service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {

        this.supplierService = supplierService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SupplierDTO createSupplier(@RequestBody CreateSupplierRequest supplier) {
        return supplierService.createSupplier(supplier);
    }

    @GetMapping("/{id}")
    public SupplierDTO getSupplier(@PathVariable String id) {

        return supplierService.getSupplier(id);
    }

    @PostMapping("/add-worker/{id}")
    public SupplierDTO addWorker(@PathVariable String id) {
        return supplierService.addWorker(id);
    }

    @GetMapping
    public List<SupplierDTO> listSuppliers() {
        return supplierService.listSuppliers();
    }
}