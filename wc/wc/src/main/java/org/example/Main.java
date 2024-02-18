package org.example;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if(args[0].equals("-c")){
            ByteReader b = new ByteReader();
            b.countByte(new File(args[1]));
        } else if (args[0].equals("-l")){
             LineReader l = new LineReader();
             l.countLine(args[1]);
        }
    }
}