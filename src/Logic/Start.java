package Logic;

import java.io.IOException;

public class Start {
    public void start() throws IOException {



        CorrectWords correctWords = new CorrectWords();
        InputGame inputGame = new InputGame();
        ListWords file = new ListWords();
        file.correctWords = correctWords;
        inputGame.correctWords = correctWords;

        String filepath = "resources/words.txt";
        file.PrintWords(filepath);
        inputGame.Enter_char();
    }
}
