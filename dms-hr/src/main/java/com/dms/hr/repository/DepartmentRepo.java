package com.dms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dms.hr.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long>  {

}
