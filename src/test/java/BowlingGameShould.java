import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameShould {


    @Test
    public void roll() {


        Game game = new Game();

        game.roll(0);
    }


    @Test
    public void score() {

        Game game = new Game();

        game.score();
    }


    @Test
    public void play_gutter_game() {

        Game game = new Game();

        for(int i = 0; i<20;i++){

            game.roll(0);
        }

        assertEquals(0, game.score());
    }


}
