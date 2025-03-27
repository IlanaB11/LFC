package Project1;
/*
 *File: hotelRate.java
 * Discount hotel rate for aniverseries
 * Author: Ilana Berlin
 * Version 1.0 09/20/2024
 */

import java.util.Scanner;

public class hotelRate {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        float hotelRate = 200;
        char isAni;
        int yearsMarried;

        System.out.println("Is today your aniversery?  (y/n)");
        isAni = scnr.next().charAt(0);

        if (isAni == 'y') {
            System.out.println("How many years have you been married?");
            yearsMarried = scnr.nextInt();
            if (yearsMarried >= 20) {
                hotelRate -= (hotelRate * 0.15);
            } else if (hotelRate >= 10) {
                hotelRate -= (hotelRate * 0.10);
            } else {
                hotelRate -= (hotelRate * 0.5);
            }

        }

        System.out.print("Your rate is $");
        System.out.printf("%.2f", hotelRate);
        System.out.println(" per night.");

        scnr.close();
    }
}
