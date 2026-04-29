public class LongestWord {

    public static String longestStringForEach(String[] words){

        String longest = "";

        // Iterates through all the array with foreach, compares each word with the longest word
        for (String string : words) {
            // if the word is longer than the longest word, it changes the variable assignment
            if (string.length() > longest.length()) {
                longest = string;
            }
        }

        // return the longest word
        return longest;
    }

    public static String longestString(String[] words){

        String longest = "";

        // iterates through all the words with a for cycle
        for (int i = 0; i < words.length; i++) {
            // check if the word in position i is longer than the longest word
            if (words[i].length() > longest.length() ) {
                // true case: changes the variable value
               longest = words[i];  
            }
        }

        // return the longest word
        return longest;
    }

    public static void main(String[] args) {
        String[] words = {"Hola", "Adios", "Hello", "Goodbye"};
        System.out.println(longestString(words));
    }
}