package com.javaweb1.spring.service;

import com.javaweb1.spring.entity.SupplierEntity;

import java.util.List;

public interface SupplierService {

    SupplierEntity createSupplier(SupplierEntity supplier);

    SupplierEntity getSupplier(String id);

    List<SupplierEntity> listSuppliers();
}
