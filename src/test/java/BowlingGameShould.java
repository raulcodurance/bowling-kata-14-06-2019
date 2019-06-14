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

        for (int i = 0; i < 20; i++) {

            game.roll(0);
        }

        assertEquals(0, game.score());
    }

    @Test
    public void play_only_ones() {

        game.roll(1);
        game.roll(1);

        for (int i = 0; i < 18; i++) {

            game.roll(0);
        }

        assertEquals(2, game.score());
    }

    @Test
    public void rolls_a_spare() {

        game.roll(5);
        game.roll(5); //spare
        game.roll(3);
        game.roll(2);

        for (int i = 0; i < 16; i++) {

            game.roll(0);
        }

        assertEquals(18, game.score());
    }

    @Test
    public void rolls_a_strike() {

        game.roll(10); // Strike
        game.roll(3);
        game.roll(2);

        for (int i = 0; i < 16; i++) {

            game.roll(0);
        }

        assertEquals(20, game.score());
    }
}
