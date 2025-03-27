package Project1;
/*
 *File: TicketPriceCalculator.java
 * Calculate ticket details for a Broadway show from user input
 * Author: Ilana Berlin
 * Version 1.8 09/20/2024
 */

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // initialize variables//
        int numTickets, regularTickets = 0, kidTickets = 0, seniorTickets = 0, holderAge;
        char showTime, showDay;
        boolean matineeShow = false;
        double ticketPrice, discountPercent = 0.0;

        // determine when the show is//
        System.out.println("Enter show information: ");
        System.out.println("Is the show on the weekend: (y/n)");
        showDay = scnr.next().charAt(0);

        // make sure user input is valid//
        if (showDay != 'y' && showDay != 'n') {
            System.out.println("Please enter yes or no");
            showDay = scnr.next().charAt(0);
        }

        // set ticket price - 100 for weekend, 80 for weekday//
        ticketPrice = (showDay == 'y') ? 100.0 : 80.0;

        // determine if matinee discount applies//
        System.out.println("What time is the show: (2PM or 7PM)");
        showTime = scnr.next().charAt(0);

        // make sure the input is a valid show time//
        while (showTime != '2' && showTime != '7') {
            System.out.println("Please enter a valid time");
            showTime = scnr.next().charAt(0);
        }

        // apply matinee discount if show time is 2PM//
        if (showTime == '2') {
            matineeShow = true; // else remains false//
            discountPercent += 0.10;
        }

        // determine if group discount applies//
        System.out.println("How many tickets do you want to purchase?");
        numTickets = scnr.nextInt();

        // apply group discount if group is larger than 8//
        if (numTickets >= 8) {
            discountPercent += 0.15;
        }

        // determine the age of ticket holders and if senior or kid discount applies//
        for (int i = 1; i <= numTickets; ++i) {
            System.out.println("How old is the ticket holder " + i + ": ");
            holderAge = scnr.nextInt();
            if (holderAge >= 65) {
                ++seniorTickets;
            } else if (holderAge < 5) {
                ++kidTickets;
            } else {
                ++regularTickets;
            }
        }

        scnr.close(); // done getting inputs//

        // Show user final ticket information//
        System.out.print("Your show is ");

        if (matineeShow) {
            System.out.print("at 2PM on a ");
        } else {
            System.out.print("at 7PM on a ");
        }

        // show user final price of tickets//
        System.out.println("You have " + numTickets + " tickets:");

        if (regularTickets > 0) {
            System.out.print("" + (regularTickets) + " regular ticket(s) at $");
            System.out.printf("%.2f", ticketPrice - ticketPrice * discountPercent);
            System.out.println(" per ticket.");
        }

        if (seniorTickets > 0) {
            System.out.print("" + seniorTickets + " senior ticket(s) at $");
            System.out.printf("%.2f", ticketPrice - (ticketPrice * (discountPercent + 0.20))); // senior discount//
            System.out.println(" per ticket.");
        }

        if (kidTickets > 0) {
            System.out.print("" + kidTickets + " child ticket(s). Kids under 5 get in free.");
        }

    }
}
