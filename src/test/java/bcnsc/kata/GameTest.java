package bcnsc.kata;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class GameTest {
    Token token;
    Game game;

    @Before
    public void  init(){
        game = new Game();
        token = game.addToken();
        game.start();
    }

    @Test
    public void gameShouldStartOnSquareOne(){

        assertEquals(1, token.getSquare());
    }

    @Test
    public void gameShouldBeAbleToChangeTokensPosition() {
        token.move(3);
        assertEquals(4, token.getSquare());
    }

    @Test
    public void tokenMoveSeveralTimes(){
        token.move(3);
        token.move(4);
        assertEquals(8, token.getSquare());
    }

    @Test
    public void rollingADiceShouldReturnAValueBetween1And6() {
        int roll = game.rollDie();
        assertTrue(roll <=6 && roll >= 1);
    }

    @Test
    public void whenDiceValueIsFourTokenIsMovedFour() {
        Dice fixedDice = new FixedDice(4);
        Game game = new Game(fixedDice);
        game.addToken();
        game.start();
        game.rollDie();
        assertEquals(4, token.getSquare());
    }
}
