package com.example.demo.common.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AbstractController;
import com.example.demo.common.security.model.LoginRequest;
import com.example.demo.common.security.model.response.ResponsePresent;
import com.example.demo.common.security.mongo.entity.User;
import com.example.demo.common.security.service.UserService;

@RestController
public class AuthenticateUser extends AbstractController {
	@Autowired
    private UserService userService;

	@PostMapping("/signin")
	public ResponsePresent authenticateUser(@RequestBody LoginRequest loginRequest) {
		User user = userService.authenticateUser(loginRequest);

		if(user != null)
			return responseOK(user);
		else
			return responseError("Invalid Username");
	}
}
