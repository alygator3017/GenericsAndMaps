package Lab;

import common.Employee;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Alyson
 */
public class Turkey implements Comparable {

    private double weight;
    private int age;

    public Turkey() {
    }

    public Turkey(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "Turkey{" + "weight=" + weight + ", age=" + age + '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object t) {
        Turkey g = (Turkey) t;

        return new CompareToBuilder()
                .append(this.age, g.age)
                .append(this.weight, g.weight)
                .toComparison();
    }

    public static void main(String[] args) {
        Turkey t1 = new Turkey(10,1);
        Turkey t2 = new Turkey(20, 3);
        Turkey t3 = new Turkey(13, 1);
        Turkey t4 = new Turkey(14, 3);
        
        Set<Turkey> turkeys = new TreeSet<>();
        turkeys.add(t1);
        turkeys.add(t2);
        turkeys.add(t3);
        turkeys.add(t4);
        
        for(Turkey t : turkeys){
            System.out.println(t);
        }
    }
    
}
