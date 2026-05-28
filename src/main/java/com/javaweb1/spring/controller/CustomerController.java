package com.javaweb1.spring.controller;

import com.javaweb1.spring.entity.CustomerEntity;
import com.javaweb1.spring.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public CustomerEntity getCustomer(@PathVariable String id) {

        return customerService.getCustomer(id);
    }

    @GetMapping
    public List<CustomerEntity> listCustomers() {
        return customerService.listCustomers();
    }
}
