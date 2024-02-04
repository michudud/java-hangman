import pl.edu.agh.hangman.WordsFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        String word = wordRandomizer();
        System.out.println(word);
    }

    private static String wordRandomizer()  throws FileNotFoundException {
        WordsFileReader fileReader = new WordsFileReader();
        ArrayList<String> words = fileReader.readFile("src/main/resources/slowa.txt");
        int randomNumber = (int)(Math.random() * words.size());
        return words.get(randomNumber).toUpperCase();
    }
}
