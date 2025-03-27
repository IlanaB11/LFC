/*
 *File: RollRace.java
 * roll 3 dice until a dice roll 6 3 times in a row 
 * Author: Ilana Berlin
 * Version 1.1 11/05/2024
 */

import java.util.Random;

public class RollRace {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int rolls = 0, sixes1 = 0, sixes2 = 0;

        System.out.println("Ready...Race!");

        do {
            if (die1.getValue() == 6) {
                ++sixes1;
            } else {
                sixes1 = 0; // reset counter//
            }
            if (die2.getValue() == 6) {
                ++sixes2;
            } else {
                sixes2 = 0; // reset counter//
            }
            ++rolls;
            die1.roll(); // reroll//
            die2.roll();

        } while (sixes1 != 3 && sixes2 != 3);

        System.out.print("After " + rolls + " rolls ");
        if (sixes1 == sixes2) {
            System.out.println("its a tie!");
        } else if (sixes1 > sixes2) {
            System.out.println("Dice 1 is the winner!");
        } else if (sixes1 < sixes2) {
            System.out.println("Dice 2 is the winner!");
        }

    }
}
