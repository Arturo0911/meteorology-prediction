package com.microservice.authentication.Authentication.daos;

import com.microservice.authentication.Authentication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {


    Optional<User> findUserByEmail(String email);

    @Override
    ArrayList<User> findAll();

    void deleteByEmail(String email);

}
