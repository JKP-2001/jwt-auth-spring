package com.example.authproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AuthResponse {
    private String username;
    private Set<String> roles;
    private String token;
}



