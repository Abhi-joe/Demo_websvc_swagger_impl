package com.demo.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee bean class
 * 
 * @author Abhi
 *
 */
@Entity
@Table(name = "employee")
public class EmployeeBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid")
	private int employeeId;
	@Column(name = "ename")
	private String employeeName;
	private double salary;
	@Column(name = "stream")
	private String employeeSpecialization;

	/**
	 * Default constructor
	 */
	public EmployeeBean() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param salary
	 * @param employeeSpecialization
	 */
	public EmployeeBean(int employeeId, String employeeName, double salary, String employeeSpecialization) {
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
	 * Overriding toString method (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", employeeSpecialization=" + employeeSpecialization + "]";
	}

}
