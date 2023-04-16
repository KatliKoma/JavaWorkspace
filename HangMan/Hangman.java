import java.util.*;
import javax.swing.*;

public class Hangman {
    
    private static final String[] WORDS = {"colour", "centre", "neighbour", "favourite", "behaviour", "honour", "organise", "realise", "theatre", "apologise"};
    private static final int MAX_GUESSES = 6;
    
    public static void main(String[] args) {
        Random rand = new Random();
        String word = WORDS[rand.nextInt(WORDS.length)];
        char[] guessedLetters = new char[word.length()];
        Arrays.fill(guessedLetters, '_');
        int numGuesses = 0;
        Set<Character> incorrectGuesses = new HashSet<>();
        while (numGuesses < MAX_GUESSES && new String(guessedLetters).contains("_")) {
            char guess = getGuess(incorrectGuesses);
            if (word.indexOf(guess) >= 0) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessedLetters[i] = guess;
                    }
                }
            } else {
                incorrectGuesses.add(guess);
                numGuesses++;
            }
            System.out.println("Guessed letters: " + new String(guessedLetters));
            System.out.println("Incorrect guesses: " + incorrectGuesses);
            System.out.println("Number of guesses left: " + (MAX_GUESSES - numGuesses));
        }
        if (new String(guessedLetters).contains("_")) {
            System.out.println("Sorry, you lose. The word was " + word);
        } else {
            System.out.println("Congratulations, you win! The word was " + word);
        }
    }
    
    private static char getGuess(Set<Character> incorrectGuesses) {
        while (true) {
            String guessStr = JOptionPane.showInputDialog("Enter a letter:");
            if (guessStr == null || guessStr.length() != 1) {
                JOptionPane.showMessageDialog(null, "Please enter a single letter.");
            } else {
                char guess = guessStr.charAt(0);
                if (!Character.isLetter(guess)) {
                    JOptionPane.showMessageDialog(null, "Please enter a letter.");
                } else if (incorrectGuesses.contains(guess)) {
                    JOptionPane.showMessageDialog(null, "You have already guessed that letter.");
                } else {
                    return guess;
                }
            }
        }
    }
}
