package lambda_6;

import java.util.ArrayList;

public class Lambda_Ex_1 {

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

        printStudentsOverGrade(students, 7);
        System.out.println("---------------------------------");
        printStudentsUnderAge(students, 25);
        System.out.println("---------------------------------");
        printStudentsMixCondition(students, 25, 7, 'f');

    }

    static void printStudentsOverGrade(ArrayList<Student> a1, double grade){
        for(Student st : a1){
            if(st.avgGrade > grade) {
                System.out.println(st);
            }
        }
    }

    static void printStudentsUnderAge(ArrayList<Student> a1, int age){
        for(Student st : a1){
            if(st.avgGrade < age) {
                System.out.println(st);
            }
        }
    }

    static void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex){
        for(Student st : a1){
            if(st.avgGrade < age && st.avgGrade > grade && st.sex == sex) {
                System.out.println(st);
            }
        }
    }


}
