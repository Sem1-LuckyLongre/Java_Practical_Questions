package P2;

import P1.TwoDim;

public class ThreeDim extends TwoDim {

    private final int z;

    public ThreeDim() {
        super();
        this.z = 0;
    }

    public ThreeDim(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Coordinates (x, y, z): (" + getX() + ", " + getY() + ", " + z + ")";
    }
}
