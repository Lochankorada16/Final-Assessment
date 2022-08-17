package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.service.EmployeeDesignationService;

@RestController
@RequestMapping(path="/api/v2")
public class EmployeeDesignationController {

	@Autowired
	private EmployeeDesignationService service;
	
	@PostMapping(path="/add/empDesig")
	public EmployeeDesignation addUser(@RequestBody EmployeeDesignation entity) {
		return this.service.addEmpDesig(entity);
	}
	
	@GetMapping(path="/empDesig")
	public List<EmployeeDesignation> getUser() {
		return service.getEmpDesig();	
	}
	
	@PutMapping(path="/update/employeeDesig")
	public ResponseEntity<EmployeeDesignation> updateEmployeeDesignation(@RequestBody EmployeeDesignation empDetails) {
		return ResponseEntity.status(201).body(empDetails);
	}
}
