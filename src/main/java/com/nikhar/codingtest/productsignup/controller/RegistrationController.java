package com.nikhar.codingtest.productsignup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nikhar.codingtest.productsignup.modal.User;
import com.nikhar.codingtest.productsignup.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	

	@GetMapping("/register")
	public String saveUser(@RequestParam String username, @RequestParam String name, @RequestParam String address,
			@RequestParam String email, @RequestParam String password) {
		
		User user = new User(username, name, address, email, password);
		registrationService.saveUserDetails(user);

		return "user saved";
	}
	
}
