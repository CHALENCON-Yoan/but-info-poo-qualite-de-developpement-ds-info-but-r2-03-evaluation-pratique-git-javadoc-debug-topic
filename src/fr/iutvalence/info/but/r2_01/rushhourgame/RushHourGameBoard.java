package fr.iutvalence.info.but.r2_01.rushhourgame;

/**
 * Class representing a Rush Hour game board (6x6 cell, exit position at <i>(2, 5)</i>, top left corner at <i>(0, 0)</i>.
 */
public class RushHourGameBoard {

    /**
     * Row count.
     */
    public static final int ROWS = 6;

    /**
     * Column count.
     */
    public static final int COLUMNS = 6;

    /**
     * Exit position.
     */
    private static final Position EXIT_POSITION = new Position(2, 5);

    /**
     * Empty cell representation.
     */
    private static final String EMPTY_CELL = ".";

    /**
     * Vehicles (red car is at offset 0).
     */
    private final Vehicle[] vehicles;

    /**
     * Creates a new Rush Hour game board with existing vehicles (red car is at offset 0).
     * @param theVehicles vehicles on board
     */
    public RushHourGameBoard(Vehicle[] theVehicles) {
        this.vehicles = theVehicles;
    }

    /**
     * Checks if red car is in exit.
     * @return <i>true</i> if red car is in exit
     */
    public boolean isRedCarOnExit() { return this.vehicles[0].isAt(RushHourGameBoard.EXIT_POSITION); }

    /**
     * Processes a move (shifting the vehicle at move position in move direction if possible).
     * @param move move
     * @return <i>true</i> if move has been done, <i>false</i> if move is invalid
     */
    public boolean processMove(Move move) {
        Vehicle vehicle = this.getVehicleAt(move.getPosition());
        if (vehicle == null)
            return false;
        if (!this.isVehicleShiftValid(vehicle, move.getDirection()))
            return false;
        vehicle.shift(move.getDirection());
        return true;
    }

    /**
     * Checks (internally) if shifting a vehicle in a direction is possible.
     * @param vehicle vehicle to shift
     * @param direction shifting direction
     * @return <i>true</i> if vehicle shifting is possible, <i>false</i> else
     */
    private boolean isVehicleShiftValid(Vehicle vehicle, Direction direction) {
        if ((vehicle.getHeadDirection() != direction)&&(vehicle.getHeadDirection() != direction.getOpposite()))
            return false;
        Position firstPositionToMove = vehicle.getHeadPosition();
        if (vehicle.getHeadDirection() != direction)
            firstPositionToMove = vehicle.getRearPosition();

        Position newlyOccupiedPosition = firstPositionToMove.getNeighbour(direction);
        if (!newlyOccupiedPosition.isInBounds(RushHourGameBoard.ROWS, RushHourGameBoard.COLUMNS))
            return false;
        return true;
    }

    /**
     * Returns a human-readable representation of board, in ASCII-art.
     * Each board row is represented by a line, each character in a line is either the color of occupying vehicle or <i>EMPTY_CELL</i>.
     *
     * @return a human-readable representation of board, in ASCII-art
     */
    public String toString() {
        String result = "";
        for (int rowIndex = 0; rowIndex < RushHourGameBoard.ROWS; rowIndex++) {
            for (int columnIndex = 0; columnIndex < RushHourGameBoard.COLUMNS; columnIndex++) {
                Vehicle vehicle = this.getVehicleAt(new Position(rowIndex, columnIndex));
                if (vehicle == null)
                    result += RushHourGameBoard.EMPTY_CELL;
                else
                    result += vehicle.getColor().toString();
            }
            result += "\n";
        }
        
        return result;
    }

    /**
     * Retrieves (internally) vehicle that occupies a position if any.
     * @param position position
     * @return vehicle occupying <i>position</i>, or <i>null</i> if there is no vehicle
     */
    private Vehicle getVehicleAt(Position position) {
        for (int index = 0; index < this.vehicles.length; index++) {
            Vehicle vehicle = this.vehicles[index];
            if (vehicle.isAt(position))
                return vehicle;
        }
        return null;
    }
}
