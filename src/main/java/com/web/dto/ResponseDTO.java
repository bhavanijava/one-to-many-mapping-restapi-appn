package com.web.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO {
	
	private Integer empId;
	private String name;
	private String email;
	private String city;

}
