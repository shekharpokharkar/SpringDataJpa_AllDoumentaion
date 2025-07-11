package com.seleniumexpress.Service;

import java.time.LocalDate;
import java.util.List;

import com.seleniumexpress.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> saveListAllEmployee(List<Employee> employee);

	public Employee updateEmployee(Integer employeeId, Employee employee);

	public String deleteEmployee(Employee employee);

	public void deleteByIdEmployee(Integer employeeId);

	public List<Employee> findAllEmployee();

	public Employee findEmployeeById(Integer employeeId);

	public List<Employee> findEmployeeByEmployeeNameAndEmployeeDepartment(String employeeName,
			String employeeDepartment);

	public List<Employee> findEmployeeByEmployeeNameOrEmployeeDepartment(String employeeName,
			String employeeDepartment);

	public List<Employee> findEmployeeByemployeeDOBAfter(LocalDate dob);

	public List<Employee> findEmployeeByemployeeDOBBetween(LocalDate dob1, LocalDate dob2);
	public List<Employee> findEmployeeByEmployeeNameEndingWith(String employeeName);
}
