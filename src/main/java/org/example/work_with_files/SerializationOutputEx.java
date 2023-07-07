package org.example.work_with_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationOutputEx {

    public static void main(String[] args) {

        List<String> emp = new ArrayList<>();
        emp.add("12");
        emp.add("65");
        emp.add("99");

        List<Employee> employees = new ArrayList<>();
        //employees.add(new Employee("Zaur", "T", "IT", /*40,*/ 55000.448) );
        //employees.add(new Employee("Zara","H", "HR", /*33,*/ 5500.4) );
        //employees.add(new Employee("Ivan", "I","IT", /*20,*/ 18000.8) );


        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("empl.bin")) ) {

            outputStream.writeObject(employees);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
