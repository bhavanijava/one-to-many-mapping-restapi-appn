package com.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	private String name;
	private String email;
	private Double salary;
	private Long mobile;
	
	@OneToMany(targetEntity=Address.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(referencedColumnName="empId",name="emp_Id")
	private List<Address> address;
	
}
