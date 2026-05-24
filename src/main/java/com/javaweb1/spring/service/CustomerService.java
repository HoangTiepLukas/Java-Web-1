package com.javaweb1.spring.service;

import com.javaweb1.spring.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerEntity createCustomer(CustomerEntity customer);

    CustomerEntity getCustomer(String id);

    List<CustomerEntity> listCustomers();
}