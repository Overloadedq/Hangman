package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ListWords {
    CorrectWords correctWords;




    public void PrintWords(String filepath) throws IOException
    {

        List<String> words = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {
            String line;
            while((line=br.readLine())!=null)
            {
                words.add(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        String[] wordArray = words.toArray(new String[0]);
        Random rand = new Random();
        int random_index = rand.nextInt(wordArray.length);
        String word = wordArray[random_index];
        if (correctWords != null) {
            correctWords.correctWord(word);
        } else {
            System.out.println("NULL");
        }
    }

}