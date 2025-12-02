package com.saludvision.medicanscanai.medicanscanai_iam_service.interfaces.Controller;


import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.LoginRequest;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.LoginResponse;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.RegisterRequest;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.RegisterResponse;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.mapper.IamMapper;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.services.IamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/iam")
public class IamController {

    private final IamService iamService;
    private final IamMapper iamMapper;

    public IamController(IamService iamService, IamMapper iamMapper) {
        this.iamService = iamService;
        this.iamMapper = iamMapper;
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        int centinela = iamService.registro(iamMapper.toEntity(registerRequest));
        RegisterResponse registerResponse = new RegisterResponse();
        switch (centinela){
            case 0:
                registerResponse.setResponse("Registro fallido");
                return ResponseEntity.badRequest().body(registerResponse);
            case 1:
                registerResponse.setResponse("Registro Exitoso");
                return ResponseEntity.ok(registerResponse);
            default:
                registerResponse.setResponse("Registro fallido");
                return ResponseEntity.badRequest().body(registerResponse);
        }

    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        int userId = iamService.login(iamMapper.toEntity(loginRequest));
        LoginResponse loginResponse = new LoginResponse();
        if(userId == 0){
            loginResponse.setMensaje("Correo o Contrasenia incorrecto");
            loginResponse.setUserId(userId);
            return ResponseEntity.badRequest().body(loginResponse);
        }else{
            loginResponse.setMensaje("Login Exitoso");
            loginResponse.setUserId(userId);
            return ResponseEntity.ok(loginResponse);
        }

    }


}
