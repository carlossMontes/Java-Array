public class ReplaceChars {

    // Understand the logic and control the chars to replace
    public static String replaceChars(String word, char letterToReplace, char replace){
        StringBuilder newWord = new StringBuilder();

        // Iterates over the phrase, looks for the char to replace and replaces it
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letterToReplace) {
                newWord.append(replace);
            } else {
                newWord.append(word.charAt(i));
            }
        }

        return newWord.toString();
    }

    // Better performance and works with string patterns
    public static String replaceMethod(String word, String letterToReplace, String replace){
        // Uses the method provided by java
        return word.replaceAll(letterToReplace, replace);
    }
    public static void main(String[] args) {
        String word = "Hola";

        System.out.println(replaceMethod(word, "a", "x"));
    }
}
