package com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto;


public class LoginResponse {

    private int userId;
    private String mensaje;

    public LoginResponse() {
    }

    public LoginResponse(int userId, String mensaje) {
        this.userId = userId;
        this.mensaje = mensaje;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
