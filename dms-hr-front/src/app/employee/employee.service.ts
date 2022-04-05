import { Injectable } from '@angular/core';
import { Employee } from '../model/employee';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Department } from '../model/department';
import { Contract } from '../model/contract';
import { Job } from '../model/job';
import { Status } from '../model/status';


const baseUrl = `${environment.apiUrl}/`;
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  filter(employee: Employee) {
    return this.http.post<Employee[]>(baseUrl + 'employee/filter', employee);
  }

  solveUrlParams(employee: Employee) {

    let empCodeParam = employee.employeeCode ? `?empCode=${employee.employeeCode}` : '';
    let empNameParam = employee.name ? `&empName=${employee.name}` : '';

    return empCodeParam ? empCodeParam : '?' + empNameParam;
    return `${employee.employeeCode}&empId=${employee.id}&contractId=${employee.contractId}&empName=${employee.name}&departmentId=${employee.departmentId}`;
    // let url = '?empCode=&empId&contractId&empName=Omar&departmentId&status&brithDate=2022-04-03&jobTitleId&brithCity&managerId'
  }

  allDepartments() {
    return this.http.get<Department[]>(baseUrl + 'department');
  }

  allContracts() {
    return this.http.get<Contract[]>(baseUrl + 'contract');
  }

  allJobs() {
    return this.http.get<Job[]>(baseUrl + 'job');
  }

  allStatus() {
    return this.http.get<Status[]>(baseUrl + 'status');
  }
}
