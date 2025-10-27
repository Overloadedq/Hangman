package Logic;

import java.io.IOException;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws IOException {
        StartsApp starts = new StartsApp();
        starts.ShowStartMessage();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option)
        {
            case 1:
                System.out.println("Game");
                break;
            case 2:
                break;
        }

        ListWords file = new ListWords();
        String filepath = "resources/words.txt";
        file.PrintWords(filepath);


        scanner.close();
    }
}
