package lambda_6;

import java.util.ArrayList;
import java.util.function.Function;

public class Function_Ex_1 {

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

        Function<Student, Double> function = student -> student.avgGrade;

        double avgGrade = avgOfSomething(students, student -> (student.avgGrade));
        System.out.println(avgGrade);

        double avgAge = avgOfSomething(students, student -> ((double)student.age));
        System.out.println(avgAge);
    }

    public static double avgOfSomething(ArrayList<Student> list, Function<Student, Double> f){
        double avg = 0;
        for(Student student: list){
            avg = avg + f.apply(student);
        }
        return avg/list.size();
    }

}
