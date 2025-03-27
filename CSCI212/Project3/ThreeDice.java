/*
 *File: ThreeDice.java
 * roll 3 dice until the sum is 12
 * Author: Ilana Berlin
 * Version 1.0 11/04/2024
 */

import java.util.Random;

public class ThreeDice {
    public static void main(String[] args) {
        // create roll counter and dice//
        int numRolls = 0;
        int sum;
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();

        // create do loop to check sum//
        do {
            die1.roll();
            die2.roll();
            die3.roll();
            sum = 0; // reset sum//
            sum = die1.getValue() + die2.getValue() + die3.getValue(); // calculate the sum
            ++numRolls; // incremint the number of rolls//

        } while (sum != 12); // condition//

        System.out.println("Final Results\nFirst Die: " + die1.toString() + "\nSecond Die: " + die2.toString() +
                "\nThird Die: " + die3.toString() + "\nTotal Rolls: " + numRolls);
    }
}
