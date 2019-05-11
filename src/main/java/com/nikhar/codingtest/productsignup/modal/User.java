package com.nikhar.codingtest.productsignup.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


//Database table name will be user-info in mySQL database

@Entity
@Table(name = "user-info")
public class User {

	// data fields
	// including NotNull and size to validate the fields

	@Id
	private int id;

	@NotNull
	@Size(max = 8)
	private String username;
	
	// Use @JsonProperty(access = Access.WRITE_ONLY) for hiding the data in payload 

	@NotNull
	@JsonProperty(access = Access.WRITE_ONLY)
	private String name;

	@NotNull
	private String address;

	@NotNull
	private String email;
	
	// Used @JsonProperty(access = Access.WRITE_ONLY) for hiding the data in payload 

	@NotNull
	@Size(min = 8)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	
	// default constructor

	public User() {}
	

	// All argument constructor

	public User(String username, String name, String address, String email, String password) {
		super();
		this.username = username;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	
	// getters and setters for the fields


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
	
	//Tostring method

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", address=" + address + ", email="
				+ email + ", password=" + password + "]";
	}

}
