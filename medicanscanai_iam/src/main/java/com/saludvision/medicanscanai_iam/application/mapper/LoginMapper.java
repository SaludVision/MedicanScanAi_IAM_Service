package com.saludvision.medicanscanai_iam.application.mapper;

import com.saludvision.medicanscanai_iam.domain.User;
import com.saludvision.medicanscanai_iam.interfaces.dto.LoginDto;
import org.springframework.stereotype.Component;

@Component
public class LoginMapper {

    public static User toEntity (LoginDto loginDto) {
        User usuario = new User(
                loginDto.getEmail(),
                loginDto.getPassword()
        );
        return usuario;
    }

}
