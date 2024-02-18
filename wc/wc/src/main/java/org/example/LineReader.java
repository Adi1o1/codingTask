package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineReader {

    public void countLine(String fileName) throws IOException {

        System.out.println(Files.lines(Paths.get(fileName)).count() + " " + fileName) ;
    }
}
