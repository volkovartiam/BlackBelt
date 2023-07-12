package lambda_6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_Ex_1 {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 1, 6.3);
        Student st3 = new Student("Anna", 'f', 22, 3, 8.3);
        Student st4 = new Student("Zaur", 'm', 32, 4, 2.3);
        Student st5 = new Student("Iv", 'f', 42, 3, 9.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        testStudents(students, student -> student.age < 28);
        System.out.println("--------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Nikolay");
        names.add("Anna");
        names.add("Zaur");
        names.add("Iv");
        names.removeIf( (name) -> name.length() < 5 );
        System.out.println(names);
        System.out.println("--------------------------------------");

        /*
        students.removeIf( student -> student.name.length() < 5 );
        System.out.println(students);
        System.out.println("--------------------------------------");
        */

        Predicate<Student> predicate = student -> student.name.length() > 5;
        Predicate<Student> predicate_2 = student -> student.sex == 'm';

        students.removeIf(predicate.and(predicate_2));
        System.out.println( students );

    }

    static void testStudents(ArrayList<Student> students, Predicate<Student> predicate){
        for (Student student : students) {
            if(predicate.test(student)){
                System.out.println(student);
            }
        }
    }

}
