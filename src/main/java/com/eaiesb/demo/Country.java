package com.eaiesb.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Country")
public class Country {
	@Id
	public String id;
	
	private String Country_id;
	private String Country_name;
	private String Region_id;
	
	public Country(String Country_id, String Country_name, String Region_id ) {
		this.Country_id= Country_id;
		this.Country_name= Country_name;
		this.Region_id= Region_id;
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry_id() {
		return Country_id;
	}

	public void setCountry_id(String country_id) {
		Country_id = country_id;
	}

	public String getCountry_name() {
		return Country_name;
	}

	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}

	public String getRegion_id() {
		return Region_id;
	}

	public void setRegion_id(String region_id) {
		Region_id = region_id;
	}
	

}
