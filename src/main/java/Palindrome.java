public class Palindrome {

    public static boolean isPalindrome(String word){
        // Convert the world to upper case and eliminate spaces
        word = word.toUpperCase();
        word = word.replaceAll("\\s","");
        // Total of position for array
        int totalChars = word.length() - 1;

        // Iterates over all the world, comparing in order and reversal order
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(totalChars - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "anita lava la tina";

        System.out.println(isPalindrome(word));
    }
}
