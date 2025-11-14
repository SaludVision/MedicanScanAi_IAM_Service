package com.saludvision.medicanscanai_iam.interfaces.controller;

import com.saludvision.medicanscanai_iam.application.mapper.LoginMapper;
import com.saludvision.medicanscanai_iam.application.mapper.RegisterMapper;
import com.saludvision.medicanscanai_iam.application.services.loginServices;
import com.saludvision.medicanscanai_iam.application.services.registerServices;
import com.saludvision.medicanscanai_iam.domain.User;
import com.saludvision.medicanscanai_iam.interfaces.dto.LoginDto;
import com.saludvision.medicanscanai_iam.interfaces.dto.RegisterDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/iam")
public class AuthController {

    private final registerServices servicioRegistro;
    private final RegisterMapper mapperRegistro;
    private final LoginMapper mapperLogin;
    private final loginServices servicioLogin;

    public AuthController(registerServices servicioRegistro, RegisterMapper mapperRegistro, LoginMapper mapperLogin, loginServices servicioLogin) {
        this.servicioRegistro = servicioRegistro;
        this.mapperRegistro = mapperRegistro;
        this.mapperLogin = mapperLogin;
        this.servicioLogin = servicioLogin;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registrar(@RequestBody final RegisterDto registerDto) {
        try {
            User userDomain = mapperRegistro.toEntity(registerDto);
            servicioRegistro.registerUser(userDomain);
            return ResponseEntity.ok("Usuario registrado exitosamente.");
        } catch (IllegalArgumentException e) {
            // Si el usuario ya existe
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            // Si ocurre otro error
            return ResponseEntity.internalServerError().body("Error al registrar el usuario.");
        }

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody final LoginDto loginDto) {
        System.out.println("Login: " + loginDto.getEmail());
        try {
            User userDomain = LoginMapper.toEntity(loginDto);
            System.out.println("Login Domain: " + userDomain.getEmail());

            if(this.servicioLogin.login(userDomain)){
                return ResponseEntity.ok("Usuario loggeado exitosamente.");
            }else{
                return ResponseEntity.ok("El usuario no existe");
            }


        }catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
