package comparableAndComparator_2;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Ex_1 {

    public static void main(String[] args) {

        Student st1 = new Student(1, "Ivan", 'm', 22, 3, 8.3);
        Student st3 = new Student(3, "Anna", 'f', 22, 3, 8.3);
        Student st5 = new Student(5, "Iv", 'f', 42, 3, 9.3);
        Student st2 = new Student(2, "Nikolay", 'm', 28, 1, 6.3);
        Student st4 = new Student(4, "Zaur", 'm', 32, 4, 2.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }

}
