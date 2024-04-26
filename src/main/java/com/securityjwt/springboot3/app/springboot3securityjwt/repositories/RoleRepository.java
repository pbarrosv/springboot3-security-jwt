package com.securityjwt.springboot3.app.springboot3securityjwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityjwt.springboot3.app.springboot3securityjwt.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(String name);
}
