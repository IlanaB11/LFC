package Project1;
/*
 *File: ValidatedDate.java
 * Check if input is a valid date between 1900 and 2024
 * Author: Ilana Berlin
 * Version 1.6 09//20/2024
 */

import java.util.Scanner;

public class ValidatedDate {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // initialize variables//
        int year, month, day, daysInMonth = 31;
        boolean isLeapYear = false;

        // get the year from user//
        System.out.println("Enter the year: ");
        year = scnr.nextInt();

        // make sure the year is a valid number within range//
        while ((year < 1900) || (year > 2024)) {
            System.out.println("Please enter a year within range (1900 - 2024):");
            year = scnr.nextInt();
        }

        // determine if year is a leap year - use code from zyBooks Lab//
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        // get the month from the user//
        System.out.println("Enter the month: ");
        month = scnr.nextInt();

        // make sure the month is a valid number//
        while ((month < 1) || (month > 12)) {
            System.out.println("Please enter a valid month:");
            month = scnr.nextInt();
        }

        // set the correct number of days in the month - default is 31//
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            daysInMonth = 30; // Apr, Jun, Sep, and Nov have 30 days//
        } else if (month == 2) {
            if (isLeapYear) {
                daysInMonth = 29; // Feb has 29 days on a leap year//
            } else {
                daysInMonth = 28; // Feb has 28 days when its not a leap year//
            }
        }

        // get the day from the user//
        System.out.println("Enter the day: ");
        day = scnr.nextInt();

        // make sure the day is a valid number//
        while ((day < 1) || (day > daysInMonth)) {
            System.out.println("Please enter a valid day:");
            day = scnr.nextInt();
        }

        scnr.close(); // done getting inputs//

        // output final date//

        System.out.println("The date " + month + "/" + day + "/" + year + " is a valid date.");

    }
}
