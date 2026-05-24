package com.javaweb1.spring.controller;

import com.javaweb1.spring.entity.SupplierEntity;
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
    public SupplierEntity createSupplier(@RequestBody SupplierEntity supplier) {
        return supplierService.createSupplier(supplier);
    }

    @GetMapping("/{id}")
    public SupplierEntity getSupplier(@PathVariable String id) {
        return supplierService.getSupplier(id);
    }

    @GetMapping
    public List<SupplierEntity> listSuppliers() {
        return supplierService.listSuppliers();
    }
}