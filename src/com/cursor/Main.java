package com.cursor;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("~Start~");
        String string = "STR";
        while (true) {
            File file = new File("file.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                string += string + st;
            }
            System.out.println(string);
        }
    }
}
