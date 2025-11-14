package com.saludvision.medicanscanai_iam.application.services;

import com.saludvision.medicanscanai_iam.domain.User;
import com.saludvision.medicanscanai_iam.infrastructure.data.user;
import com.saludvision.medicanscanai_iam.infrastructure.repositories.UserRepository;
import com.saludvision.medicanscanai_iam.interfaces.dto.LoginDto;
import org.springframework.stereotype.Service;

@Service
public class loginServices {

    private final UserRepository userRepository;

    public loginServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(User logeo) {
        user user = userRepository.findByEmail(logeo.getEmail());
        System.out.println(user);
        if(logeo.getPassword().equals(user.getPassword())) {
            return true;
        }

        return false;

    }
}
