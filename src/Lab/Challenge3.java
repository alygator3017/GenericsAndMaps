package Lab;

import common.Employee;
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
        
        Employee e1 = new Employee(3, "Pond", "Amy", "333-33-3333");
        Employee e2 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(6, "Malone", "Melody", "555-55-5555");
        
        Map map = new TreeMap();
        
        map.put("333-33-3333", e1);
        map.put("444-44-4444", e2);
        map.put("555-55-5555", e3);
        map.put("555-55-5555", e4);
        
        Set key = map.keySet();
        Set<Employee> key2 = map.entrySet();
        
        List list = new ArrayList();
        list.addAll(key2);
        
        System.out.println(list.get(1));
        
        Collections.sort(list);
        
        System.out.println(list.get(1));
        
//        for(int i = 0; i < list.size(); i ++){
//            System.out.println(list.get(i));
//        }
        
    }
}
