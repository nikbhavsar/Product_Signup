package com.nikhar.codingtest.productsignup.repository;
import org.springframework.data.repository.CrudRepository;
import com.nikhar.codingtest.productsignup.modal.User;

public interface RegistrationRepository extends CrudRepository<User, Integer> {
    public User findByName(String name);
}
