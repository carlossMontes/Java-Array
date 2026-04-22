public class CountWord {

    // Memory efficient but slower
    public static int countWords(String word){
        // Declares the separator of words and the count
        char space = ' ';
        int count = 0;

        // Iterates over the phrase and compares the char with the space
        for (int i = 0; i < word.length() - 1; i++) {
            char letter = word.charAt(i);
            if (Character.compare(letter, space) == 0) {
                count++;
            }
        }

        return count + 1;
    }

    // Uses built-in methods but memory inefficient
    public static int splitWord(String word){
        // Divides the phrase into an array spliting by spaces
        String[] array = word.split(" ");

        return array.length;
    }

    public static void main(String[] args) {
        String phrase = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        System.out.println(countWords(phrase));
    }
}
