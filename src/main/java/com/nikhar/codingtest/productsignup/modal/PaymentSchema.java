package com.nikhar.codingtest.productsignup.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="payment")
public class PaymentSchema {

	// data fields
	// including NotNull and size to validate the fields

	@Id
	private int id;
	
	@NotNull
	@Size(min = 2, max = 12)
	private int creditCardNumber;
	
	// Used @JsonProperty(access = Access.WRITE_ONLY) for hiding the data in payload 

	@NotNull
	@Size(min = 2, max = 2)
	@JsonProperty(access = Access.WRITE_ONLY)
	private int expiryMonth;

	@NotNull
	@Size(min = 2, max = 2)
	@JsonProperty(access = Access.WRITE_ONLY)
	private int expiryYear;

	@NotNull
	@Size(min = 3, max = 3)
	@JsonProperty(access = Access.WRITE_ONLY)
	private int cvv;

	@NotNull
	private String address;

	// default constructor

	public PaymentSchema() {

	}

	// All argument constructor

	public PaymentSchema(int creditCardNumber, int expiryMonth, int expiryYear, int cvv, String address) {
		super();

		this.creditCardNumber = creditCardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
		this.address = address;
	}

	// getters and setters for the fields

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
