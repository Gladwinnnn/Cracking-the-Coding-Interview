// Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. 
// A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 
// EXAMPLE 
// Input: Tact Coa 
// Output: True (permutations: "taco cat", "atco eta", etc.) 

import java.util.*;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println("Test case 1:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("Tact Coa"));

        System.out.println();

        System.out.println("Test case 2:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("racecar"));

        System.out.println();

        System.out.println("Test case 3:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("aa"));

        System.out.println();

        System.out.println("Test case 4:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("aap"));

        System.out.println();

        System.out.println("Test case 5:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("ppaa"));

        System.out.println();

        System.out.println("Test case 6:");
        System.out.println("Expected: true");
        System.out.println("Actual: "+ isPalindromePermutation("p"));

        System.out.println();

        System.out.println("Test case 7:");
        System.out.println("Expected: false");
        System.out.println("Actual: "+ isPalindromePermutation("pppaaooo"));

        System.out.println();
    }

    // O(n) complexity (iterating through a string --> O(n), iterating through a hashmap --> O(n), contains and put in hashmap O(1))
    public static boolean isPalindromePermutation (String word) {
        HashMap<Character, Integer> characterList = new HashMap<>();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if ((int)word.charAt(i) == 32) continue;
            else if (!characterList.containsKey(word.charAt(i))) {
                characterList.put(word.charAt(i), 1);
            } else {
                characterList.put(word.charAt(i), characterList.get(word.charAt(i)) + 1);
            }
        }

        boolean status = false;

        for (char character:characterList.keySet()) {
            if (characterList.get(character) % 2 != 0 && !status) status = true;
            else if (characterList.get(character) % 2 != 0 && status) return false;
        }
        return true;
    }


}