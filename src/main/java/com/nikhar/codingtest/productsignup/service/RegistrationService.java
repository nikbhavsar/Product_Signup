package com.nikhar.codingtest.productsignup.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nikhar.codingtest.productsignup.modal.User;
import com.nikhar.codingtest.productsignup.repository.RegistrationRepository;

@Service
@Transactional
public class RegistrationService {

	private final RegistrationRepository registrationRepository;

	public RegistrationService(RegistrationRepository registrationRepository) {
		this.registrationRepository = registrationRepository;
	}

	// Use save method from curd-repository to save user data

	public void saveUserDetails(User user) {

		registrationRepository.save(user);

	}

}
