package com.seleniumexpress.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Custom")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private Integer employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_department")
	private String employeeDepartment;
	
	@Column(name="employee_marriatal_status")
	private Boolean employeeMarriatalStatus;
	
	@Column(name="employee_dob")
	private LocalDate employeeDOB;
	
	@Column(name="employee_gender")
	private Character employeeGender;
	
	@Column(name="employee_salary")
	private Double employeeSalary;
	
	@Column(name="employee_percentage")
	private float employeePercentage;


	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public Boolean getEmployeeMarriatalStatus() {
		return employeeMarriatalStatus;
	}

	public void setEmployeeMarriatalStatus(Boolean employeeMarriatalStatus) {
		this.employeeMarriatalStatus = employeeMarriatalStatus;
	}

	public LocalDate getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(LocalDate employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public Character getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(Character employeeGender) {
		this.employeeGender = employeeGender;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public float getEmployeePercentage() {
		return employeePercentage;
	}

	public void setEmployeePercentage(float employeePercentage) {
		this.employeePercentage = employeePercentage;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeMarriatalStatus=" + employeeMarriatalStatus + ", employeeDOB="
				+ employeeDOB + ", employeeGender=" + employeeGender + ", employeeSalary=" + employeeSalary
				+ ", employeePercentage=" + employeePercentage + "]";
	}

	public Employee(Integer employeeId, String employeeName, String employeeDepartment, Boolean employeeMarriatalStatus,
			LocalDate employeeDOB, Character employeeGender, Double employeeSalary, float employeePercentage) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeMarriatalStatus = employeeMarriatalStatus;
		this.employeeDOB = employeeDOB;
		this.employeeGender = employeeGender;
		this.employeeSalary = employeeSalary;
		this.employeePercentage = employeePercentage;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
