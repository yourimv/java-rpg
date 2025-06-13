package nl.vlam.rpg.input;

import java.util.Scanner;

public class CLIInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public int get() {
        return scanner.nextInt();
    }
}
