// String Compression: Implement a method to perform basic string compression using the counts 
// of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
// "compressed" string would not become smaller than the original string, your method should return 
// the original string. You can assume the string has only uppercase and lowercase letters (a - z). 

import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println("Test case 1:");
        System.out.println("Expected: a2b1c5a3");
        System.out.println("Actual: " + compressString("aabcccccaaa"));

        System.out.println();

        System.out.println("Test case 2:");
        System.out.println("Expected: a2b1c5");
        System.out.println("Actual: " + compressString("aabccccc"));

        System.out.println();

        System.out.println("Test case 3:");
        System.out.println("Expected: a2b1c5a3");
        System.out.println("Actual: " + compressString("aabcccccaaa"));

        System.out.println();

        System.out.println("Test case 4:");
        System.out.println("Expected: abc");
        System.out.println("Actual: " + compressString("abc"));

        System.out.println();

        System.out.println("Test case 5:");
        System.out.println("Expected: abcdefghijklmnop");
        System.out.println("Actual: " + compressString("abcdefghijklmnop"));

        System.out.println();
    }

    // O(n) complexity (iterating through a string --> O(n), appending StringBuilder --> O(1), putting element in HashMap --> O(1), contains function in HashMap --> O(1))
    public static String compressString(String word) {
        HashMap<Character, Integer> characterList = new HashMap<>();
        StringBuilder newString = new StringBuilder();

        characterList.put(word.charAt(0), 1);

        for (int i = 1; i < word.length(); i++) {
            if (characterList.containsKey(word.charAt(i))) {
                characterList.put(word.charAt(i), characterList.get(word.charAt(i)) + 1);
            } else {
                newString.append(word.charAt(i - 1));
                newString.append(characterList.get(word.charAt(i-1)));
                characterList.clear();
                characterList.put(word.charAt(i), 1);
            }
        }

        newString.append(word.charAt(word.length() - 1));
        newString.append(characterList.get(word.charAt(word.length() - 1)));

        if (newString.length() > word.length()) return word;
        return newString.toString();
    }
}