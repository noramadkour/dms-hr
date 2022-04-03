package com.dms.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dms.hr.entity.Status;
import com.dms.hr.repository.StatusRepo;

@Service
public class StatusService {

	@Autowired
	private StatusRepo statusRepo;

	public Status findById(Long id) {

		return statusRepo.findById(id).orElse(null);
	}

	public Status getById(Long id) {

		return statusRepo.getById(id);
	}

	public List<Status> findAll() {

		return statusRepo.findAll();
	}

	public Status insert(Status entity) {

		if (entity.getId() != null) {

			throw new RuntimeException();
		}

		return statusRepo.save(entity);
	}

	public List<Status> insertAll(List<Status> entity) {

		return statusRepo.saveAll(entity);
	}

	public Status update(Status entity) {

		return statusRepo.save(entity);
	}

	public void deleteById(Long id) {

		statusRepo.deleteById(id);
	}

}
