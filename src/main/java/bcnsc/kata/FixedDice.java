package bcnsc.kata;

public class FixedDice implements Dice {

    private int i;

    public FixedDice(int i) {
        super();
        this.i = i;
    }

    public int roll() {
        return i;
    }
}
