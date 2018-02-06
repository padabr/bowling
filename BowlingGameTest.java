import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void bowlingGameHasZeroScoreInitially() {
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.calculateScore());
    }
    
    @Test
    public void bowlingPerfectGameIs300() {
        BowlingGame game = new BowlingGame();
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        assertEquals(300, game.calculateScore());
    }

    @Test
    public void bowlingGivenGameIs155() {
        BowlingGame game = new BowlingGame();
        game.roll(3);
        game.roll(7);
        game.roll(1);
        game.roll(6);
        game.roll(10);
        game.roll(10);
        game.roll(7);
        game.roll(3);
        game.roll(8);
        game.roll(0);
        game.roll(5);
        game.roll(2);
        game.roll(0);
        game.roll(7);
        game.roll(9);
        game.roll(1);
        game.roll(10);
        game.roll(10);
        game.roll(10);
		assertEquals(155, game.calculateScore());
    }

}