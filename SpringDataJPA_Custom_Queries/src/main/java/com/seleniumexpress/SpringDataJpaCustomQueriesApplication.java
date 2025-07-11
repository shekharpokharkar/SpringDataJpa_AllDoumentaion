package com.seleniumexpress;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seleniumexpress.Service.EmployeeService;
import com.seleniumexpress.entity.Employee;

@SpringBootApplication
public class SpringDataJpaCustomQueriesApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaCustomQueriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// '26', 'Quinn Lee', '', '0', '1996-10-20', 'F', '47996.96', '67.4'

		System.out.println("***************Find Employee By EmployeeName And EmployeeDepartment**************");
		List<Employee> employeeByEmployeeNameAndEmployeeDepartment = employeeService
				.findEmployeeByEmployeeNameAndEmployeeDepartment("Quinn Lee", "Finance");

		employeeByEmployeeNameAndEmployeeDepartment.forEach(System.out::println);

		System.out.println("**************Find Employee By EmployeeName OR EmployeeDepartment*************");
		List<Employee> employeeByEmployeeNameOrEmployeeDepartment = employeeService
				.findEmployeeByEmployeeNameOrEmployeeDepartment("Quinn Lee", "Finance");

		employeeByEmployeeNameOrEmployeeDepartment.forEach(System.out::println);

		System.out.println("*******************Find Employee By EmployeeDOB**************");
		List<Employee> employeeByemployeeDOBAfter = employeeService
				.findEmployeeByemployeeDOBAfter(LocalDate.of(1996, 10, 20));

		employeeByemployeeDOBAfter.forEach(System.out::println);

		System.out.println("*******************Find Employee By EmployeeDOB Between **************");
		// '34', 'Bob Smith', 'Sales', '0', '1998-09-25', 'M', '50374.74', '70.8'

		List<Employee> employeeByemployeeDOBBetween = employeeService
				.findEmployeeByemployeeDOBBetween(LocalDate.of(1990, 10, 01), LocalDate.of(2000, 10, 01));
		employeeByemployeeDOBBetween.forEach(System.out::println);

		System.out.println("*******************EndingWith**************");

		List<Employee> employeeByEmployeeNameEndingWith = employeeService.findEmployeeByEmployeeNameEndingWith("Brown");

		employeeByEmployeeNameEndingWith.forEach(System.out::println);
		System.out.println("*******************EndingWith**************");

	}

}
