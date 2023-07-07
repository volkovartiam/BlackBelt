package org.example.work_with_files_two;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {

    public static void main(String[] args) throws IOException {

        File file = new File("random.txt");
        File folder = new File("C:\\Users\\Artem\\Desktop\\folder");
        File file2 = new File("C:\\Users\\Artem\\Desktop\\folder\\2text.txt");
        File folder2 = new File("C:\\Users\\Artem\\Desktop\\folder\\2");

        System.out.println( "file.getAbsolutePath() " + file.getAbsolutePath() );
        System.out.println( "folder.getAbsolutePath() " + folder.getAbsolutePath() );
        System.out.println("==========================================================");
        System.out.println( "file.isAbsolute() " + file.isAbsolute() );
        System.out.println( "folder.isAbsolute() " + folder.isAbsolute() );
        System.out.println("==========================================================");

        System.out.println( "file.isDirectory() " + file.isDirectory() );
        System.out.println( "folder.isDirectory() " + folder.isDirectory() );
        System.out.println("==========================================================");
        System.out.println( "file.isDirectory() " + file.isDirectory() );
        System.out.println( "folder.isDirectory() " + folder.isDirectory() );
        System.out.println("==========================================================");

        System.out.println( "file.exists() " + file.exists() );
        System.out.println( "folder.exists() " + folder.exists() );
        System.out.println( "file2.exists() " + file2.exists() );
        System.out.println( "folder2.exists() " + folder2.exists() );
        System.out.println("==========================================================");

        System.out.println( "file2.createNewFile() " + file2.createNewFile() );
        System.out.println( "folder2.mkdirs() " + folder2.mkdirs() );
        System.out.println("==========================================================");

        /*
        System.out.println( "file2.length() " + file2.length() );
        System.out.println( "folder.length() " + folder.length() );
        System.out.println("==========================================================");
        System.out.println( "file2.delete() " + file2.delete() );
        System.out.println( "folder2.delete() " + folder2.delete() );
        */
        File[] files = folder2.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("==========================================================");

        System.out.println( "file2.isHidden() " + file2.isHidden() );
        System.out.println( "file2.canRead() " + file2.canRead() );
        System.out.println( "file2.canWrite() " + file2.canWrite() );
        System.out.println( "file2.canExecute() " + file2.canExecute() );

    }
}
