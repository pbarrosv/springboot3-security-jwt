package com.securityjwt.springboot3.app.springboot3securityjwt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.securityjwt.springboot3.app.springboot3securityjwt.entities.User;
import com.securityjwt.springboot3.app.springboot3securityjwt.repositories.RoleRepository;
import com.securityjwt.springboot3.app.springboot3securityjwt.repositories.UserRepository;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repositoryU;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return repositoryU.findAll();
	}

	@Override
	@Transactional
	public User save(User user) {
		
		return repositoryU.save(user);
	}

}
