package com.dhairya.crm.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Customer {
//	matching with the database fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String firstName;
	private String lastName;
	private String email;

//	constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
//	getter setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	ToString method
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + firstName + ", last_name=" + lastName + ", email=" + email
				+ "]";
	}

}