package Logic;

public class CorrectWords {
    public String word;

    public void correctWord(String word) {
        this.word = word;
        System.out.println("Получено слово: " + word);
    }

    public String getWord() {
        return word;
    }
}
