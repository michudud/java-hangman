package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WordRandomizer {
    public String wordRandomizer()  throws FileNotFoundException {
        WordsFileReader fileReader = new WordsFileReader();
        ArrayList<String> words = fileReader.readFile("src/main/resources/slowa.txt");
        int randomNumber = (int)(Math.random() * words.size());
        return words.get(randomNumber).toUpperCase();
    }
}
