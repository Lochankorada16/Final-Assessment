package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeDesignation;

public interface EmployeeDesignationRepo extends JpaRepository<EmployeeDesignation, String> {

}
