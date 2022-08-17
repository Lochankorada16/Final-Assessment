package com.example.demo.iface;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeDetails;

public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails, Integer> {

//	@Query(value ="update loch_emp_details set manager_name=:manager where employee_id=:empID",nativeQuery = true)
//	@Modifying
//	@Transactional
//	public List<EmployeeDetails> updateEmployeeDetails(@Param("manager")String managername,@Param("empID") int empid);
	
	public EmployeeDetails findByEmployeeName(String name);
}
