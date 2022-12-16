package com.eaiesb.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
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
	

}
