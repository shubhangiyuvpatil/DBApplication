package com.dbb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dbb.model.User;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;

	public User getDetails() {
		User user = restTemplate.getForObject("http://localhost:4001/userList", User.class);
		return user;
	}

}
