package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateSupplierRequest;
import com.javaweb1.spring.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {

    SupplierDTO createSupplier(CreateSupplierRequest supplier);

    SupplierDTO getSupplier(String id);

    SupplierDTO addWorker(String id);

    List<SupplierDTO> listSuppliers();
}
