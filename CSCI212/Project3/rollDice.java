/*
 *File: rollDice.java
 * roll 2 dice and print the statistics of the rolls
 * Author: Ilana Berlin
 * Version 1.0 11/04/2024
 */

import java.util.Random;

public class rollDice {
    public static void main(String[] args) {
        // create dice and record face values//
        Die die1 = new Die();
        int val1 = die1.getValue();
        Die die2 = new Die();
        int val2 = die2.getValue();

        // show value of the dice//
        System.out.println("First Die: " + die1.toString());
        System.out.println("Second Die: " + die2.toString());

        // show statistic of the dice//
        System.out.println("The sum is: " + (val1 + val2));
        System.out.println("The differance is: " + Math.abs(val1 - val2));
        System.out.println("The product is: " + (val1 * val2));

    }
}
