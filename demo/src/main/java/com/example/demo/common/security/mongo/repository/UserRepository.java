package com.example.demo.common.security.mongo.repository;

import com.example.demo.common.security.model.LoginRequest;
import com.example.demo.common.security.mongo.entity.User;

public interface UserRepository{
	public User getUser(LoginRequest loginRequest);
}
