import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {
    @Test
    public void shouldCheckIfTwoCoordinatesAreEqual() {
        Coordinate coordinateOne = new Coordinate(1, 1 );
        Coordinate coordinateTwo = new Coordinate(1,1);
        assertEquals(coordinateOne, coordinateTwo);
    }
}