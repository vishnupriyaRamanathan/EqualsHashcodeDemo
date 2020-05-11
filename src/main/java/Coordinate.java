import java.util.Objects;

public class Coordinate {
    int xPoint;
    int yPoint;

    public Coordinate(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return xPoint == that.xPoint &&
                yPoint == that.yPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPoint, yPoint);
    }
}
