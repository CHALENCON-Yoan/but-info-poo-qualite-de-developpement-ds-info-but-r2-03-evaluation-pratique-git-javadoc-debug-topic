package fr.iutvalence.info.but.r2_01.rushhourgame;

/**
 * A vehicle, on a Rush Hour game board.
 */
public class Vehicle {

    /**
     * Kind.
     */
    private final VehicleKind kind;

    /**
     * Head position.
     */
    private Position headPosition;

    /**
     * Head direction.
     */
    private final Direction headDirection;

    /**
     * Color.
     */
    private final Color color;

    /**
     * Creates a new vehicle, with given kind, color/head position and direction.
     * <p>
     * N.B. parameters are assumed to be coherent (they will not be checked)
     *
     * @param theKind          kind
     * @param theColor         color
     * @param theHeadPosition  head position
     * @param theHeadDirection head direction
     */
    public Vehicle(VehicleKind theKind, Color theColor, Position theHeadPosition, Direction theHeadDirection) {
        this.kind = theKind;
        this.color = theColor;
        this.headPosition = theHeadPosition;
        this.headDirection = theHeadDirection;
    }

    /**
     * Returns size.
     *
     * @return size
     */
    public int getSize() {
        return this.kind.getSize();
    }

    /**
     * Returns color.
     *
     * @return color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Returns head position.
     *
     * @return head position
     */
    public Position getHeadPosition() {
        return this.headPosition;
    }

    /**
     * Returns rear position.
     *
     * @return rear position
     */
    public Position getRearPosition() {
        Position position = this.headPosition;
        for (int positionIndex = 1; positionIndex < this.getSize(); positionIndex++)
            position = position.getNeighbour(this.headDirection.getOpposite());
        return position;
    }

    /**
     * Returns head direction.
     *
     * @return head direction
     */
    public Direction getHeadDirection() {
        return this.headDirection;
    }

    /**
     * Checks if this vehicle occupies a given position.
     *
     * @param position position
     * @return <i>true</i> if the vehicle occupies the position, <i>false</i> else
     */
    public boolean isAt(Position position) {
        Position currentPosition = this.headPosition;

        for (int positionIndex = 1; positionIndex < this.getSize(); positionIndex++) {
            if (currentPosition.isSame(position)) return true;
            currentPosition = currentPosition.getNeighbour(this.headDirection.getOpposite());
        }
        return false;
    }

    /**
     * Shifts the vehicle in a given direction.
     * <p>
     * N.B. shift is supposed to be valid, it will not be checked
     *
     * @param direction direction
     */
    public void shift(Direction direction) {
        this.headPosition = this.headPosition.getNeighbour(direction);
    }

    /**
     * Returns a human-readable representation of vehicle.
     *
     * @return a human-readable representation of vehicle
     */
    public String toString() {
        return "Vehicle{" +
                "size = " + this.getSize() +
                ", color = " + this.color.toString() +
                ", head position = " + this.headPosition.toString() +
                ", head direction = " + this.headDirection.toString() +
                '}';
    }
}
