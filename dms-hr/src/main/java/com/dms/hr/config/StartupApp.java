package com.dms.hr.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dms.hr.entity.Contract;
import com.dms.hr.entity.Department;
import com.dms.hr.entity.Employee;
import com.dms.hr.entity.Job;
import com.dms.hr.entity.Status;
import com.dms.hr.service.ContractService;
import com.dms.hr.service.DepartmentService;
import com.dms.hr.service.EmployeeService;
import com.dms.hr.service.JobService;
import com.dms.hr.service.StatusService;

@Component
public class StartupApp implements CommandLineRunner {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private JobService jobService;

	@Autowired
	private ContractService contractService;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private StatusService statusService;

	@Override
	public void run(String... args) throws Exception {

		addSomeDeptDemoData();
		addSomeJobDemoData();
		addSomeContractDemoData();
		addSomeStatusDemoData();
		addSomeEmployeeDemoData();

	}

	public void addSomeDeptDemoData() {
		if (departmentService.findAll().isEmpty()) {

			Department dept = new Department();
			dept.setName("Development Department");

			Department dept2 = new Department();
			dept2.setName("HR Department");

			Department dept3 = new Department();
			dept3.setName("Tester Department");

			Department dept4 = new Department();
			dept4.setName("Management Department");

			departmentService.insertAll(Arrays.asList(dept, dept2, dept3, dept4));

		}
	}

	public void addSomeJobDemoData() {

		if (jobService.findAll().isEmpty()) {

			Job job = new Job();
			job.setName("UI/UX Department");

			Job job2 = new Job();
			job2.setName("HR Department");

			Job job3 = new Job();
			job3.setName("FrontEnd Department");

			Job job4 = new Job();
			job4.setName("BackEnd Department");

			jobService.insertAll(Arrays.asList(job, job2, job3, job4));

		}

	}

	public void addSomeContractDemoData() {
		if (contractService.findAll().isEmpty()) {

			Contract con = new Contract();
			con.setName("Full Time");

			Contract con2 = new Contract();
			con2.setName("Part Time");

			contractService.insertAll(Arrays.asList(con, con2));

		}
	}

	public void addSomeStatusDemoData() {
		if (statusService.findAll().isEmpty()) {

			Status status = new Status();
			status.setName("Active");

			Status status2 = new Status();
			status2.setName("INactive");
			statusService.insertAll(Arrays.asList(status, status2));

		}
	}

	public void addSomeEmployeeDemoData() {
		if (employeeService.findAll().isEmpty()) {

			Employee emp = new Employee();
			emp.setName("Omar");
			emp.setEmployeeCode("8778670");
			emp.setBrithDate(LocalDate.now());
			emp.setBrithCity("Cairo");
			emp.setDepartment(departmentService.findById(1L));
			emp.setContract(contractService.findById(1L));
			emp.setJobTitle(jobService.findById(1L));
			emp.setStatus(statusService.findById(1L));
			employeeService.insert(emp);

			Employee emp2 = new Employee();
			emp2.setName("Nour");
			emp2.setEmployeeCode("8778670");
			emp2.setBrithDate(LocalDate.now());
			emp2.setBrithCity("Alex");
			emp2.setDepartment(departmentService.findById(2L));
			emp2.setContract(contractService.findById(2L));
			emp2.setJobTitle(jobService.findById(2L));
			emp2.setStatus(statusService.findById(1L));

			Employee emp3 = new Employee();
			emp3.setName("Nora");
			emp3.setEmployeeCode("8778670");
			emp3.setManager(employeeService.findById(1L));
			emp3.setBrithDate(LocalDate.now());
			emp3.setBrithCity("Mansura");
			emp3.setDepartment(departmentService.findById(3L));
			emp3.setContract(contractService.findById(1L));
			emp3.setJobTitle(jobService.findById(4L));
			emp3.setStatus(statusService.findById(1L));

			Employee emp4 = new Employee();
			emp4.setName("Ahmend");
			emp4.setEmployeeCode("8778670");
			emp4.setBrithDate(LocalDate.now());
			emp4.setBrithCity("Cairo");
			emp4.setDepartment(departmentService.findById(1L));
			emp4.setContract(contractService.findById(1L));
			emp4.setJobTitle(jobService.findById(3L));
			emp4.setStatus(statusService.findById(1L));

			Employee emp5 = new Employee();
			emp5.setName("Mohemmmed");
			emp5.setEmployeeCode("8778670");
			emp3.setManager(employeeService.findById(2L));
			emp5.setBrithDate(LocalDate.now());
			emp5.setBrithCity("Cairo");
			emp5.setDepartment(departmentService.findById(1L));
			emp5.setContract(contractService.findById(1L));
			emp5.setJobTitle(jobService.findById(1L));
			emp5.setStatus(statusService.findById(1L));

			Employee emp6 = new Employee();
			emp6.setName("Ehab");
			emp6.setEmployeeCode("8778670");
			emp6.setBrithDate(LocalDate.now());
			emp6.setBrithCity("Cairo");
			emp6.setDepartment(departmentService.findById(1L));
			emp6.setContract(contractService.findById(1L));
			emp6.setJobTitle(jobService.findById(1L));
			emp6.setStatus(statusService.findById(1L));

			Employee emp7 = new Employee();
			emp7.setName("Aisha");
			emp7.setEmployeeCode("8778670");
			emp3.setManager(employeeService.findById(1L));
			emp7.setBrithDate(LocalDate.now());
			emp7.setBrithCity("Cairo");
			emp7.setDepartment(departmentService.findById(1L));
			emp7.setContract(contractService.findById(1L));
			emp7.setJobTitle(jobService.findById(1L));
			emp7.setStatus(statusService.findById(1L));

			Employee emp8 = new Employee();
			emp8.setName("Ail");
			emp8.setEmployeeCode("8778670");
			emp8.setBrithDate(LocalDate.now());
			emp8.setBrithCity("Cairo");
			emp8.setDepartment(departmentService.findById(1L));
			emp8.setContract(contractService.findById(1L));
			emp8.setJobTitle(jobService.findById(1L));
			emp8.setStatus(statusService.findById(1L));

			Employee emp9 = new Employee();
			emp9.setName("Assma");
			emp9.setEmployeeCode("8778670");
			emp9.setBrithDate(LocalDate.now());
			emp9.setBrithCity("Cairo");
			emp9.setDepartment(departmentService.findById(1L));
			emp9.setContract(contractService.findById(1L));
			emp9.setJobTitle(jobService.findById(1L));
			emp9.setStatus(statusService.findById(1L));

			employeeService.insertAll(Arrays.asList( emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9));

		}
	}
}
