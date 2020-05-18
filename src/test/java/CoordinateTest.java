import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CoordinateTest {
    HashMap<Coordinate, String> hashMap = new HashMap<>();

    @Before
    public void setUp() {
        Coordinate coordinateOne = new Coordinate(1, 1);
        Coordinate coordinateTwo = new Coordinate(1, 1);

        hashMap.put(coordinateOne, "One");
        hashMap.put(coordinateTwo, "Two");
    }

    @Test
    public void shouldCheckIfTwoCoordinatesAreEqual() {
        Coordinate coordinateOne = new Coordinate(1, 1);
        Coordinate coordinateTwo = new Coordinate(1, 1);
        assertEquals(coordinateOne, coordinateTwo);
    }

    @Test
    public void shouldCheckIfHashCodeIsValidated() {
        Coordinate coordinate = new Coordinate(1, 1);
        assertEquals("Two", hashMap.get(coordinate));
        assertNotEquals("One", hashMap.get(coordinate));
    }
}