package lambda_6;

import java.util.ArrayList;

public class Lambda_Ex_2 {

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

        testStudents(students, new CheckOverGrade());
        System.out.println("------------------------------------");

        testStudents(students, new StudentsCheck() {
            @Override
            public boolean check(Student student) {
                int age = 28;
                return (student.age < age);
            }
        });
        System.out.println("------------------------------------");

        testStudents(students, (Student student) -> {
                int age = 28;
                return (student.age > age);
        });
        System.out.println("------------------------------------");
        testStudents(students, student -> student.age > 28);

    }

    static void testStudents(ArrayList<Student> students, StudentsCheck studentsCheck){
        for(Student student : students){
            if(studentsCheck.check(student)){
                System.out.println(student);
            }
        }
    }



}
