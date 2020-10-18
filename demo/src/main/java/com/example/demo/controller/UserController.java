package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AbstractController;
import com.example.demo.model.response.ResponsePresent;
import com.example.demo.mongo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController extends AbstractController {
	@Autowired
    private UserService userService;

	@GetMapping("/users")
	public ResponsePresent getUsers() {
		List<User> users = userService.retrieveUsers();

		return responseOK(users);
	}
	
}
