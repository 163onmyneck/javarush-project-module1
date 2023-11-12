package com.javarush.IO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {

    public List<String> readFile(String path) {
        try {
            Path absolutePath = Path.of(path);
            List<String> lines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(String path, String operation, List<String> list) {
        Path path1 = Path.of(path + "[" + operation + "]");
        try {
            Files.createFile(path1);
            Files.write(path1, list, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}
