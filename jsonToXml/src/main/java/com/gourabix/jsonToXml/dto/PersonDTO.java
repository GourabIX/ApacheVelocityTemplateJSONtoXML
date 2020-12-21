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
	
	public PersonDTO() {
		// This default constructor remains for the purpose of serialization.
	}

	public PersonDTO(String name, String email) {
		this.name = name;
		this.email = email;
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

}
