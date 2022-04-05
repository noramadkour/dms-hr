import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from '../employee.service';
import { first } from 'rxjs/operators';
import { Department } from 'src/app/model/department';
import { Job } from 'src/app/model/job';
import { Contract } from 'src/app/model/contract';
import { Status } from 'src/app/model/status';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees!: Employee[];
  departments!: Department[];
  jobs!: Job[];
  contracts!: Contract[];
  status!: Status[];

  employee: Employee = new Employee();

 

  constructor(
    private employeeService: EmployeeService,    
    ) { }

  ngOnInit(): void {
    this.employeeFilter();
    this.allContracts();
    this.allDepartments();
    this.allJobs();
    this.allStatus();
  }


  employeeFilter(){
    console.log('employee filter is ', this.employee);
    
    this.employeeService.filter(this.employee)
    .pipe(first())
    .subscribe(employees => {
      this.employees =employees
    });
  }



  allDepartments(){
    this.employeeService.allDepartments()
    .pipe(first())
    .subscribe(res => {
      this.departments =res;
    });
  }

  allContracts(){
    this.employeeService.allContracts()
    .pipe(first())
    .subscribe(res => {
      this.contracts =res;
    });
  }

  allJobs(){
    this.employeeService.allJobs()
    .pipe(first())
    .subscribe(res => {
      this.jobs =res;
    });
  }

  allStatus(){
    this.employeeService.allStatus()
    .pipe(first())
    .subscribe(res => {
      this.status =res;
    });
  }


  


 



  onSubmit(){}


}
