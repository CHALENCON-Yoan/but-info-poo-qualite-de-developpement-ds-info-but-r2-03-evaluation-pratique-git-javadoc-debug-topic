package fr.iutvalence.info.but.r2_01.rushhourgame;

/**
 * Class representing a move, as a shifting (of 1 cell) from a given position in a given direction.
 *
 */
public class Move {

    /**
     * Position.
     */
    private final Position position;

    /**
     * Direction
     */
    private final Direction direction;

    /**
     * Creates a new move, with given position/direction.
     *
     * @param thePosition   position
     * @param theDirection  direction
     */
    public Move(Position thePosition, Direction theDirection) {
        this.position = thePosition;
        this.direction = theDirection;
    }

    /**
     * Returns position.
     *
     * @return position
     */
    public Position getPosition() {
        return this.position;
    }

    /**
     * Returns direction.
     *
     * @return direction
     */
    public Direction getDirection() {
        return this.direction;
    }

    /**
     * Returns a random move (random position within given bounds, random direction).
     *
     * @param maxRow row upper bound (excluded)
     * @param maxColumn column upper bound (excluded)
     * @return a random move (random position within given bounds, random direction)
     */
    public static Move getRandomMove(int maxRow, int maxColumn) {
        return new Move(Position.getRandomPosition(maxRow, maxColumn), Direction.getRandomDirection());
    }

    /**
     * Returns a human-readable representation of the move, as " <i>position direction</i>. "
     *
     * @return a human-readable representation of the move
     */
    public String toString() {
        return this.position.toString() + " " + this.direction.toString();
    }
}
