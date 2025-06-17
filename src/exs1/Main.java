package exs1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Part 1: if the string's length is even => true, else odd => false

        System.out.println("Insert a word:");
        String input = scanner.nextLine();
        boolean even = Exs1.evenOddString(input);

            if (even) {
            System.out.println("The string " + input + " is even.");
        } else {
            System.out.println("The string " + input + " is odd.");
            }

            // Part 2: leapYear
        System.out.println("Insert a year:");
        int year = scanner.nextInt();
        boolean leapYear = Exs1.leapYear(year);

        if(leapYear) {
         System.out.println("The year " + year + " is a leap year.");
        } else {
         System.out.println("The year " + year + " is not a leap year.");
        }

        scanner.close();
    }}
