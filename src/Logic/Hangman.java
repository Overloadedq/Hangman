package Logic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) throws IOException {

        StartsApp starts = new StartsApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            starts.ShowStartMessage();
            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    Start game = new Start();
                    game.start();
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
        scanner.close();
    }
}
