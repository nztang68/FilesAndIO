package com.eaststartgroup.www;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("a.txt");
            out = new FileOutputStream("b.txt");
            Scanner s = new Scanner(new BufferedReader(new FileReader("a.txt")));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
            s.close();
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
