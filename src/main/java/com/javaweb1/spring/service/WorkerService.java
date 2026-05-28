package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateWorkerRequest;
import com.javaweb1.spring.entity.WorkerEntity;

import java.util.List;

public interface WorkerService {
    WorkerEntity createWorker(CreateWorkerRequest request);

    WorkerEntity getWorker(String id);

    List<WorkerEntity> listWorker();
}
