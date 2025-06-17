package exs4;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a number: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
