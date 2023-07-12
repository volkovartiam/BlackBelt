package files_9.work_with_files;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionUID = 2;
    String name;
    //String surname;
    String department;
    int age;
    transient double salary;

    public Employee(String name, /*String surname,*/ String department, int age, double salary) {
        this.name = name;
//        this.surname = surname;
        this.department = department;
        //this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
  //              "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
