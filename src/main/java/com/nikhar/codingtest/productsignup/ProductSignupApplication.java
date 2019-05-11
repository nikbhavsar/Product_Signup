package com.nikhar.codingtest.productsignup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nikhar.codingtest.productsignup.repository.PaymentRepository;
import com.nikhar.codingtest.productsignup.repository.RegistrationRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {RegistrationRepository.class , PaymentRepository.class})
public class ProductSignupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSignupApplication.class, args);
	}

}
