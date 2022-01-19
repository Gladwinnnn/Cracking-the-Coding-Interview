// One Away: There are three types of edits that can be performed on strings: insert a character, 
// remove a character, or replace a character. Given two strings, write a function to check if they are 
// one edit (or zero edits) away. 
// EXAMPLE 
// pale, ple -> true 
// pales, pale -> true 
// pale, bale -> true 
// pale, bake -> false 

import java.util.*;

public class OneAway {
    public static void main(String[] args) {
        System.out.println("Test case 1:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + oneEditAway("pale", "ple"));

        System.out.println();

        System.out.println("Test case 2:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + oneEditAway("palse", "pale"));

        System.out.println();

        System.out.println("Test case 3:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + oneEditAway("pale", "bale"));

        System.out.println();

        System.out.println("Test case 4:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + oneEditAway("pale", "bake"));

        System.out.println();

        System.out.println("Test case 5:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + oneEditAway("palee", "ple"));

        System.out.println();
    }

    // O(n) complexity (putInHashMap function --> O(n), iterating through a HashMap --> O(n))
    public static boolean oneEditAway(String word1, String word2) {
        if (Math.abs(word1.length() - word2.length()) > 1) return false;

        HashMap<Character,Integer> characterList = new HashMap<>();

        putInHashMap(characterList, word1);
        putInHashMap(characterList, word2);

        int counter = 0;

        for (Character character:characterList.keySet()) {
            if (characterList.get(character) % 2 != 0) {
                counter++;
            }
        }

        return counter <= 2;
    }

    public static void putInHashMap(HashMap<Character,Integer> characterList, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!characterList.containsKey(word.charAt(i))) {
                characterList.put(word.charAt(i), 1);
            } else {
                characterList.put(word.charAt(i), characterList.get(word.charAt(i)) + 1);
            }
        }
    }
}