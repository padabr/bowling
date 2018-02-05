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
        for (int f = 0; f < 9; f++){
            game.frame[f][0] = 10;
            game.frame[f][1] = 0;
        }
        game.frame[9][0] = 10;
        game.frame[9][1] = 10;
        game.extra_roll = 10;
        assertEquals(300, game.calculateScore());
    }

    @Test
    public void bowlingGivenGameIs155() {
        BowlingGame game = new BowlingGame();
        game.frame[0][0] = 3;
        game.frame[0][1] = 7;
        game.frame[1][0] = 1;
        game.frame[1][1] = 6;
        game.frame[2][0] = 10;
        game.frame[2][1] = 0;
        game.frame[3][0] = 10;
        game.frame[3][1] = 0;
        game.frame[4][0] = 7;
        game.frame[4][1] = 3;
        game.frame[5][0] = 8;
        game.frame[5][1] = 0;        
        game.frame[6][0] = 5;
        game.frame[6][1] = 2;
        game.frame[7][0] = 0;
        game.frame[7][1] = 7;
        game.frame[8][0] = 9;
        game.frame[8][1] = 1;
        game.frame[9][0] = 10;
        game.frame[9][1] = 10;
		game.extra_roll = 10;
        assertEquals(155, game.calculateScore());
    }

}