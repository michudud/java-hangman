import pl.edu.agh.hangman.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        int failsCounter = 0;
        //if game mode == 1 - word = scanner input, mode == 2 word = getWordAPI(), mode = 3 word randomizer from list
        String word = new WordRandomizer().wordRandomizer();
        String wordState = new String(new char[word.length()]).replace('\0', '_');
        String[] hangmanState = Hangman.HANGMANPICS;

        WordChecker wordChecker = new WordChecker();

        System.out.println("HANGMAN GAME");

        while(true){
            if(!wordState.equals(word) && failsCounter < hangmanState.length-1){
                System.out.println(hangmanState[failsCounter]);
                System.out.println(wordState);

                InputHandler inputHandler = new InputHandler();
                String letter = inputHandler.scanLetter();
                String checkedWord = wordChecker.Check(word,letter,wordState);
                if(!(checkedWord == null)){
                    wordState = checkedWord;
                }else{
                    failsCounter++;
                }
            }else{
                if(failsCounter == hangmanState.length-1){
                    System.out.println(hangmanState[failsCounter]);
                    System.out.println("¯\\_(ツ)_/¯");
                    System.out.println("Not this time");
                }else{
                    System.out.println(word);
                    System.out.println("◝(ᵔᵕᵔ)◜");
                    System.out.println("Congratulations!");
                }
                break;
            }

        }

    }
}
