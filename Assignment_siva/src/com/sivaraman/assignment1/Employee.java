package com.sivaraman.assignment1;

public class Employee {
	private int name;
	private String employeeId;
	private double salary;
	
	public Employee(int name, String employeeId, int salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee{name='" +name+ "',employeeId=" +employeeId+ ",salary=" +salary+ "}";
	}
	
	
	
	
	

}
