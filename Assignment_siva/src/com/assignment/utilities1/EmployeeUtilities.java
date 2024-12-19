package com.assignment.utilities1;

import com.sivaraman.assignment1.Developer;
import com.sivaraman.assignment1.Employee;
import com.sivaraman.assignment1.Manager;

public class EmployeeUtilities {
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            System.out.println("Team Size: " + ((Manager) employee).getTeamSize());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }

    /**
     * Increases the salary of an employee by a given percentage.
     * @param employee The employee object.
     * @param percentage The percentage to increase the salary.
     */
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Salary updated to: " + newSalary);
    }
}


