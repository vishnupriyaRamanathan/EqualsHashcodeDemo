import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinateOne = new Coordinate(1,1);
        Coordinate coordinateTwo = new Coordinate(1,1);


        Map<Coordinate, String> map = new HashMap<>();
        map.put(coordinateOne, "One");
        map.put(coordinateTwo, "Two");

        for (Coordinate coordinate : map.keySet()) {
            System.out.println(map.get(coordinate));
        }

    }
}
