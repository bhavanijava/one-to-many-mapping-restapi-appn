package com.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.dto.ResponseDTO;
import com.web.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("select new com.web.dto.ResponseDTO(e.empId,e.name,e.email,a.city) from Employee e JOIN e.address a")
	public List<ResponseDTO> joinInfo();
}
