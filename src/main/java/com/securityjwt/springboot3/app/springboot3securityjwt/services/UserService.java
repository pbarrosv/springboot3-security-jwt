package com.securityjwt.springboot3.app.springboot3securityjwt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.securityjwt.springboot3.app.springboot3securityjwt.entities.User;

public interface UserService {
	List<User> findAll();
	User save(User user);
}
