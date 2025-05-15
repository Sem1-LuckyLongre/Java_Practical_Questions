package P1;

public class TwoDim {

    private final int x;
    private final int y;

    public TwoDim() {
        this.x = 0;
        this.y = 0;
    }

    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates (x, y): (" + x + ", " + y + ")";
    }
}
