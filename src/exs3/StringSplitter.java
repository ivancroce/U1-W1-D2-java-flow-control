package exs3;

import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert a word (or :q to quit): ");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Quit...");
                break; // exit the loop
            }

            System.out.print("Separated word: ");
            for (int i = 0; i < input.length(); i++) {
                // to extract every char from the current position (i)
                char character = input.charAt(i);

                // to print the single character
                System.out.print(character);

                // to add a comma "," only if we are not at the last character.
                if (i < input.length() - 1) {
                    System.out.print(",");
                }
            }
            // double empty line to separate properly the output
            System.out.println();
            System.out.println();

        }
        scanner.close(); // To close the scanner once we go out from the while loop

        System.out.println("Done."); // A final message to confirm that the program has finished successfully.
    }
}
