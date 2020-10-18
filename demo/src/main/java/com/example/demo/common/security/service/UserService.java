package com.example.demo.common.security.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.security.model.LoginRequest;
import com.example.demo.common.security.mongo.entity.User;
import com.example.demo.common.security.mongo.repository.UserRepository;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;
	
	public User authenticateUser(LoginRequest loginRequest) {
        return userRepository.getUser(loginRequest);
    }
}
