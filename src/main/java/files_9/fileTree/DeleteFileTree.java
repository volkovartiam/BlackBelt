package files_9.fileTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileTree {

    public static void main(String[] args) throws IOException {

        Path delete = Paths.get("C:\\Users\\Artem\\Desktop\\CopyHere");
        Files.walkFileTree(delete, new MyFileVisitor3Deleter());
    }
}
