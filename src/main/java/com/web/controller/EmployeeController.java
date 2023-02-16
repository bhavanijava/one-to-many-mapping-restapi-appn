package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.dto.ResponseDTO;
import com.web.model.Employee;
import com.web.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee ed)
	{
		return service.saveEmp(ed);
	}
	
	@GetMapping("/findAll")
	public List<Employee> getAll()
	{
		return service.getAllEmps();
	}
	
	@GetMapping("/getOne/{empId}")
	public Employee getOne(@PathVariable Integer empId)
	{
		return service.getOne(empId);
	}
	
	@DeleteMapping("/delete/{empId}")
	public void deleteEmp(@PathVariable Integer empId)
	{
		service.deleteEmp(empId);
	}
	
	@GetMapping("/joinInfo")
	public List<ResponseDTO> joinInfo()
	{
		return service.getJoinInfo();
	}
	
	@GetMapping("/joinInfo/{empId}")
	public ResponseDTO joinInfoEmp(@PathVariable Integer empId)
	{
		return service.getJoinInfoEmployee(empId);
	}
}
