package com.saludvision.medicanscanai_iam.application.services;

import com.saludvision.medicanscanai_iam.domain.User;
import com.saludvision.medicanscanai_iam.infrastructure.data.user;
import com.saludvision.medicanscanai_iam.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class registerServices{

    private final UserRepository userRepository;


    public registerServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User usuarioRegistrado) {

        user existingUser = userRepository.findByEmail(usuarioRegistrado.getEmail());
        if (existingUser != null) {
            throw new IllegalArgumentException("El nombre de usuario ya existe.");
        }

        user nuevoUser = new user();
        nuevoUser.setEmail(usuarioRegistrado.getEmail());
        nuevoUser.setPassword(usuarioRegistrado.getPassword());
        userRepository.save(nuevoUser);
    }

}
