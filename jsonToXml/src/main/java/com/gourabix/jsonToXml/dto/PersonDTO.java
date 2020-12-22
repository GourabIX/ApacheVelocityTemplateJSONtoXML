package com.gourabix.jsonToXml.dto;

import java.io.Serializable;

/**
 * 
 * @author Gourab Sarkar
 *
 */

public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String email;
	
	private AddressDTO address;
	
	public PersonDTO() {
		// This default constructor remains for the purpose of serialization.
	}

	public PersonDTO(String name, String email, AddressDTO address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

}
