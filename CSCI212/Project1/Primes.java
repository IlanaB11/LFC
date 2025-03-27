package Project1;
/*
 *File: Primes.java
 * print a series of prime numbers
 * Author: Ilana Berlin
 * Version 1.3 09/20/2024
 */

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // initialze variables//
        int numsToPrint, divNum, numsPrinted = 0, primeNum = 2;
        boolean isPrime = true;

        // get length of series from user//
        System.out.println("How many prime numbers would you like to generate?");
        numsToPrint = scnr.nextInt();

        System.out.println("Your prime numbers are: ");
        while (numsPrinted < numsToPrint) {
            // check if the number is divisible by anything else//
            for (divNum = 2; divNum < primeNum; ++divNum) {
                if (primeNum % divNum == 0) {
                    isPrime = false;
                }
            }
            // output the number if it is prime//
            if (isPrime) {
                System.out.print("" + primeNum + " ");
                ++numsPrinted;
            }
            isPrime = true; // reset boolean//
            ++primeNum; // increase the number for the next loop//
        }

    }
}
