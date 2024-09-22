package WordGames;

/**
 * The WordGames class provides simple methods for manipulating strings.
 *
 * Author: Hana Debay
 */
class WordGames {
    /**
     * Adds "Hello" to the input word.
     *
     * @param word the input string to which "Hello" will be added
     * @return a string in the format "Hello [word]"
     */
    public String addHelloWord(String word) {

        return "Good " + word;
    }

    /**
     * Concatenates a name and surname into a full name.
     *
     * @param name the first name
     * @param surname the last name
     * @return the full name in the format "name surname"
     */
    public String getFullName(String name, String surname) {

        return name + " " + surname;
    }
}

/**
 * The Tester class is used to test the methods of the WordGames class.
 *
 * Author: Hana Debay
 */
public class Tester {
    public static void main(String[] args) {
        // Create a new WordGames object
        WordGames wordGames = new WordGames();

        // Test addHelloWord method and print the result
        String helloResult = wordGames.addHelloWord("Morning!");
        System.out.println(helloResult);

        // Test getFullName method and print the result
        String fullNameResult = wordGames.getFullName("Hana", "Debay");
        System.out.println(fullNameResult);
    }
}


