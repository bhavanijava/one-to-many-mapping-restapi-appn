package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dto.ResponseDTO;
import com.web.model.Employee;
import com.web.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee saveEmp(Employee e) {
		return repo.save(e);
	}

	@Override
	public void deleteEmp(Integer empId) {
		repo.deleteById(empId);
	}

	@Override
	public List<Employee> getAllEmps() {
		return repo.findAll();
	}

	@Override
	public Employee getOne(Integer empId) {
		return repo.findById(empId).get();
	}

	@Override
	public Employee updateEmp(Employee e, Integer empId) {
		return null;
	}

	@Override
	public List<ResponseDTO> getJoinInfo() {
		return repo.joinInfo();
	}

	@Override
	public ResponseDTO getJoinInfoEmployee(Integer empId) {
		return repo.joinInfo().get(empId);
	}

}
