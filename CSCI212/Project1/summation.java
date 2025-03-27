package Project1;

/*
 *File: wedSep18.java
 * Get the sum of 3 numbers and output a corresponding color
 * Author: Ilana Berlin
 * Version 1.0 09//18/2024
 */
import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // initialize values//
        int numSum = 0;

        // Prompt the user//
        System.out.println("Enter 3 numbers: ");

        // get the sum of the 3 numbers//
        for (int i = 0; i < 3; ++i) {
            numSum += scnr.nextInt();
        }

        // show appropriate output//
        if (numSum % 8 == 0) {
            if ((Math.abs(numSum) % 10 == 4) || (Math.abs(numSum) % 10 == 4)) {
                System.out.println("blue"); // number is divisible by 8 and last digit is 4 or 8//
            } else {
                System.out.println("red"); // number is divisible by 8//
            }
        } else {
            System.out.println("green"); // number is NOT divisible by 8//
        }

        scnr.close();

    }
}