package bcnsc.kata;

import java.util.Random;

public class RandomDice implements Dice {

    private final int Low = 1;
    private final int High = 7;

    public int roll() {
        return new Random().nextInt(High-Low) + Low;
    }
}
