package com.nikhar.codingtest.productsignup.service;
import org.springframework.stereotype.Service;

import com.nikhar.codingtest.productsignup.modal.PaymentSchema;
import com.nikhar.codingtest.productsignup.repository.PaymentRepository;

@Service
public class PaymentService {

	private final PaymentRepository paymentRepository;

	public PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	
	// Use save method from curd-repository to save user data 

	public void savePaymentDetails(PaymentSchema payment) {

		paymentRepository.save(payment);

	}
}
