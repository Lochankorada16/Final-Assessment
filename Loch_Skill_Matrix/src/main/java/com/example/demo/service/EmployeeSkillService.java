package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkill;
import com.example.demo.iface.EmployeeSkillRepo;

@Service
public class EmployeeSkillService {
	
	@Autowired
	private EmployeeSkillRepo repo;
	
	@Autowired
	private EmployeeDetailsService empservice;
	
		public EmployeeSkill add(EmployeeSkill entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}
	
		public List<EmployeeSkill> findAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

		public List<EmployeeSkill> getBySkillNameAndExperience(String skill, String experience) {
		
		return this.repo.getByNameAndExperience(skill, experience);
	
	}
		
		public List<EmployeeSkill> getByApprovedBy(String approve){
		
		return this.repo.findByApprovedBy(approve);
	}
		
		public EmployeeSkill findByName(@PathVariable("name")String name)
		{
			EmployeeDetails emp= empservice.srchByEmployeeName(name);
			
			List<EmployeeSkill> list= findAll();
			
			for(EmployeeSkill em:list)
			{
				if(em.getEmpId()==emp.getEmployeeId())
				{
					return em;
				}
			}
			return null;
		}
		
}
