package files_9.work_with_files_two;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx {

    public static void main(String[] args) {

        try(RandomAccessFile file =
                    new RandomAccessFile("random.txt", "rw");
            FileChannel channel = file.getChannel(); ){

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poetryLine = new StringBuilder();

            int byteReaded = channel.read(buffer);
            while (byteReaded > 0){
                System.out.println("Readed " + byteReaded);
                buffer.flip();

                while (buffer.hasRemaining()){
                    poetryLine.append( (char) buffer.get() );
                }
                buffer.clear();
                byteReaded = channel.read(buffer);
            }
            System.out.println(poetryLine);

            String text = "\n There are only two ways to live your life." +
                          " One is as though nothing is a miracle. The other is " +
                          " though everything is a miracle.";

            /*
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2);
             */

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
