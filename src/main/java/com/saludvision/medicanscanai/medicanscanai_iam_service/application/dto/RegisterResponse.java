package com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto;

public class RegisterResponse {

    private String response;

    public RegisterResponse() {
    }

    public RegisterResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
