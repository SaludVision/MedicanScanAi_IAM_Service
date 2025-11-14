package com.saludvision.medicanscanai_iam.infrastructure.repositories;


import com.saludvision.medicanscanai_iam.infrastructure.data.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user,Integer> {



    public user findByEmail(String email);
}
