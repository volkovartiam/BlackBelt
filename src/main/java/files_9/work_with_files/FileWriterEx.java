package files_9.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) throws IOException{
        String str = "Something to write in text2 for to know how to work with Filewriter";
        String hello = "hello";

        FileWriter fileWriter = null;
        try {
//            fileWriter = new FileWriter("C:/Users/Artem/BlackBelt/src/main/java/org/example/work_with_files/text1.txt");
            fileWriter = new FileWriter("text2.txt", true);


            for (int i = 0; i < str.length(); i++){
                 fileWriter.write( str.charAt(i) );
            }

            fileWriter.write(hello);


            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }

}
