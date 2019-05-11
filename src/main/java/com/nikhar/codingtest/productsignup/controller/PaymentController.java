package com.nikhar.codingtest.productsignup.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nikhar.codingtest.productsignup.modal.PaymentSchema;
import com.nikhar.codingtest.productsignup.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	

	@GetMapping("/payment")
	public String saveUser(@RequestParam int cardNumber, @RequestParam int expiryMonth, @RequestParam int expiryYear,
			@RequestParam int cvv, @RequestParam String address) {
		
		PaymentSchema payment = new PaymentSchema(cardNumber, expiryMonth, expiryYear, cvv, address);
		paymentService.savePaymentDetails(payment);

		return "Payment done successfully";
	}
	
}


