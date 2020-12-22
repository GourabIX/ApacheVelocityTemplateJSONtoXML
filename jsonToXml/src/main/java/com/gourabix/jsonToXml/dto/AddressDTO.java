package com.gourabix.jsonToXml.dto;

import java.io.Serializable;

/**
 * 
 * @author Gourab Sarkar
 *
 */

public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String city;

	private String country;

	private String planet;

	public AddressDTO() {
		// this default constructor is required for the purpose of serialization.
	}

	public AddressDTO(String city, String country, String planet) {
		this.city = city;
		this.country = country;
		this.planet = planet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

}
