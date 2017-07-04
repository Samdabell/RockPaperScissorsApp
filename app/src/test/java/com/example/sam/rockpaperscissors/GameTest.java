package com.example.sam.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 04/07/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();
    }

    @Test
    public void canCompareMoves() throws Exception {
        assertEquals(0, game.compareMoves("Rock", "Rock"));
        assertEquals(-1, game.compareMoves("Rock", "Paper"));
        assertEquals(1, game.compareMoves("Paper", "Rock"));
    }

    @Test
    public void canDeclareWinner() throws Exception {
        assertEquals("It's a draw", game.displayWinner(0));
        assertEquals("Player wins", game.displayWinner(1));
        assertEquals("Computer wins", game.displayWinner(-1));
    }

}
