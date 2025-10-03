package Main;
import com.gopinath.assignment.employees.Manager;
import com.gopinath.assignment.employees.Developer;
import com.gopinath.assignment.utilities.EmployeeUtilities;

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