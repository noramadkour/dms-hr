package com.dms.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dms.hr.entity.Contract;

@Repository
public interface ContractRepo extends JpaRepository<Contract, Long> {

}
