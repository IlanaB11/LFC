package Project2;
/*
 *File: zumbaAttendance.java
 * get the attenance of each zumba class for a month and save it to a yearly array
 * Author: Ilana Berlin
 * Version 1.0 10/16/2024
 */

import java.util.Scanner;

public class zumbaAttendance {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // create scanner//
        int[] yearlyArray = new int[12]; // create an array with 12 elements - one for each month//
        String[] monthAcronym = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        final int NUM_MONTHS = 12; // immutable variable//

        // get input from user and save to array//
        for (int i = 0; i < NUM_MONTHS; ++i) {
            System.out.println("Enter the number of attendees in " + monthAcronym[i] + ": "); // for readablility//
            yearlyArray[i] = scnr.nextInt();
        }
        scnr.close();

        // print the output in quarters//
        System.out.println("\nMonthly Zumba Attendance:");
        for (int i = 0; i < NUM_MONTHS; ++i) {
            if (i != 0 && i % 4 == 0) {
                System.out.println(); // start a new line after every 4th term//
            }
            System.out.print(monthAcronym[i] + ": " + yearlyArray[i] + " ");

        }

    }
}
