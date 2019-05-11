package com.nikhar.codingtest.productsignup.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhar.codingtest.productsignup.modal.PaymentSchema;
import com.nikhar.codingtest.productsignup.modal.User;
import com.nikhar.codingtest.productsignup.service.PaymentService;
import com.nikhar.codingtest.productsignup.service.RegistrationService;

@RestController
public class OrchestrationController {

	@Autowired
	RegistrationService registrationService;
	
	@Autowired
	PaymentService paymentService;


	// Displaying registration page for Initial route
	
	@RequestMapping("/")
	public String Registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOMEPAGE");
		return "registration";
	}
	
	// Sending user to the registration form
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "registration";
}
	
	//Getting user's entered data and store it to database then send user to registration page

	@PostMapping("/register-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		registrationService.saveUserDetails(user);
		request.setAttribute("mode", "MODE_PAYMENT");
		return "registration";
	}
	
	//Getting user's entered data and store it to database then send user to registration page

	@PostMapping("/finish-payment")
	public String finishPayment(@ModelAttribute PaymentSchema payment, BindingResult bindingResult, HttpServletRequest request) {
		paymentService.savePaymentDetails(payment);
		request.setAttribute("mode", "MODE_HOMEPAGE");
		return "registration";
	}

}
