package com.nikhar.codingtest.productsignup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nikhar.codingtest.productsignup.modal.User;
import com.nikhar.codingtest.productsignup.service.RegistrationService;

@Controller
public class ApplicationController {

	@Autowired
	RegistrationService registrationService;

	// Initial route for webpage 
	
	@RequestMapping("/")
	public String Registration() {
		return "registration";
	}
	
	//Getting user Data and sending user back to registration page

	@PostMapping("/register-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		registrationService.saveUserDetails(user);
		return "registration";
	}
}
