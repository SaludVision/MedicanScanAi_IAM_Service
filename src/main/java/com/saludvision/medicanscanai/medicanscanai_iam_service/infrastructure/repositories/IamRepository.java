package com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.repositories;

import com.saludvision.medicanscanai.medicanscanai_iam_service.infrastructure.data.iamCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IamRepository extends JpaRepository<iamCredential,Integer> {
    public iamCredential findByCorreo(String email);

}
