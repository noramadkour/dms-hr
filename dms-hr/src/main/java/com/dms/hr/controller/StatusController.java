package com.dms.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dms.hr.entity.Status;
import com.dms.hr.service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	@GetMapping()
	public ResponseEntity<List<Status>> findAll (){
		
		return ResponseEntity.ok(statusService.findAll()) ;
	}

}
