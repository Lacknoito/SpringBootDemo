package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AbstractController;
import com.example.demo.model.response.ResponsePresent;

@RestController
public class UserController extends AbstractController {

	@GetMapping("/users")
	public ResponsePresent getUsers() {
		return responseOK("S");
	}
	
}
