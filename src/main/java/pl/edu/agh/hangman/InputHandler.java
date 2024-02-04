package pl.edu.agh.hangman;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler () {
        this.scanner = new
                Scanner(System.in);
    }

    public String scanLetter() {
        System.out.println("Guess a letter in the word");
        String input = scanner.nextLine();

        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Provide only 1 letter.");
            input = scanner.nextLine();
        }

        return input;
    }

}

