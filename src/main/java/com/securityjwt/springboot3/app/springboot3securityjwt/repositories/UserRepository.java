package com.securityjwt.springboot3.app.springboot3securityjwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityjwt.springboot3.app.springboot3securityjwt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
