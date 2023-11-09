import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get initial phrase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word or a phrase.");
        String phrase = scanner.nextLine();
        phrase = trimExcess(phrase);

        // Do Split phrase
        String[] words = phrase.split(" ");
        String reversePhrase = "";

        // Combine into reverse phrase
        for (int i = words.length; i > 0; i--) {
            reversePhrase += words[i - 1];
            reversePhrase += " ";
        }

        // Print phrase
        System.out.println(reversePhrase);
    }

    public static String trimExcess(String phrase) {
        if (phrase.endsWith(" ")) {
            phrase = phrase.substring(0, phrase.length() - 1);
        }
        if (phrase.startsWith(" ")) {
            phrase = phrase.substring(1);
        }
        return phrase;
    }
}