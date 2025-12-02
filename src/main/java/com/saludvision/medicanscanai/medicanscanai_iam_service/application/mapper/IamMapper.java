package com.saludvision.medicanscanai.medicanscanai_iam_service.application.mapper;

import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.LoginRequest;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.LoginResponse;
import com.saludvision.medicanscanai.medicanscanai_iam_service.application.dto.RegisterRequest;
import com.saludvision.medicanscanai.medicanscanai_iam_service.domain.Users;
import com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.data.iamCredential;
import org.springframework.stereotype.Component;

@Component
public class IamMapper {

    public Users toEntity(RegisterRequest dto) {
        Users users = new Users();
        users.setNombre(dto.getNombre());
        users.setCorreo(dto.getCorreo());
        users.setDni(dto.getDni());
        users.setEspecialidad(dto.getEspecialidad());
        users.setPassword(dto.getPassword());
        users.setIdProfesional(dto.getIdProfesional());
        users.setHospital(dto.getHospital());
        users.setTelefonoContacto(dto.getTelefonoContacto());
        return users;
    }

    public Users toEntity(LoginRequest dto){
        Users users = new Users();
        users.setCorreo(dto.getCorreo());
        users.setPassword(dto.getPassword());
        return users;

    }

    public LoginResponse generateResponse(Users users, String message){
        LoginResponse response = new LoginResponse();
        response.setUserId(users.getId());
        response.setMensaje(message);
        return response;
    }

    public iamCredential toDatabase(Users user){
        iamCredential credential = new iamCredential();
        credential.setCorreo(user.getCorreo());
        credential.setPassword(user.getPassword());
        return credential;
    }

    public Users toEntity(iamCredential credential){
        Users users = new Users();
        users.setId(credential.getId());
        users.setCorreo(credential.getCorreo());
        users.setPassword(credential.getPassword());
        return users;
    }


}
/*  private String nombre;
    private String correo;
    private String dni;
    private String especialidad;
    private String password;
    private String idProfesional;
    private String hospital;
    private String telefonoContacto;
*/