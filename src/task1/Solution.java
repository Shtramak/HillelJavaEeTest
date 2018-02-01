package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
Write a program to find all distinct words from a text file.
Ignore chars like    ".,/-;:" and Ignore case sensitivity.
*/

public class Solution {
    private static final String FILE_PATH = "d:/test.txt";

    public static void main(String[] args) {
        System.out.println(distinctWordsFromFile(FILE_PATH));
    }

    public static Collection<String> distinctWordsFromFile(String stringFilePath) {
        Path filePath = Paths.get(stringFilePath);
        return splitedLinesWithSeparators(filePath);
    }

    private static Collection<String> splitedLinesWithSeparators(Path filePath) {
        Set<String> distinctWords = new LinkedHashSet<>();
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (String line : fileLines) {
                String[] words = line.split("[.,/\\-;:]");
                distinctWords.addAll(Arrays.asList(words));
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurs reading from the file. Check if the file exists.");
        }
        return distinctWords;
    }
}