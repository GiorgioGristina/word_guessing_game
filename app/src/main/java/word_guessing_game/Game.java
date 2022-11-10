package word_guessing_game;

import java.util.Random;

public class Game {
    String wordToGuess;
    Integer attempt;
    final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    public Game(String word){
        wordToGuess = word;
        attempt = 10;
  
    
    }

    
    public String getRandomWordFromDictionary() {
        Integer randomIndex = new Random().nextInt(DICTIONARY.length);
        return DICTIONARY[randomIndex];
    }
    
    public static void main(String[] args) {
    //    Game g = new Game("MAKERS");
    // // String wordToGuess = "MAKERS";
    //    System.out.println(g.DICTIONARY);
    }

    // public String getWordToGuess(){
    //     Integer endOfIndex = wordToGuess.length();
    //     StringBuilder builder = new StringBuilder(wordToGuess);
    //     String underSc = ("_").repeat(endOfIndex - 1);
    //     StringBuilder output = builder.replace(1, endOfIndex, underSc );
    //     return output.toString();
      
    // }
    public  String getWordToGuess() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            Character currentLetter = wordToGuess.charAt(i);
            if (i == 0) {
                builder.append(currentLetter);
            } else {
                builder.append("_");
            }
        }
        System.out.println(builder);
        return builder.toString();
    }
    
}
