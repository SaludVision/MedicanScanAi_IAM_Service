package com.saludvision.medicanscanai_iam.application.mapper;

import com.saludvision.medicanscanai_iam.domain.User;
import com.saludvision.medicanscanai_iam.interfaces.dto.RegisterDto;
import org.springframework.stereotype.Component;

@Component
public class RegisterMapper {

    public RegisterMapper(){}

    public static User toEntity(RegisterDto registerDto) {
        User user = new User(
            registerDto.getName(),
            registerDto.getEmail(),
            registerDto.getPassword(),
            registerDto.getDni(),
            registerDto.getSpecialty(),
            registerDto.getProfessionalId(),
            registerDto.getHospital(),
            registerDto.getPhone()
        );
        return user;
    }

}
/*
    public User(String name, String email, String password, String dni, String specialty, String professionalId, String hospital, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.specialty = specialty;
        this.professionalId = professionalId;
        this.hospital = hospital;
        this.phone = phone;
    }*/