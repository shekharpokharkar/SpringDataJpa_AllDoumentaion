package com.seleniumexpress.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seleniumexpress.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findEmployeeByEmployeeNameAndEmployeeDepartment(String employeeName,
			String employeeDepartment);

	public List<Employee> findEmployeeByEmployeeNameOrEmployeeDepartment(String employeeName,
			String employeeDepartment);

	public List<Employee> findEmployeeByemployeeDOBAfter(LocalDate dob);

	/*
	 * public List<Employee> findEmployeeByemployeeDOBBetween(Before Date,After
	 * Date);
	 */
	public List<Employee> findEmployeeByemployeeDOBBetween(LocalDate dob1, LocalDate dob2);

	public List<Employee> findEmployeeByEmployeeNameEndingWith(String employeeName);

}
