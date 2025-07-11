package com.seleniumexpress.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.entity.Employee;
import com.seleniumexpress.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return employee2;
	}

	@Override
	public List<Employee> saveListAllEmployee(List<Employee> employee) {
		List<Employee> saveAll = employeeRepository.saveAll(employee);
		return saveAll;
	}

	@Override
	public Employee updateEmployee(Integer employeeId, Employee employee) {

		Employee employee2 = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new RuntimeException("No employeeFound"));

		BeanUtils.copyProperties(employee, employee2);

		Employee save = employeeRepository.save(employee2);

		return save;
	}

	@Override
	public String deleteEmployee(Employee employee) {

		Employee employee2 = employeeRepository.findById(employee.getEmployeeId())
				.orElseThrow(() -> new RuntimeException("No employeeFound"));

		employeeRepository.delete(employee2);
		return "Employee deleted successfully";
	}

	@Override
	public void deleteByIdEmployee(Integer employeeId) {

		employeeRepository.deleteById(employeeId);
	}

	@Override
	public List<Employee> findAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(Integer employeeId) {

		return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("No employeeFound"));
	}

	@Override
	public List<Employee> findEmployeeByEmployeeNameAndEmployeeDepartment(String employeeName,
			String employeeDepartment) {

		return employeeRepository.findEmployeeByEmployeeNameAndEmployeeDepartment(employeeName, employeeDepartment);
	}

	@Override
	public List<Employee> findEmployeeByEmployeeNameOrEmployeeDepartment(String employeeName,
			String employeeDepartment) {

		return employeeRepository.findEmployeeByEmployeeNameOrEmployeeDepartment(employeeName, employeeDepartment);
	}

	@Override
	public List<Employee> findEmployeeByemployeeDOBAfter(LocalDate dob) {
		
		return employeeRepository.findEmployeeByemployeeDOBAfter(dob);
	}

	@Override
	public List<Employee> findEmployeeByemployeeDOBBetween(LocalDate dob1, LocalDate dob2) {
		
		return employeeRepository.findEmployeeByemployeeDOBBetween(dob1, dob2);
	}

	@Override
	public List<Employee> findEmployeeByEmployeeNameEndingWith(String employeeName) {
		
		return employeeRepository.findEmployeeByEmployeeNameEndingWith(employeeName);
	}

}
