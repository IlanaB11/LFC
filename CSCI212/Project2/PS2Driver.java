package Project2;

/*
 *File: PS2.Driver.java
 * Create methods outlined in problem set 2 assignment
 * total a 2D array into a 1D of array of each of the column sums:
 * determine the index of the world with the most vowels in a string array 
 * create a perimeter of o around xs in a 2D array
 * Author: Ilana Berlin
 * Version 1.0 10/16/2024
 */
import java.util.Scanner;
import java.util.Arrays;

public class PS2Driver {
    public static int[] totals(int[][] userArray2D) {
        // this only works if the number of columns = number of rows//
        // Take in the 2D array and find the sum of each column//
        int[] sumArray = new int[userArray2D[0].length];
        int sum = 0;
        for (int i = 0; i < userArray2D[0].length; ++i) { // i = column number//
            for (int n = 0; n < userArray2D.length; ++n) { // n = row number//
                sum += userArray2D[n][i];
            }
            sumArray[i] = sum; // save to 1D array//
            sum = 0; // reset sum for next row//
        }

        return sumArray; // return the array of sums//
    }

    public static int vowels(String[] alpha) {
        // Take in an array of Strings and return the index of the word with most
        // vowels//
        int mostVowelsIndex = 0, numVowels = 0, maxVowels = 0;
        String testWord, vowels = "AEIOUaeiou"; // set vowels//

        for (int i = 0; i < alpha.length; ++i) {
            testWord = alpha[i];
            for (int n = 0; n < testWord.length(); ++n) {
                if (vowels.indexOf(testWord.charAt(n)) != -1) { // if the index exists//
                    ++numVowels; // increment the number of vowels//
                }
            }
            if (numVowels > maxVowels) {
                maxVowels = numVowels; // update the max number of values//
                mostVowelsIndex = i; // save the index//
            }
            numVowels = 0; // reset numVowels for the next word//
        }

        return mostVowelsIndex; // return the index//
    }

    public static void border(char[][] userArray) {
        // take in 2D array and makes it a block of x surrounded by o//
        for (int i = 0; i < userArray.length; ++i) { // i = columns number //
            for (int n = 0; n < userArray[i].length; ++n) { // n = row number//
                if (i == 0 || i == userArray.length - 1 || n == 0 || n == userArray[i].length - 1) {
                    userArray[i][n] = 'o'; // set perimeter to 'o'//
                } else {
                    userArray[i][n] = 'x'; // set everything else to 'x'//
                }
            }
        }
        // no return statement - array is modified//
    }

    public static void main(String[] args) {
        // test totals//
        int[][] testArray = {
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 },
                { 1, 2, 3, 4 }
        };
        int[] sumArray = totals(testArray);
        for (int i = 0; i < sumArray.length; ++i) {
            System.out.println(sumArray[i]);
        }

        // test vowels//
        String[] myStrings = { "AEIou", "Two", "Three", "Four" };
        System.out.println("\n" + vowels(myStrings) + "\n");

        // test border//
        char[][] borderArray = {
                { 'a', 'b', 'c', 'd', 'e', 'f' },
                { 'a', 'b', 'c', 'd', 'e', 'f' },
                { 'a', 'b', 'c', 'd', 'e', 'f' },
                { 'a', 'b', 'c', 'd', 'e', 'f' },
                { 'a', 'b', 'c', 'd', 'e', 'f' }
        };
        border(borderArray);

        for (char[] row : borderArray) {
            for (char letter : row) {
                System.out.print(letter);
            }
            System.out.println();
        }

    }
}
