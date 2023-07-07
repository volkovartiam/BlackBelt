package org.example.work_with_files_two;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {

    public static void main(String[] args) {

        try(RandomAccessFile file
                    = new RandomAccessFile("ChannelBufferEx2Test.txt", "rw")){
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();

            System.out.print((char) buffer.get());
            System.out.print((char) buffer.get());
            System.out.print((char) buffer.get());
            buffer.rewind();
            System.out.print((char) buffer.get());
            System.out.println("\n---------------------------------------------------");

            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }
            System.out.println("\n---------------------------------------------------");

            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.print((char)buffer.get());
            buffer.mark();
            System.out.print((char)buffer.get());
            System.out.print((char)buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
