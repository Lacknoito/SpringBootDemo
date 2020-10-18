package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mongo.entity.User;
import com.example.demo.mongo.repository.UserRepository;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;
	
	public List<User> retrieveUsers() {
        return userRepository.findAll();
    }
}
