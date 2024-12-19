package com.sivaraman.assignment1;

public class Developer extends Employee {
	private String programmingLanguage;

	public Developer(int name, String employeeId, int salary, String programmingLanguage) {
		super(name, employeeId, salary);
		this.setProgrammingLanguage(programmingLanguage);
		// TODO Auto-generated constructor stub
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	

}
