package com.nikhar.codingtest.productsignup.service;
import com.nikhar.codingtest.productsignup.modal.PaymentSchema;
import com.nikhar.codingtest.productsignup.repository.PaymentRepository;

public class PaymentService {
private final PaymentRepository paymentRepository;
	
	public PaymentService(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}
	
	public void savePaymentDetails(PaymentSchema payment) {
		
		paymentRepository.save(payment);
		
	}
}
