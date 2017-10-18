package com.eaststartgroup.www;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("a.txt");
            out = new FileOutputStream("b.txt");
            System.out.println(in.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
