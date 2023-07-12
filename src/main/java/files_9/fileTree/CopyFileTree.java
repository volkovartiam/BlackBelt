package files_9.fileTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileTree {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Users\\Artem\\Desktop\\folder");
        Path direction = Paths.get("C:\\Users\\Artem\\Desktop\\CopyHere");

        Files.walkFileTree(source, new MyFileVisitor2(source, direction ));

    }

}
