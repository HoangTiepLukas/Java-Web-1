package com.javaweb1.spring.controller;

import com.javaweb1.spring.dto.CreateWorkerRequest;
import com.javaweb1.spring.dto.WorkerDTO;
import com.javaweb1.spring.service.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public WorkerDTO createWorker(@RequestBody CreateWorkerRequest request) {
        return workerService.createWorker(request);
    }

    @GetMapping("/{id}")
    public WorkerDTO getWorker(@PathVariable String id) {
        return workerService.getWorker(id);
    }

    @GetMapping
    public List<WorkerDTO> listWorkers() {
        return workerService.listWorker();
    }
}
