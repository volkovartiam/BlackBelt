package org.example.fileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor2 extends SimpleFileVisitor<Path> {

    Path source;
    Path destination;

    MyFileVisitor2(Path source, Path direction){
        this.source = source;
        this.destination = direction;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

}
