package com.saludvision.medicanscanai_iam.interfaces.dto;

public class RegisterDto {

    private String name;
    private String email;
    private String password;
    private String dni;
    private String specialty;
    private String professionalId;
    private String hospital;
    private String phone;

    public RegisterDto(String name, String email, String password, String dni, String specialty, String professionalId, String hospital, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.specialty = specialty;
        this.professionalId = professionalId;
        this.hospital = hospital;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(String professionalId) {
        this.professionalId = professionalId;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
