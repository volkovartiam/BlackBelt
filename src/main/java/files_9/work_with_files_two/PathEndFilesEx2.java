package files_9.work_with_files_two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathEndFilesEx2 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("PathAndFilesExTest.txt");
        Path dirPath = Paths.get("C:\\Users\\Artem\\Desktop\\folder\\5");
        Path dirBPath = Paths.get("C:\\Users\\Artem\\Desktop\\folder\\B");


        Files.copy(filePath, dirPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        //Files.copy(filePath, dirPath.resolve("PathAndFilesExTest") );
        Files.copy(dirPath, dirBPath.resolve("B"), StandardCopyOption.REPLACE_EXISTING);

        //Files.move( filePath, Paths.get("PathAndFilesExTest2.txt") );


    }
}
