package com.javaweb1.spring.repository;

import com.javaweb1.spring.entity.OfferEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfferRepository {
    OfferEntity save(OfferEntity offer);

    Optional<OfferEntity> findById(String id);
    List<OfferEntity> findAll();
}
