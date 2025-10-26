package Logic;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
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




        scanner.close();
    }
}
