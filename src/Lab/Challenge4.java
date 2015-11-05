package Lab;

import common.Employee;
import common.EmployeeByLastName;
import common.EmployeeBySsn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alyson
 */
public class Challenge4 {

    public static void main(String[] args) {
        //Because equals and hash are set to employee ID, i have changed the id 
        //to match
        Employee e1 = new Employee(3, "Pond", "Amy", "888-88-8888");
        Employee e2 = new Employee(4, "Pond", "Rory", "333-33-3333");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(5, "Malone", "Melody", "555-55-5555");

        Set<Employee> employees = new TreeSet<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Set looping: ");
        for (Employee e : employees) {
            System.out.println(e);
        }

        List<Employee> empList = new ArrayList<>(employees);
        System.out.println("List looping: ");
        for (Employee e : empList) {
            System.out.println(e);
        }
        
        Collections.sort(empList, new EmployeeByLastName());
        System.out.println("List looping using last name sort: ");
        for (Employee e : empList) {
            System.out.println(e);
        }
        
        Collections.sort(empList, new EmployeeBySsn());
        System.out.println("List looping using ssn sort: ");
        for (Employee e : empList) {
            System.out.println(e);
        }
    }

}
