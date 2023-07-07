package org.example.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("random.txt", "rw");) {

            int a = file.read();
            System.out.print( (char) a );

            a = file.read();
            System.out.print( (char) a );

            System.out.println();
            String line = file.readLine();
            System.out.println(line);

            file.seek(101);
            line = file.readLine();
            System.out.println(line);

            long pos = file.getFilePointer();
            System.out.println(pos);

            /*
            file.seek(0);
            file.writeBytes("Hello");
             */

            file.seek( file.length() - 1 );
            file.writeBytes("\n\t\t\t\t\t\t\tWilliam Butler Yeats");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
