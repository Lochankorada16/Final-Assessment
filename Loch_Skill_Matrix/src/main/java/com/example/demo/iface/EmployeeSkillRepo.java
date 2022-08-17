package com.example.demo.iface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.*;

public interface EmployeeSkillRepo extends JpaRepository<EmployeeSkill, String> {

	@Query(nativeQuery = true,
			value = "select * from loch_emp_skills where skill_name=:skill and skill_experience=:experience")
	public List<EmployeeSkill> getByNameAndExperience(@Param("skill")String skill,
													   @Param("experience")String experience);
	
	public List<EmployeeSkill> findByApprovedBy(String qryName);
	
}
