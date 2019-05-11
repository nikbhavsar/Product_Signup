package com.nikhar.codingtest.productsignup.repository;
import org.springframework.data.repository.CrudRepository;
import com.nikhar.codingtest.productsignup.modal.PaymentSchema;

public interface PaymentRepository extends CrudRepository<PaymentSchema, Integer> {

}
