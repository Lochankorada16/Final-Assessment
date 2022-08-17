package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.iface.EmployeeDetailsRepo;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepo repo;
	
	public EmployeeDetails addEmployee(EmployeeDetails entity) {
		
		return this.repo.save(entity);
	}
	
//	public List<EmployeeDetails> updateByDetails(String managername,int empid){
//		
//		return this.repo.updateEmployeeDetails(managername, empid);	
//		
//	}
	
	public List<EmployeeDetails> findAll(){
		
		return this.repo.findAll();
	}
	
	public EmployeeDetails srchByEmployeeName(String name) {
		
		return this.repo.findByEmployeeName(name);
	}
	
}
