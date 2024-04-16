import fr.iutvalence.info.but.r2_01.rushhourgame.*;

/**
 * Application used at steps 2 and 3.
 */
public class MainStep2 {
    /**
     * Application's main.
     *
     * @param args command-line arguments (none expected here)
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle(VehicleKind.CAR, Color.RED, new Position(2, 2), Direction.RIGHT),
                new Vehicle(VehicleKind.CAR, Color.GREEN, new Position(0, 1), Direction.RIGHT),
                new Vehicle(VehicleKind.TRUCK, Color.YELLOW, new Position(0, 5), Direction.UP),
                new Vehicle(VehicleKind.TRUCK, Color.PURPLE, new Position(3, 0), Direction.DOWN),
                new Vehicle(VehicleKind.CAR, Color.ORANGE, new Position(5, 0), Direction.DOWN),
                new Vehicle(VehicleKind.TRUCK, Color.DARK_BLUE, new Position(3, 3), Direction.DOWN),
                new Vehicle(VehicleKind.CAR, Color.LIGHT_BLUE, new Position(4, 5), Direction.RIGHT),
                new Vehicle(VehicleKind.TRUCK, Color.LIGHT_GREEN, new Position(5, 2), Direction.LEFT)
        };

        new RushHourGame(new RushHourGameBoard(vehicles)).play();
    }
}
