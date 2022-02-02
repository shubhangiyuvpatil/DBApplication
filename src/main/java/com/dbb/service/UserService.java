package com.dbb.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.dbb.model.User;
import com.dbb.util.FromAccountNumberSorting;
import com.dbb.util.ToAccountNumberSorting;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;

	public User getDetails() {
		User user = restTemplate.getForObject("http://localhost:4001/userList", User.class);

		user.getFromAccounts();

		Collections.sort(user.getFromAccounts(), new FromAccountNumberSorting());
		Collections.sort(user.getToAccounts(), new ToAccountNumberSorting());

		return user;
	}

}
