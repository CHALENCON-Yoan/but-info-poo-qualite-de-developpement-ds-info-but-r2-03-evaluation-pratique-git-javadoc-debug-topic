package fr.iutvalence.info.but.r2_01.rushhourgame;

import java.util.Random;

/**
 * Enumeration for moving direction (UP, DOWN, LEFT, RIGHT), associating row/column deltas to each direction.
 */
public enum Direction {

    /**
     * Up.
     */
    UP(-1,0),

    /**
     * Down.
     */
    DOWN(1,0),

    /**
     * Left.
     */
    LEFT(0,-1),

    /**
     * Right.
     */
    RIGHT(0,1);

    /**
     * Row delta.
     */
    private final int rowDelta;

    /**
     * Column delta.
     */
    private final int columnDelta;

    /**
     * Creates (privately) a new direction with given row/column deltas.
     * @param theRowDelta row delta
     * @param theColumnDelta column delta
     */
    Direction(int theRowDelta, int theColumnDelta) {
        this.rowDelta = theRowDelta;
        this.columnDelta = theColumnDelta;
    }

    /**
     * Returns row delta.
     *
     * @return row delta
     */
    public int getRowDelta() { return this.rowDelta; }

    /**
     * Returns column delta.
     *
     * @return column delta
     */
    public int getColumnDelta() {
        return this.columnDelta;
    }

    /**
     * Returns opposite direction.
     *
     * @return opposite direction
     */
    public Direction getOpposite() {
        switch (this) {
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            default:
                return LEFT;
        }
    }

    /**
     * Returns a random direction.
     *
     * @return a random direction
     */
    public static Direction getRandomDirection() {
        return Direction.values()[new Random().nextInt(Direction.values().length)];
    }

    /**
     * Returns a human-readable representation of the direction.
     *
     * @return a human-readable representation of the direction
     */
    public String toString() {
        return "" + this.name().charAt(0);
    }
}
