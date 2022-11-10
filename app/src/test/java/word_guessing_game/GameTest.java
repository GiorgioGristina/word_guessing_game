package word_guessing_game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    Game game = new Game("MAKERS");
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testWhenInstanciatedHas10Attempt() {
    Game game = new Game("MAKERS");
    assertEquals(game.attempt, Integer.valueOf(10));
  }
}