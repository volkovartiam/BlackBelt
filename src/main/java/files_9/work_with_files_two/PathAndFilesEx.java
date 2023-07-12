package files_9.work_with_files_two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("PathAndFilesExTest.txt");
        Path dirPath = Paths.get("C:\\Users\\Artem\\Desktop\\folder\\5");

        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("dirPath.getFileName() " + dirPath.getFileName());
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("dirPath.getParent() " + dirPath.getParent());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("dirPath.getRoot() " + dirPath.getRoot());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute() " + dirPath.isAbsolute());
        System.out.println("----------------------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("dirPath.getParent() " + dirPath.getParent() );
        System.out.println("----------------------------------------------------");

        System.out.println("dirPath.resolve(filePath) " + dirPath.resolve(filePath) );
        System.out.println("----------------------------------------------------");

        Path anotherPath = Paths.get("C:\\Users\\Artem\\Desktop\\folder\\5\\4\\3\\test.txt");
        System.out.println("dirPath.relativize(anotherPath) " + dirPath.relativize(anotherPath) );

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if(!Files.exists(dirPath)){
            Files.createDirectory(dirPath);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath) );
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath) );
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath) );
        System.out.println("----------------------------------------------------");

        Path filPath2 = Paths.get("C:\\Users\\Artem\\BlackBelt\\PathAndFilesExTest.txt");
        System.out.println("Files.isSameFile(filePath, filPath2) " + Files.isSameFile(filePath, filPath2));
        System.out.println("Files.size(filePath) " + Files.size(filePath));
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));

        System.out.println("----------------------------------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() );
        }
    }
}
