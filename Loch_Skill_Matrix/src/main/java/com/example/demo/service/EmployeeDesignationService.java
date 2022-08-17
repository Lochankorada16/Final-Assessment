package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.iface.EmployeeDesignationRepo;

@Service
public class EmployeeDesignationService {

	@Autowired
	public EmployeeDesignationRepo repo;
	
	public List<EmployeeDesignation> getEmpDesig() {
		
		return this.repo.findAll();
	}
	 public EmployeeDesignation addEmpDesig(EmployeeDesignation entity) {
			
			return this.repo.save(entity);
		}
}
