package com.example.backend_pnm.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}