package Logic;

import java.util.Arrays;
import java.util.Scanner;

public class InputGame {
    CorrectWords correctWords;

    public char[] Unknow_word()
    {
        String word = correctWords.getWord();
        char[] unknow_word = new char[correctWords.getWord().length()];


        for (int i = 0; i < word.length(); i++) {
            unknow_word[i] = '_';
        }

        return unknow_word;
    }
    public void Enter_char()
    {
        Scanner sc = new Scanner(System.in);
        String word = correctWords.getWord();

        char[] result = Unknow_word();
        int attempts =6;
        while (attempts > 0&&(!Arrays.equals(result, word.toCharArray())))
        {
            System.out.println("Current condition: "+Arrays.toString(result));
            System.out.println("Enter your letter:");
            char letter = sc.next().charAt(0);
            boolean correct=false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    result[i] = letter;
                    correct=true;
                }
            }
            if (!correct)
            {
                System.out.println("Wrong letter");
                attempts--;
                System.out.println("Attempts left: "+attempts);
            }
            if(Arrays.equals(result, word.toCharArray()))
            {
                System.out.println("You win");
                return;
            }
        }
        if(!Arrays.equals(result, word.toCharArray()))
        {
            System.out.println("You lost");
            System.out.println("The word is: "+word);
        }
        sc.close();

    }
}
