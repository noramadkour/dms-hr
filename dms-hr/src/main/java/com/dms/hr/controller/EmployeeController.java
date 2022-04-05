package com.dms.hr.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dms.hr.entity.Employee;
import com.dms.hr.entity.EmployeeDto;
import com.dms.hr.service.EmployeeService;


@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping()
	public ResponseEntity<List<Employee>> findAll (){
		
		return ResponseEntity.ok( employeeService.findAll()) ;
	}
	
	@GetMapping("/filter")
	public ResponseEntity<List<Employee>> filter(@RequestParam Optional<String> empCode, @RequestParam Optional<Long> empId, @RequestParam Optional<Long> contractId, @RequestParam Optional<String> empName,
			@RequestParam Optional<Long> departmentId, @RequestParam Optional<Long> statusId, @RequestParam Optional<LocalDate> brithDate, @RequestParam Optional<Long> jobTitleId, @RequestParam Optional<String> brithCity, @RequestParam Optional<Long> managerId) {

		return ResponseEntity.ok(employeeService.filter(empCode, empId, contractId, empName, departmentId, statusId,
				brithDate, jobTitleId, brithCity, managerId));
	}
	
	
	@PostMapping("/filter")
	public ResponseEntity<List<Employee>> filter(@RequestBody EmployeeDto emp) {

		return ResponseEntity.ok(employeeService.filter(emp.getEmployeeCode(), emp.getId(), emp.getContractId(), emp.getName(), emp.getDepartmentId(), emp.getStatusId(),
				emp.getBrithDate(), emp.getJobTitleId(), emp.getBrithCity(), emp.getManagerId()));
	}
}
