package com.example.authproject.dto;

import lombok.*;
import java.util.Set;


@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LoginRequest {
    private String email;
    private String password;
    private Set<String> roles;
}
