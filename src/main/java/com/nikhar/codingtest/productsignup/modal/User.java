package com.nikhar.codingtest.productsignup.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user-info")
public class User {

	@Id
	private int id;
	private String username;
	private String name;
	private String address;
	private String email;
	private String password;
	
	public User() {
		
	}

	public User(String username, String name, String address, String email, String password) {
		super();
		this.username = username;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", address=" + address + ", email="
				+ email + ", password=" + password + "]";
	}

}
