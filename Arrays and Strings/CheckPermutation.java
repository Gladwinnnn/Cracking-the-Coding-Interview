// Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 
import java.util.*;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isPermutationWithHashMap("hello", "lloeh"));

        System.out.println();

        System.out.println("Test Case 2:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isPermutationWithHashMap("hell", "lloeh"));
        
        System.out.println();

        System.out.println("Test Case 3:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isPermutationWithHashMap("hello", "byeee"));
                
        System.out.println();

        System.out.println("Test Case 4:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isPermutationWithHashMap("racecar", "acercar"));

        System.out.println();
        System.out.println("----------------");

        System.out.println("Test Case 1:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isPermutationWithSort("hello", "lloeh"));

        System.out.println();

        System.out.println("Test Case 2:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isPermutationWithSort("hell", "lloeh"));
        
        System.out.println();

        System.out.println("Test Case 3:");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isPermutationWithSort("hello", "byeee"));
                
        System.out.println();

        System.out.println("Test Case 4:");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isPermutationWithSort("racecar", "acercar"));
    }

    // O(n) complexity, iterating through the strings and inserting them in a hashmap --> O(n), contains function in hashmap --> O(1)
    public static boolean isPermutationWithHashMap(String word1, String word2) {
        HashMap<Character,Integer> characterListForWord1 = new HashMap<>();
        HashMap<Character,Integer> characterListForWord2 = new HashMap<>();
        
        if (word1.length() != word2.length()) return false;
        
        for (int i = 0; i < word1.length(); i++){
            if (!characterListForWord1.containsKey(word1.charAt(i))) {
                characterListForWord1.put(word1.charAt(i), 1);
            } else {
                characterListForWord1.put(word1.charAt(i), characterListForWord1.get(word1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < word2.length(); i++){
            if (!characterListForWord2.containsKey(word2.charAt(i))) {
                characterListForWord2.put(word2.charAt(i), 1);
            } else {
                characterListForWord2.put(word2.charAt(i), characterListForWord2.get(word2.charAt(i)) + 1);
            }
        }

        return characterListForWord1.equals(characterListForWord2);
    }

    // O(nlogn) complexity, Arrays.sort() --> O(nlogn), toCharArray() --> O(n)
    public static boolean isPermutationWithSort (String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        return sort(word1).equals(sort(word2));
    }

    public static String sort(String word) {
        char[] characterList = word.toCharArray();
        Arrays.sort(characterList);
        return new String(characterList);
    }
}