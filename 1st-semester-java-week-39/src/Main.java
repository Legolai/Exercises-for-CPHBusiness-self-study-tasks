import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine()) // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine(); // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split("[, ?.@]+"); // Creates and array of strings, where each element
        // is a single
        // word
        // from
        // the
        // file.
        System.out.println(text.length);

        // printWordsStartingWith("Ø");

        // printWordsOfLength(3);

        // test dine metoder ved at kalde dem her:
        // printLongestWord();
        // printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLessFrequentLetter();
    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    // skriv dine metoder herunder:

    private static void printLongestWord() {
        String longestWord = "";
        for (String s : text) // for each word in text
        {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }
        System.out.println(longestWord);
    }

    private static void printFirstHalfOfEachWord() {
        for (String s : text) // for each word in text
        {
            if (s.length() > 1) {
                System.out.println(s);
                System.out.println(s.substring(0, s.length() / 2));
            } else {
                System.out.println(s);
            }
        }
    }

    private static HashMap<Character, Integer> getFrequentLetter() {
        HashMap<Character, Integer> letters = new HashMap<>();

        for (String s : text) {
            for (char c : s.toLowerCase().toCharArray()) {
                if (Character.isLetter(c)) {
                    if (letters.containsKey(c)) {
                        letters.put(c, letters.get(c) + 1);
                    } else {
                        letters.put(c, 1);
                    }
                }
            }
        }

        return letters;
    }

    private static HashMap<Character, Integer> sortMap(HashMap<Character, Integer> map, boolean mostCommonFirst) {

        ArrayList<Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        if (mostCommonFirst) {
            list.sort(Entry.<Character, Integer>comparingByValue().reversed());
        } else {
            list.sort(Entry.<Character, Integer>comparingByValue());
        }

        HashMap<Character, Integer> result = new LinkedHashMap<>();

        int limit = 10;
        for (Entry<Character, Integer> entry : list) {
            if (limit == 0) {
                break;
            }
            result.put(entry.getKey(), entry.getValue());
            --limit;
        }

        return result;
    }

    private static void printMostFrequentLetter() {
        HashMap<Character, Integer> letters = getFrequentLetter();

        var num = Collections.max(letters.entrySet(), Entry.<Character, Integer>comparingByValue());
        System.out.println("Most frequent letter: " + num.getKey() + " = " + num.getValue());

        HashMap<Character, Integer> result = sortMap(letters, true);
        System.out.println("Top 10 : Most frequent letters");
        result.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    private static void printLessFrequentLetter() {
        HashMap<Character, Integer> letters = getFrequentLetter();

        var num = Collections.min(letters.entrySet(), Entry.<Character, Integer>comparingByValue());
        System.out.println("Less frequent letter: " + num.getKey() + " = " + num.getValue());

        HashMap<Character, Integer> result = sortMap(letters, false);
        System.out.println("Top 10 : Less frequent letters");
        result.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
