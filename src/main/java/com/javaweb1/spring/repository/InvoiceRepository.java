package com.javaweb1.spring.repository;

import com.javaweb1.spring.entity.CustomerEntity;
import com.javaweb1.spring.entity.InvoiceEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository {
    InvoiceEntity save(InvoiceEntity invoiceEntity);
    Optional<InvoiceEntity> findById(String id);

    List<InvoiceEntity> findAll();
}
