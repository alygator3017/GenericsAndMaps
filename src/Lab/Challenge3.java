package Lab;

import common.Employee;
import common.EmployeeByLastName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Alyson
 */
public class Challenge3 {
    public static void main(String[] args) {
        
        Employee e2 = new Employee(3, "Pond", "Amy", "888-88-8888");
        Employee e1 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(6, "Malone", "Melody", "555-55-5555");
    
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        
        Map<Integer, Employee> map = new TreeMap<>();
        
        for(Employee e : empList){
            map.put(e.getEmpID(), e);
        }
        
        Set keys = map.keySet();
        System.out.println("Checking to make sure it sorted in TreeMap: ");
        for(Object key : keys){
            System.out.println(map.get((Integer)key));
        }
        
        List<Employee> list = new ArrayList<>();
        for(int i = 3; i < map.size() + 3; i++){
            list.add(map.get(i));
        }
        
        Collections.sort(list, new EmployeeByLastName());
        
        System.out.println("Sorted by last name: ");
        for(Employee e : list){
            System.out.println(e);
        }
        
    }
}
