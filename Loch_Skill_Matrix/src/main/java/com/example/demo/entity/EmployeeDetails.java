package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "loch_emp_details")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDetails {

	@Id
	@Column(name = "employee_id")
	int employeeId;
	
	@Column(name = "employee_name")
	String employeeName;
	
	@Column(name = "employee_desig_id")
	int employeeDesignationId;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "date_of_joining")
	LocalDate dateOfJoining;
	
	@Column(name = "manager_name")
	String manager;
}
