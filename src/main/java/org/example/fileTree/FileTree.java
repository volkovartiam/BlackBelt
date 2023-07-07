package org.example.fileTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTree {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Artem\\Desktop\\folder\\1");
        Files.walkFileTree(path, new MyFileVisitor());
    }

}
