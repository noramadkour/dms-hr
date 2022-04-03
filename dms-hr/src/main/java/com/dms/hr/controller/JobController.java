package com.dms.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dms.hr.entity.Job;
import com.dms.hr.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping()
	public ResponseEntity<List<Job>> findAll (){
		
		return ResponseEntity.ok(jobService.findAll()) ;
	}

}
