package org.example;
import java.io.File;
public class Main {
    public static void main(String[] args) {

        if(args[0].equals("-c")){
            ByteReader b = new ByteReader();
            b.countByte(new File(args[1]));
        }
    }
}