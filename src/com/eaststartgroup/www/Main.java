package com.eaststartgroup.www;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("a.txt");
            out = new FileWriter("b.txt");
            Scanner s = new Scanner(new BufferedReader(new FileReader("a.txt")));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
            int c;
            while ( (c = in.read()) != -1) {
                out.write(c);
            }
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
