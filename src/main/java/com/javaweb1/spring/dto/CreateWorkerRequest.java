package com.javaweb1.spring.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateWorkerRequest {
    @NotBlank
    @NotNull
    public String supplierId;

    @NotBlank
    public String name;

    @NotBlank
    @Email
    public String email;

    @NotBlank
    public String password;

    public String role;
}
