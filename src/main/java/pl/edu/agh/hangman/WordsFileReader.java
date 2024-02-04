package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsFileReader {
    private static ArrayList<String> readFile(String filepath) throws FileNotFoundException {
        File poemFile = new File(filepath);
        Scanner scanner = new Scanner(poemFile);
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(poemFile.toPath())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);
        }
        return words;
    }

}
