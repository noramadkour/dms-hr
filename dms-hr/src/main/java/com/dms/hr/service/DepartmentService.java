package com.dms.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.hr.entity.Department;
import com.dms.hr.repository.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	public Department findById(Long id) {

		return departmentRepo.findById(id).orElse(null);
	}

	public Department getById(Long id) {

		return departmentRepo.getById(id);
	}

	public List<Department> findAll() {

		return departmentRepo.findAll();
	}

	public Department insert(Department entity) {

		if (entity.getId() != null) {

			throw new RuntimeException();
		}

		return departmentRepo.save(entity);
	}

	public List<Department> insertAll(List<Department> entity) {

		return departmentRepo.saveAll(entity);
	}

	public Department update(Department entity) {

		return departmentRepo.save(entity);
	}

	public void deleteById(Long id) {

		departmentRepo.deleteById(id);
	}

}
