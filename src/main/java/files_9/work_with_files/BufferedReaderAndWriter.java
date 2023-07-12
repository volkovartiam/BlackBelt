package files_9.work_with_files;

import java.io.*;

public class BufferedReaderAndWriter {

    public static void main(String[] args ){

        try (   BufferedReader reader = new BufferedReader(
                    new FileReader( "text2.txt" ) );
                BufferedWriter writer = new BufferedWriter(
                    new FileWriter( "text3.txt" ) )    ) {

            int character;
            while ( (character = reader.read()) != -1 ){
                writer.write(character);
                System.out.print( (char) character);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
