package nl.vlam.rpg.shared.input;

import java.util.Scanner;

public class CLIInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public int get() {
        // must be integer input
        while (true) {
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
