package com.javaweb1.spring.repository;

import com.javaweb1.spring.entity.WorkerEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkerRepository {
    WorkerEntity save(WorkerEntity workerEntity);
    Optional<WorkerEntity> findById(String id);

    List<WorkerEntity> findAll();
}
