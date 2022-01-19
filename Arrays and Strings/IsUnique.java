import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println("ArrayList --> ");
        System.out.println();
        System.out.println("Test case 1: [abcdefg]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByArrayList("abcdefg"));
        System.out.println();
        System.out.println("Test case 2: [aaarqgn]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByArrayList("aaarqgn"));
        System.out.println();
        System.out.println("Test case 3: [qdahgq]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByArrayList("qdahgq"));
        System.out.println();
        System.out.println("Test case 4: [Investor]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByArrayList("Investor"));
        System.out.println("-------------------------");;

        System.out.println();

        System.out.println("HashMap --> ");
        System.out.println();
        System.out.println("Test case 1: [abcdefg]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByHashMap("abcdefg"));
        System.out.println();
        System.out.println("Test case 2: [aaarqgn]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByHashMap("aaarqgn"));
        System.out.println();
        System.out.println("Test case 3: [qdahgq]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByHashMap("qdahgq"));
        System.out.println();
        System.out.println("Test case 4: [Investor]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByHashMap("Investor"));
        System.out.println("-------------------------");;

        System.out.println();

        System.out.println("HashSet --> ");
        System.out.println();
        System.out.println("Test case 1: [abcdefg]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByHashSet("abcdefg"));
        System.out.println();
        System.out.println("Test case 2: [aaarqgn]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByHashSet("aaarqgn"));
        System.out.println();
        System.out.println("Test case 3: [qdahgq]");
        System.out.println("Expected Result: false");
        System.out.println("Actual Result: " + checkUniqueByHashSet("qdahgq"));
        System.out.println();
        System.out.println("Test case 4: [Investor]");
        System.out.println("Expected Result: true");
        System.out.println("Actual Result: " + checkUniqueByHashSet("Investor"));
    }

    // O(n^2) complexity (contains() in arrayList --> O(n) complexity, iterating through a string --> O(n) complexity, since contained is within the for loop, complexity for this algo -->  O(n^2))
    public static boolean checkUniqueByArrayList (String word) {
        ArrayList<Character> checkList = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (checkList.contains(word.charAt(i))) {
                return false;
            } else {
                checkList.add(word.charAt(i));
            }
        }

        return true;
    }

    // O(n) complexity (searching for key in hashmap --> O(1), iterating through a string --> O(n) complexity)
    public static boolean checkUniqueByHashMap (String word) {
        HashMap<Character, Integer> checkList = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (checkList.containsKey(word.charAt(i))) {
                return false;
            } else {
                checkList.put(word.charAt(i), 1);
            }
        }

        return true;
    }

    public static boolean checkUniqueByHashSet (String word) {
        HashSet<Character> checkList = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            if (checkList.contains(word.charAt(i))) {
                return false;
            } else {
                checkList.add(word.charAt(i));
            }
        }

        return true;
    }
}