package Lab;

import common.Employee;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alyson
 */
public class Challenge4 {
       public static void main(String[] args) {
        Employee e1 = new Employee(3, "Pond", "Amy", "333-33-3333");
        Employee e2 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(6, "Malone", "Melody", "555-55-5555");
        
        Set<Employee> employees = new TreeSet<>();
        
        employees.add(e1);
    }
        
    
}
