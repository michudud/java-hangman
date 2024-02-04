import pl.edu.agh.hangman.Hangman;
import pl.edu.agh.hangman.WordRandomizer;
import pl.edu.agh.hangman.WordsFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        int failsCounter = 0;
        String word = new WordRandomizer().wordRandomizer();
        String wordState = new String(new char[word.length()]).replace('\0', '_');
        String[] hangmanState = Hangman.HANGMANPICS;

        while(failsCounter < 6){
            System.out.println(hangmanState[0]);
        }

        System.out.println(word);
        System.out.println(wordState);
    }
}
