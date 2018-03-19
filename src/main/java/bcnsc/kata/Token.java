package bcnsc.kata;

public class Token {
    private int square = 0;

    public int getSquare() {
        return square;
    }

    public void move(int i) {
         square += i;
    }
}
