package com.nikhar.codingtest.productsignup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nikhar.codingtest.productsignup.modal.User;
import com.nikhar.codingtest.productsignup.repository.RegistrationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductSignupApplicationTests {

	//Sample unit test to find if our data is saved into the database and they are stored correctly
	//by finding the user's name 
	
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private RegistrationRepository employeeRepository;
    
    @Test
	public void contextLoads() {
		 User nikhar = new User("Nikhar");
		    entityManager.persist(nikhar);
		    entityManager.flush();
		 
		    // when
		    User found = employeeRepository.findByName(nikhar.getName());
		 
		    // then
		    assertThat(found.getName())
		      .isEqualTo(nikhar.getName());
	}
	
}
