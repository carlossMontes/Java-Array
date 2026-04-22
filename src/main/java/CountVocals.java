public class CountVocals {

    public static int countVocalsForEach(String words){
        char[] vocals = {'A','a','E','e','I','i','O','o','U','u'};
        int countVocals = 0;

        // Iterates over all chars of the world, then iterates over the vocals and compare if the char is a vocal
        for (int i = 0; i < words.length(); i++) {
            char character = words.charAt(i);

            for (char vocal : vocals) {
                if (character == vocal) {
                    countVocals += 1;
                    break;
                }
            }
        }

        return countVocals;
    }

    public static int countVocalsFor(String words){
        char[] vocals = {'A','a','E','e','I','i','O','o','U','u'};
        int countVocals = 0;

        // Iterates over all chars of the world, then iterates over the vocals and compare if the char is a vocal
        for (int i = 0; i < words.length(); i++) {
            char character = words.charAt(i);

            for (int j = 0; j < vocals.length; j++) {
                if (character == vocals[j]) {
                    countVocals += 1;
                    break;
                }
            }
        }

        return countVocals;
    }

    public static void main(String[] args) {
        String words = "Carlos Alberto Montes Romero";

        System.out.println(countVocalsFor(words));
    }
}
