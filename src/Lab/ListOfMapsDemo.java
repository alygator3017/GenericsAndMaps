package Lab;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alyson
 */
public class ListOfMapsDemo {

    public static void main(String[] args) {

        //wrong approach
        //basic storage using maps
        //only good for storing employees and nothing else
        Employee e1 = new Employee(1, "Smith", "Mickey", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "Martha", "222-22-2222");
        Employee e3 = new Employee(3, "Pond", "Amy", "333-33-3333");
        Employee e4 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e5 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e6 = new Employee(6, "Malone", "Melody", "555-55-5555");
        Employee e7 = new Employee(7, "Pond", "Melody", "555-55-5555");

        Map<String, Employee> employees = new HashMap<>();

        employees.put(e1.getSsn(), e1);
        employees.put(e2.getSsn(), e2);
        employees.put(e3.getSsn(), e3);
        employees.put(e4.getSsn(), e4);
        employees.put(e5.getSsn(), e5);
        employees.put(e6.getSsn(), e6);
        employees.put(e7.getSsn(), e7);

        Employee e = employees.get("333-33-3333");

        System.out.println("Found employee:" + e);

        //right way
        //store objects but less rigid
        //has to be able to store different types of objects
        List<Map<String, Object>> records = new ArrayList<>();
        //values that can be stored could be anything which is why we are storing 
        //plain objects, but have to represent things we are storing as maps

        //manual version
//        Map<String, Object> genericObj = new HashMap<>();
//        genericObj.put("empID", e1.getEmpID());
//        genericObj.put("lastName", e1.getLastName());
//        genericObj.put("firstName", e1.getFirstName());
//        genericObj.put("ssn", e1.getSsn());

        //add generic objects to list
//        records.add(genericObj);

        //automated
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        
        //pretend the key names were auto discovered and not hardcoded. 
        for (Employee es : empList) {
            Map<String, Object> genericObj = new HashMap<>();
            genericObj.put("empID", es.getEmpID());
            genericObj.put("lastName", es.getLastName());
            genericObj.put("firstName", es.getFirstName());
            genericObj.put("ssn", es.getSsn());
            records.add(genericObj);
        }

    }

}
