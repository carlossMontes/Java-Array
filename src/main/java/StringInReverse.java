public class StringInReverse {

    public static String reversalString(String word){
        String reversal = "";

        // Iterates the word in reverse, and saves the letter
        for (int i = word.length() - 1; i >= 0; i--) {
            reversal = reversal + word.charAt(i);
        }

        return reversal;
    }
    public static void main(String[] args) {
        String word = "!dlroW ,olleH";

        System.out.println(reversalString(word));
    }
}
