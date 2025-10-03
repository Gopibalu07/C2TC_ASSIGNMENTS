package com.gopinath.assignment1.main;
import com.gopinath.assignment1.employees.Developer;
import com.gopinath.assignment1.employees.Manager;
import com.gopinath.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to test the Employee hierarchy and utilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Gopi", 101, 75000, "IT");
        Developer developer = new Developer("Rex", 102, 60000, "Java");

        // Display details
        EmployeeUtilities.displayEmployeeDetails(manager);
        EmployeeUtilities.displayEmployeeDetails(developer);

        // Give raise
        EmployeeUtilities.giveRaise(manager, 10);  // 10% raise
        EmployeeUtilities.giveRaise(developer, 15); // 15% raise

        // Display updated details
        System.out.println("After salary raise:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        EmployeeUtilities.displayEmployeeDetails(developer);
    }
}