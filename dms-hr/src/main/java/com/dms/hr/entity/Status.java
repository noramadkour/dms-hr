package com.dms.hr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "hr_status" )
public class Status {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id;
private String name;

}
