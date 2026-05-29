package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateCustomerRequest;
import com.javaweb1.spring.dto.CustomerDTO;
import com.javaweb1.spring.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerDTO createCustomer(CreateCustomerRequest customer);

    CustomerDTO getCustomer(String id);

    List<CustomerDTO> listCustomers();
}