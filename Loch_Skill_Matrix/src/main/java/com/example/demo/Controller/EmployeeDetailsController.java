package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeDetailsService;

@RestController
@RequestMapping(path = "/api/v1")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService empservice;
	
	@GetMapping(path = "/employees")
	public List<EmployeeDetails> getAllEmployees(){
		
		return this.empservice.findAll();
	}
	
	@PostMapping(path="/addemployees")
	public EmployeeDetails addEmployeeDetails(@RequestBody EmployeeDetails entity) {
		
		return this.empservice.addEmployee(entity);
		
	}
	
	@GetMapping(path = "/srch/{name}")
	public EmployeeDetails findByName(@PathVariable("name") String name) {
		
		return this.empservice.srchByEmployeeName(name);
	}
	
 }
