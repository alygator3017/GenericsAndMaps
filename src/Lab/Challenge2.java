package Lab;

import common.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alyson
 */
public class Challenge2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Pond", "Amy", "333-33-3333");
        Employee e2 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(6, "Malone", "Melody", "555-55-5555");
        
//        Set<Employee> set = new TreeSet<>();
//        set.add(e1);
//        set.add(e2);
//        set.add(e3);
//        set.add(e4);
        
        Map m = new HashMap();
        m.put("333-33-3333", e1);
        m.put("444-44-4444", e2);
        m.put("555-55-5555", e3);
        m.put("555-55-5555", e4);
        
        Set keys = m.keySet();
        
        //individual way to get string using key
        System.out.println(((Employee)m.get("555-55-5555")).toString());
        
        //Loop to get strings for all objects in set.
        for(Object objKey: keys){
            System.out.println(((Employee)m.get(objKey)).toString());
        }
        
        
    }
}
