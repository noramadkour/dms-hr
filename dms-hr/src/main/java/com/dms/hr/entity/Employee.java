package com.dms.hr.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "hr_employees" )
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String employeeCode;
	private String name;
	
	@ManyToOne()
	@JoinColumn(name = "manager_id")
	private Employee manager;
	
	private LocalDate brithDate;
	
	private String brithCity;
	
	@ManyToOne()
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private Job jobTitle;
	
	@ManyToOne()
	@JoinColumn(name = "status_id")
	private Status status;
	
	@ManyToOne()
	@JoinColumn(name = "contract_id")
	private Contract contract;
	

}
