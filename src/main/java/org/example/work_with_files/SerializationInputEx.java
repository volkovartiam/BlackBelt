package org.example.work_with_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationInputEx {

    public static void main(String[] args) {

        List<String> emp = new ArrayList<>();
        emp.add("12");
        emp.add("65");
        emp.add("99");

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("empl.bin")) ) {

            List<Employee> list = (ArrayList) inputStream.readObject();
            for (Employee employee : list ) {
                System.out.println(employee);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
