/*Count the Number of Words in a String: Write a function to count
the number of words in a given string. Words are separated by spaces or punctuation.
For example, the input "Hello, world!" should return 2.*/

class WordCounter {
    public static int countWordsInString(String inputString) {
        String[] words = inputString.split("\\W+");
        return words.length;
    }

    public class Q7 {
        public static void main(String[] args) {
            String inputString = "Elephant, giraffe and zebra are in the zoo!";
            int wordCount = countWordsInString(inputString);
            System.out.println("The number of words in the input string is: " + wordCount);

        }
    }
}

