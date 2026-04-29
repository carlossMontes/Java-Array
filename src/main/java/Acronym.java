public class Acronym {

    public static String acronym(String[] words){

        // repository for the first letter of each element
        String concat = "";

        // foreach cycle to iterate all the word
        for (String string : words) {
            // concatenates the first letter of the element
            concat = concat + string.charAt(0);
        }

        return concat;
    }

    public static String acronymFor(String[] word){

        // variable to build the acronym
        String concat = "";

        // iterates all the words and concatenates the first letter
        for (int i = 0; i < word.length; i++) {
            concat = concat + word[i].charAt(0);
        }

        // returns the acronym
        return concat;
    }

    public static void main(String[] args) {
        String[] wordsSpanish = {"Hoy", "Organizamos", "La", "Aventura", " ", "Más", "Universal", "Navegando", "Descubrimientos", "Océanos"};
        String[] wordsEnglish = {"Humans", "Explore", "Life", "Learning", "Over", " ", "Wonders", "Of", "Realms", "Lands", "Dreams"};

        System.out.println(acronym(wordsEnglish));
        System.out.println(acronymFor(wordsSpanish));
    }
}
