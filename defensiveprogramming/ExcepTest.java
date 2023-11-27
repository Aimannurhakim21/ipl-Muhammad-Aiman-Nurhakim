package defensiveprogramming;

import java.io.*;

public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);

            // Additional code snippet
            String fileName = "example.txt";
            FileInputStream file = null;
            byte x;
            try {
                file = new FileInputStream(fileName);
                x = (byte) file.read();
            } catch (IOException i) {
                i.printStackTrace();
                System.out.println("Error reading or opening the file.");
                return;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
        System.out.println("Out of the block");
    }
}
