package com.javaweb1.spring.service;

import com.javaweb1.spring.dto.CreateWorkerRequest;
import com.javaweb1.spring.dto.WorkerDTO;

import java.util.List;

public interface WorkerService {
    WorkerDTO createWorker(CreateWorkerRequest request);

    WorkerDTO getWorker(String id);

    List<WorkerDTO> listWorker();
}
