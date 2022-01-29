package com.dbb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbb.model.User;
import com.dbb.service.UserService;

@RestController
public class UserController {
	@Autowired()
	public UserService userService;

	@GetMapping("/userInfo")
	public User getDetails() {	
		return userService.getDetails();
	}
}
