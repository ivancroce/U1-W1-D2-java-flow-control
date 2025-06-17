package exs2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insert a number between 0 and 3:");
    int number = scanner.nextInt();

    String word = Exs2.numberToWord(number);
    System.out.println(word);

    scanner.close();
    }
}
