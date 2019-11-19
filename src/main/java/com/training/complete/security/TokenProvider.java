package com.training.complete.security;

import org.springframework.security.core.Authentication;

public interface TokenProvider {
    boolean validateToken(String token);

    String getUsernameFromToken(String token);

    String generateToken(Authentication authentication);
}
