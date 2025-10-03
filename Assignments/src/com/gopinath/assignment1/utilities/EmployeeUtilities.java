package com.gopinath.assignment1.utilities;

import com.gopinath.assignment1.employees.Developer;
import com.gopinath.assignment1.employees.Employee;
import com.gopinath.assignment1.employees.Manager;

/**
 * Utility class for Employee-related operations.
 * Demonstrates usage of public/protected/private members.
 */
public class EmployeeUtilities {

    /**
     * Displays employee details (polymorphism works for Manager/Developer).
     */
    public static void displayEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());

        if (emp instanceof Manager) {
            Manager m = (Manager) emp;
            System.out.println("Department: " + m.getDepartment());
        } else if (emp instanceof Developer) {
            Developer d = (Developer) emp;
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
        }
        System.out.println("----------------------------------");
    }

    /**
     * Give a raise to an employee by percentage.
     */
    public static void giveRaise(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
    }
}
