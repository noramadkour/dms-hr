package com.dms.hr.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dms.hr.entity.Employee;
import com.dms.hr.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee findById(Long id) {

		return employeeRepo.findById(id).orElse(null);
	}

	public Employee getById(Long id) {

		return employeeRepo.getById(id);
	}

	public List<Employee> findAll() {

		return employeeRepo.findAll();
	}
	
	public List<Employee> filter ( Optional<String> empCode,  Optional<Long> empId,  Optional<Long> contractId,  Optional<String> empName,  Optional<Long> departmentId,
			 Optional<Long> statusId,  Optional<LocalDate> brithDate,  Optional<Long> jobTitleId,  Optional<String> brithCity,  Optional<Long> managerId){
		
		return employeeRepo.filter(empCode.isEmpty() ? null : empCode.get() , empId.isEmpty() ? null : empId.get() 
				, contractId.isEmpty() ? null : contractId.get(), empName.isEmpty() ? null : empName.get(),
						departmentId.isEmpty() ? null : departmentId.get(), statusId.isEmpty() ? null : statusId.get(), brithDate.isEmpty() ? null : brithDate.get()
								, jobTitleId.isEmpty() ? null : jobTitleId.get(), brithCity.isEmpty() ? null :brithCity.get(), managerId.isEmpty() ? null : managerId.get());
	}

	public Employee insert(Employee entity) {

		if (entity.getId() != null) {

			throw new RuntimeException();
		}

		return employeeRepo.save(entity);
	}

	public List<Employee> insertAll(List<Employee> entity) {

		return employeeRepo.saveAll(entity);
	}

	public Employee update(Employee entity) {

		return employeeRepo.save(entity);
	}

	public void deleteById(Long id) {

		employeeRepo.deleteById(id);
	}

}
