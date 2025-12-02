package com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto;

public class RegisterRequest {
    
    private String nombre;
    private String correo;
    private String dni;
    private String especialidad;
    private String password;
    private int idProfesional;
    private String hospital;
    private String telefonoContacto;

    public RegisterRequest() {
    }

    public RegisterRequest(String nombre, String correo, String dni, String especialidad, String password, int idProfesional, String hospital, String telefonoContacto) {
        this.nombre = nombre;
        this.correo = correo;
        this.dni = dni;
        this.especialidad = especialidad;
        this.password = password;
        this.idProfesional = idProfesional;
        this.hospital = hospital;
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
}
