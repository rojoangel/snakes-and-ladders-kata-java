package bcnsc.kata;

public class Game {

    private Token token;
    private Dice dice;

    public Game () {
        this.dice = new RandomDice();
    }
    public Game (Dice dice) {
        this.dice = dice;
    }

    public Token addToken() {
        this.token = new Token();
        return this.token;
    }

    public void start() {
        this.token.move(1);
    }

    public int rollDie() {
        return dice.roll();
    }
}
