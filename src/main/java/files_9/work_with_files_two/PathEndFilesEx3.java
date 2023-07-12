package files_9.work_with_files_two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEndFilesEx3 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("PathAndFilesExTest3.txt");

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        String text = "text to write in file";
        Files.write(filePath, text.getBytes());

        Files.readAllLines(filePath).stream().forEach(System.out::print);

    }
}
