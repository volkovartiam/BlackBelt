package files_9.work_with_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamAndFileOutputStreamEx {

    public static void main(String[] args){

        try(FileInputStream stream = new FileInputStream("Screen.png" );
            FileOutputStream streamOut = new FileOutputStream("Screen_2.png" ); ) {

            int i;
            while ( (i=stream.read() ) != -1 ){
                streamOut.write(i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
