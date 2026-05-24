package com.javaweb1.spring.repository;

import com.javaweb1.spring.entity.SupplierEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SupplierRepository {

    SupplierEntity save(SupplierEntity supplier);

    Optional<SupplierEntity> findById(String id);

    List<SupplierEntity> findAll();
}