import { Contract } from "./contract";
import { Department } from "./department";
import { Job } from "./job";
import { Status } from "./status";

export class Employee {
    employeeCode!: string ;
    id!: string;
    name!: string;
    contract!: Contract;
    contractId!: number;
    department!: Department;
    departmentId!:string;
    status!: Status ;
    statusId !:string;
    brithDate!: string;
    jobTitle!: Job;
    jobTitleId!:string;
    brithCity!: string;
    manager!: Employee;
    managerId!:string;



}
