package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.SkillReference;

public interface SkillReferenceRepo extends JpaRepository<SkillReference, Integer> {

	@Query(value="select * from loch_skill_reference where skill_name=:name", nativeQuery = true)
	public SkillReference findByName(@Param("name")String skillName);
}
