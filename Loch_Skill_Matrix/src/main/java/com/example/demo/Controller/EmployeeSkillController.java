package com.example.demo.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping(path = "/api/v1")
public class EmployeeSkillController {
	
	@Autowired
	private EmployeeSkillService service;
	
	@Autowired
	private EmployeeDetailsService empservice;
	
	@PostMapping(path = "/skills")
	public EmployeeSkill addSkills(@RequestBody EmployeeSkill entity) {
		
		EmployeeSkill skills = this.service.add(entity);
		
		return skills;
	}
	
	@GetMapping(path = "/findskills")
	public List<EmployeeSkill> getAllSkills(){
		
		return this.service.findAll();
	}

	@GetMapping(path = "/skills/{skill}/{experience}")
	public List<EmployeeSkill> getEmpBySkillAndExp(@PathVariable("skill")String skill,@PathVariable("experience")String experience)
	{
		List<EmployeeSkill> list=this.service.getBySkillNameAndExperience(skill, experience);
		return list;

	}
	
	@GetMapping(path = "/skills/{approve}")
	public List<EmployeeSkill> getSkillsByApprove(@PathVariable("approve") String approve) {
		
		return this.service.getByApprovedBy(approve);
	}
	
	@GetMapping(path = "skills/srch/{name}")
	public EmployeeSkill getSkillsByName(@PathVariable("name") String name) {
		
		return this.service.findByName(name);
	}
}
