package Project2;

/*
 *File: integerConversion.java
 * convert from a binary number to a decimal
 * Author: Ilana Berlin
 * Version 1.4 10/17/2024
 */

import java.util.Scanner;

public class integerConversion {

    public static int[] toNumArray(char[] userArray) {
        int[] userNumArray = new int[userArray.length];
        for (int i = 0; i < userArray.length; ++i) {
            userNumArray[i] = Character.getNumericValue(userArray[i]); // the numeric value of a number is the number//
        }

        return userNumArray;
    }

    public static boolean isBinary(int[] userNum) {
        boolean isBinary = true;
        for (int num : userNum) {
            if (num != 0 && num != 1) { // if the number is not 1 or 0//
                System.out.println("Not a binary number");
                isBinary = false;
                break;
            }
        }
        return isBinary;
    }

    public static int toDecimal(int[] binaryArray) {
        int[] binExponents = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int decimal = 0;
        for (int i = binaryArray.length - 1; i >= 0; --i) {
            decimal += (binaryArray[i] == 1) ? Math.pow(2, binExponents[binaryArray.length - 1 - i]) : 0;
            // add the 2 to the power of the exponent if the bit value is 1//
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        String userNumString = scnr.next(); // convert string to array of numbers//

        char[] userArray = userNumString.toCharArray(); // convert string to char array//
        int[] userNumArray = toNumArray(userArray); // convert char array to array of numbers//

        while (!isBinary(userNumArray)) { // check that the number is binary - could not get do loop working//
            System.out.println("Enter a binary number: ");
            userNumString = scnr.next(); // convert string to array of numbers//

            userArray = userNumString.toCharArray(); // convert string to char array//
            userNumArray = toNumArray(userArray); // convert char array to array of numbers//

        }

        // print decimal value of binary//
        System.out.println("\nYou have entered" + toDecimal(userNumArray));

        scnr.close();
    }
}
