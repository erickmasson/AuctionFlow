package com.auction_flow.api.dtos;

import com.auction_flow.domain.enums.UserRole;

public record RegisterDTO(
        String name,
        String email,
        String password,
        UserRole role) {
}
