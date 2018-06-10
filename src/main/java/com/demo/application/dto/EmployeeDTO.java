package com.demo.application.dto;

/**
 * Data Transfer Object for Employee bean
 * 
 * @author Abhi
 *
 */
public class EmployeeDTO {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String employeeSpecialization;

	/**
	 * Default constructor
	 */
	public EmployeeDTO() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param salary
	 * @param employeeSpecialization
	 */
	public EmployeeDTO(int employeeId, String employeeName, double salary, String employeeSpecialization) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.employeeSpecialization = employeeSpecialization;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the employeeSpecialization
	 */
	public String getEmployeeSpecialization() {
		return employeeSpecialization;
	}

	/**
	 * @param employeeSpecialization
	 *            the employeeSpecialization to set
	 */
	public void setEmployeeSpecialization(String employeeSpecialization) {
		this.employeeSpecialization = employeeSpecialization;
	}

	/*
	 * (non-Javadoc) Overriding toString method
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", employeeSpecialization=" + employeeSpecialization + "]";
	}

}
