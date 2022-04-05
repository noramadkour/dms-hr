package com.dms.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dms.hr.entity.Contract;
import com.dms.hr.service.ContractService;


@RestController
@RequestMapping("/contract")
@CrossOrigin("http://localhost:4200")
public class ContractController {
	@Autowired
	private ContractService contractService;
	
	@GetMapping()
	public ResponseEntity<List<Contract>> findAll (){
		
		return ResponseEntity.ok(contractService.findAll()) ;
	}


}
