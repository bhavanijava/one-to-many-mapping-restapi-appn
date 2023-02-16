package com.web.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Address {

	@Id
	private Integer houseNumber;
	private String street;
	private String city;
	private int pincode;
}
