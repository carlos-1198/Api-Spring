package com.shop.market.domain.dto;

public class AuthenticationRequest {
    private String jwt;

    public AuthenticationRequest(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
