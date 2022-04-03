package com.dms.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.hr.entity.Job;
import com.dms.hr.repository.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo jobRepo;

	public Job findById(Long id) {

		return jobRepo.findById(id).orElse(null);
	}

	public Job getById(Long id) {

		return jobRepo.getById(id);
	}

	public List<Job> findAll() {

		return jobRepo.findAll();
	}

	public Job insert(Job entity) {

		if (entity.getId() != null) {

			throw new RuntimeException();
		}

		return jobRepo.save(entity);
	}

	public List<Job> insertAll(List<Job> entity) {

		return jobRepo.saveAll(entity);
	}

	public Job update(Job entity) {

		return jobRepo.save(entity);
	}

	public void deleteById(Long id) {

		jobRepo.deleteById(id);
	}

}
