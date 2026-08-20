package com.auction_flow.api.dtos;

public record AuthenticationDTO(
        String email, String password
) {
}
