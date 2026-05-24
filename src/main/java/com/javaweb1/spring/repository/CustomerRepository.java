package com.javaweb1.spring.repository;

import com.javaweb1.spring.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository {

    CustomerEntity save(CustomerEntity customer);

    Optional<CustomerEntity> findById(String id);

    List<CustomerEntity> findAll();
}