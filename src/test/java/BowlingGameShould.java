import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameShould {


    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void play_gutter_game() {

        rollMany(20, 0);

        assertEquals(0, game.score());
    }

    @Test
    public void play_only_ones() {

        game.roll(1);
        game.roll(1);

        rollMany(18, 0);

        assertEquals(2, game.score());
    }

    @Test
    public void rolls_a_spare() {

        rollSpare();

        game.roll(3);
        game.roll(2);

        rollMany(16, 0);

        assertEquals(18, game.score());
    }


    @Test
    public void rolls_a_strike() {

        rollStrike();

        game.roll(3);
        game.roll(2);

        rollMany(16, 0);

        assertEquals(20, game.score());
    }


    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {

            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5); //spare
    }

    private void rollStrike() {
        game.roll(10);
    }
}
