// URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string 
// has sufficient space at the end to hold the additional characters, and that you are given the "true" 
// length of the string. (Note: If implementing in Java, please use a character array so that you can 
// perform this operation in place.) 
// EXAMPLE 
// Input: "Mr John Smith     " 13 
// Output: "Mr%20John%20Smith"

public class URLify {
    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        System.out.println("Expected: Mr%20John%20Smith");
        System.out.println("Actual: " + newString("Mr John Smith     ",13));

        System.out.println();

        System.out.println("Test Case 1:");
        System.out.println("Expected: Mr%20John%20Smith");
        System.out.println("Actual: " + newStringBuilder("Mr John Smith     ",13));
    }

    // O(n^2) complexity, iterating through a string -- > O(n), concatenating a string --> O(n)
    public static String newString(String originalString, int lengthOfString) {
        String result = "";
        char[] characterList = originalString.toCharArray();

        for(int i = 0; i < lengthOfString; i++){
            if (characterList[i] == ' '){
                result += "%20";
            } else {
                result += characterList[i];
            }
        }

        return result;
    }

    // O(n) complexity, iterating through a string --> O(n), append in StringBuilder --> O(1)
    public static StringBuilder newStringBuilder(String originalString, int lengthOfString) {
        StringBuilder result = new StringBuilder();
        char[] characterList = originalString.toCharArray();

        for(int i = 0; i < lengthOfString; i++){
            if (characterList[i] == ' '){
                result.append("%20");
            } else {
                result.append(characterList[i]);
            }
        }

        return result;
    }
}