package com.dms.hr.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dms.hr.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long > {
	
	
	@Query("select emp from Employee emp "
			+ "where (:empCode is null or emp.employeeCode like :empCode)"
			+ "and   (:empId is null or emp.id = :empId) "
			+ "and   (:empName is null or emp.name like :empName) "
			+ "and   (:departmentId is null or department.id like :departmentId) "
			+ "and   (:statusId is null or status.id like :statusId) "
			+ "and   (:brithDate is null or brithDate like :brithDate) "
			+ "and   (:brithCity is null or brithCity like :brithCity) "
			+ "and   (:jobTitleId is null or jobTitle.id like :jobTitleId) "
			+ "and   (:managerId is null or manager.id like :managerId) "
			+ "and   (:contractId is null or emp.contract.id = :contractId) ")
	List<Employee> filter (String empCode, Long empId, Long contractId, String empName, Long departmentId,
			Long statusId, LocalDate brithDate, Long jobTitleId, String brithCity, Long managerId);

}
