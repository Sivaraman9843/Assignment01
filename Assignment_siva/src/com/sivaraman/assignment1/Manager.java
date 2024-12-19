package com.sivaraman.assignment1;

public class Manager extends Employee{
	private int teamSize;

	public Manager(int name, String employeeId, int salary, int teamSize) {
		super(name, employeeId, salary);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	

}
