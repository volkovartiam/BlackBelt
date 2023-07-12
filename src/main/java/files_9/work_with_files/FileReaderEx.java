package files_9.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {

        FileReader reader = null;

        try {
            reader = new FileReader("text2.txt");
            int character = 0;

            while ( (character = reader.read()) != -1){
                System.out.print( (char) character);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }


    }
}
