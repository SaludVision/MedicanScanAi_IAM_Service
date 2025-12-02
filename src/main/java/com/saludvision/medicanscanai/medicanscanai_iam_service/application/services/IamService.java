package com.saludvision.medicanscanai.medicanscanai_iam_service.application.services;

import com.saludvision.medicanscanai.medicanscanai_iam_service.application.mapper.IamMapper;
import com.saludvision.medicanscanai.medicanscanai_iam_service.domain.Users;
import com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.data.iamCredential;
import com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.repositories.IamRepository;
import org.springframework.stereotype.Service;

@Service
public class IamService {
    public final IamRepository IamRepository;
    public final IamMapper mapper;


    public IamService(com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.repositories.IamRepository iamRepository, IamMapper mapper) {
        IamRepository = iamRepository;
        this.mapper = mapper;
    }

    public int registro(Users user){
        iamCredential db = new iamCredential();
        if(IamRepository.findByCorreo(user.getCorreo()) != null){
            return 0; //usuario existe con correo
        }else{
            db = mapper.toDatabase(user);
            IamRepository.save(db);
            return 1; //usuario no existe
        }
    }

    public int login(Users user){
        Users buscador = mapper.toEntity(IamRepository.findByCorreo(user.getCorreo()));
        if(buscador!=null){
            if(buscador.getPassword().equals(user.getPassword())){
                return buscador.getId();
            }else{
                return 0;
            }
        }else {
            return 0;
        }
    }
}
