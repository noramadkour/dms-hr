package com.dms.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.hr.entity.Contract;
import com.dms.hr.repository.ContractRepo;


@Service
public class ContractService {
	
	@Autowired
	private ContractRepo contractRepo;

	public Contract findById(Long id) {

		return contractRepo.findById(id).orElse(null);
	}

	public Contract getById(Long id) {

		return contractRepo.getById(id);
	}

	public List<Contract> findAll() {

		return contractRepo.findAll();
	}

	public Contract insert(Contract entity) {

		if (entity.getId() != null) {

			throw new RuntimeException();
		}

		return contractRepo.save(entity);
	}

	public List<Contract> insertAll(List<Contract> entity) {

		return contractRepo.saveAll(entity);
	}

	public Contract update(Contract entity) {

		return contractRepo.save(entity);
	}

	public void deleteById(Long id) {

		contractRepo.deleteById(id);
	}

}
