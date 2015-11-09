package Lab;

import common.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alyson
 */
public class Challenge2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Pond", "Amy", "888-88-8888");
        Employee e2 = new Employee(4, "Pond", "Rory", "444-44-4444");
        Employee e3 = new Employee(5, "Song", "River", "555-55-5555");
        Employee e4 = new Employee(6, "Malone", "Melody", "555-55-5555");
        
//        Set<Employee> set = new TreeSet<>();
//        set.add(e1);
//        set.add(e2);
//        set.add(e3);
//        set.add(e4);
        //USING empID AS A KEY 
        Map<Integer, Employee> mEmpID = new HashMap();
        mEmpID.put(e3.getEmpID(), e3);
        mEmpID.put(e2.getEmpID(), e2);
        mEmpID.put(e1.getEmpID(), e1);
        mEmpID.put(e4.getEmpID(), e4);
        
        Set keys = mEmpID.keySet();
        for(Object key: keys){
            System.out.println(key);
        }
        
        //individual way to get string using key
        System.out.println("Getting e3 Employee information: " + ((Employee)mEmpID.get(e3.getEmpID())).toString());
        
        Set<Employee> eSet = new HashSet<>();
        for(Object objKey : keys){
            eSet.add((Employee)mEmpID.get(objKey));
        }
        //showing set
        System.out.println("Looping through the map that has been put into a set:");
        for(Employee e: eSet){
            System.out.println(e);
        }
        
        List<Employee> eList = new ArrayList<>(eSet);
        System.out.println("Looping through employees list: ");
        //Loop to get strings for all objects in set.
        for(Employee e : eList){
            System.out.println(e);
        }
        
        //Since I had two of the same SSN and since that is what the challenge
        //seems to imply, I have added using ssn as a key. In the employee class 
        //compare method, I use both ssn and empID while comparing, which allows
        //me to use both as a key without encountering a null pointer exception
        //(which I did try without and did cause a null pointer exception)
        //Personally I would use the ID as a key, then again, using both could 
        //show a better sense of security?
        //USING ssn AS A KEY
        Map<String, Object> mSsn = new HashMap();
        mSsn.put(e3.getSsn(), e3);
        mSsn.put(e2.getSsn(), e2);
        mSsn.put(e1.getSsn(), e1);
        mSsn.put(e4.getSsn(), e4);
        
        keys = mSsn.keySet();
        
        eSet = new HashSet<>();
        for(Object objKey: keys){
            eSet.add((Employee)mSsn.get((String)objKey));
        }
        
        System.out.println("Looping through the map that has been put into a set:");
        for(Employee e: eSet){
            System.out.println(e);
        }
        
        eList = new ArrayList<>(eSet);
        System.out.println("Looping through employees list: ");
        //Loop to get strings for all objects in set.
        for(Employee e : eList){
            System.out.println(e);
        }
    }
}
