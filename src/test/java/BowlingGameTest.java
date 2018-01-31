import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    @Test
    public void bowlingGameHasZeroScoreInitially() {
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.calculateScore());
    }
    
    public void bowlingPerfectGameIs300() {
        BowlingGame game = new BowlingGame();
        for (int f = 1; f < 10; f++){
            game.frame[f][1] = 10;
            game.frame[f][2] = 0;
        }
        game.frame[10][1] = 10;
        game.frame[10][2] = 10;
        game.extra_roll = 10;
        assertEquals(300, game.calculateScore());
    }

    public void bowlingGivenGameIs155() {
        BowlingGame game = new BowlingGame();
        game.frame[][] = {
            {3, 7}
            {1, 6}
            {10, 0}
            {10, 0}
            {7, 3}
            {8, 0}
            {5, 2}
            {0, 7}
            {9, 1}
            {10, 10}
        }
        game.extra_roll = 10;
        assertEquals(155, game.calculateScore());
    }

}