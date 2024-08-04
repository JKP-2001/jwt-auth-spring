package com.example.authproject.util;

import java.util.Set;
import java.util.HashSet;

public class RoleUtils {

    private static final Set<String> VALID_ROLES = new HashSet<>(Set.of("USER", "ADMIN", "N_USER"));

    public static boolean isValidRole(String role) {
        return VALID_ROLES.contains(role);
    }
}

