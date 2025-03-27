package Project2;

/*File: minMaxAverage.java
 * use arrays and loops to get the min, max, and, average of 10 integers
 * Author: Ilana Berlin
 * Version 1.0 10/17/2024
 */

import java.util.Scanner;

public class minMaxAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_NUMS = 10; // immutable variable//
        int[] userNumsArray = new int[NUM_NUMS];
        int min, max, average = 0;
        for (int i = 0; i < NUM_NUMS; ++i) {
            System.out.println("Enter number " + (i + 1) + ":");// get user input//
            userNumsArray[i] = scnr.nextInt();
        }

        min = userNumsArray[0];// set initail values//
        max = userNumsArray[0];

        for (int num : userNumsArray) {
            if (num < min) {
                min = num; // check min//
            }
            if (num > max) {
                max = num; // check max//
            }
            average += average; // add average to find sum//
        }

        average /= 10.0; // divde by number of numbers//

        // print min max and average//
        System.out.println("\nMin: " + min + "\nMax: " + max + "\nAverage: " + average);

        scnr.close();

    }
}
