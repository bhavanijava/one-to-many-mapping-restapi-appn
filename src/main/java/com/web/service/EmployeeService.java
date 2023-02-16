package com.web.service;

import java.util.*;

import com.web.dto.ResponseDTO;
import com.web.model.Employee;

public interface EmployeeService {

	public Employee saveEmp(Employee e);
	public void deleteEmp(Integer empId);
	public List<Employee> getAllEmps();
	public Employee getOne(Integer empId);
	public Employee updateEmp(Employee e,Integer empId);
	public List<ResponseDTO> getJoinInfo(); 
	public ResponseDTO getJoinInfoEmployee(Integer empId);
}
