import java.util.HashMap;

/*Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.*/
class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (charCountMap.get(currentChar) == 1) {
                return currentChar;
            }
        }
        return '\0';
    }


    public class Q9 {
        public static void main(String[] args) {
            String inputString = "elephant";
            char firstNonRepeatingChar = findFirstNonRepeatingCharacter(inputString);
            if (firstNonRepeatingChar != '\0') {
                System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
    }
}

