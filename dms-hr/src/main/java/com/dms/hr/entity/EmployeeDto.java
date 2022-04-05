package com.dms.hr.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {

	private Long id;

	private String employeeCode;
	private String name;

	private Long managerId;

	private LocalDate brithDate;

	private String brithCity;

	private Long departmentId;

	private Long jobTitleId;

	private Long statusId;

	private Long contractId;

}
