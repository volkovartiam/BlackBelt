package comparableAndComparator_2;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_Ex_1 {

    public static void main(String[] args) {

        Employee st1 = new Employee(1, "Ivan", 'm', 22, 3, 8.3);
        Employee st3 = new Employee(3, "Anna", 'f', 22, 3, 8.3);
        Employee st5 = new Employee(5, "Iv", 'f', 42, 3, 9.3);
        Employee st2 = new Employee(2, "Nikolay", 'm', 28, 1, 6.3);
        Employee st4 = new Employee(4, "Zaur", 'm', 32, 4, 2.3);

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(st1);
        emps.add(st2);
        emps.add(st3);
        emps.add(st4);
        emps.add(st5);

        Collections.sort(emps, new AgeComparator().reversed() );
        Collections.sort(emps );
        for (Employee emp : emps) {
            System.out.println(emp);
        }

    }

}
