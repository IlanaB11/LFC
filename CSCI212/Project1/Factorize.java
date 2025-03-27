package Project1;
/*
 *File: Factorize.java
 * Calculate the prime factorization of a number 
 * Author: Ilana Berlin
 * Version 1.6 09/20/2024
 */

import java.util.Scanner;

public class Factorize {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // initialize variables//
        int inputNum, factorizeNum, factor, checkFactorize = 1;
        boolean isPrime = true;

        // get number from user//
        System.out.println("What number do you want the prime factors of?");
        inputNum = scnr.nextInt();

        // ensure the number is valid//
        while (inputNum <= 1) {
            System.out.println("Please enter a number greater than 1");
            inputNum = scnr.nextInt();
        }

        scnr.close(); // done getting inputs//

        // copy input//
        factorizeNum = inputNum;

        // check if input is already a prime number - using code from Primes project//
        for (factor = 2; factor < factorizeNum; ++factor) {
            if (factorizeNum % factor == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("" + inputNum + " is a prime number.\nIts only factor is itself.");
        } else {
            System.out.println("The prime factors of your number are: ");
            for (factor = 2; factor < inputNum; ++factor) {
                // check if number is divisible by prime factor//
                while (factorizeNum % factor == 0) {
                    System.out.print("" + factor + " ");
                    checkFactorize *= factor;
                    factorizeNum /= factor;
                }
            }

            // double check results//
            if (checkFactorize != inputNum) {
                System.out.println("ERROR");
            }
        }
    }
}
