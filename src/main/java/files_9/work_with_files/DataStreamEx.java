package files_9.work_with_files;

import java.io.*;

public class DataStreamEx {

    public static void main(String[] args) {

        try(DataOutputStream outputStream = new DataOutputStream(
                    new FileOutputStream("my_test_dataStream.mm") );
            DataInputStream inputStream = new DataInputStream(
                    new FileInputStream("my_test_dataStream.mm") );) {

            outputStream.writeBoolean(true);
            outputStream.writeInt(99);
            outputStream.writeUTF("text for writing in file");

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readUTF());

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }



    }
}
