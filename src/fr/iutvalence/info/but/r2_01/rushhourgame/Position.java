package fr.iutvalence.info.but.r2_01.rushhourgame;

import java.util.Random;

/**
 * Class representing a position in Rush Hour game board (row/column).
 */
public class Position {

    /**
     * Row.
     */
    private final int row;

    /**
     * Column.
     */
    private final int column;

    /**
     * Creates a new position at given row/column.
     *
     * @param row  row
     * @param column  column
     * N.B. parameters are assumed to be coherent (they will not be checked)
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Returns row.
     *
     * @return row
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Returns column.
     *
     * @return column
     */
    public int getColumn() {
        return this.column;
    }

    /**
     * Checks if position is same as another.
     *
     * @param other other position
     * @return <i>true</i> is position is same as other, <i>false</i> otherwise
     */
    public boolean isSame(Position other) {
        if (other == null) return false;
        if (other == this) return true;
        if (this.row != other.row) return false;
        return this.column == other.column;
    }

    /**
     * Returns neighbour position in a given direction (assumed to be valid).
     *
     * @param direction direction
     * @return neighbour position in direction.
     */
    public Position getNeighbour(Direction direction) {
        int neighbourRow =  this.row + direction.getRowDelta();
        int neighbourColumn =  this.column + direction.getColumnDelta();
        return new Position(neighbourRow, neighbourColumn);
    }

    /**
     * Returns a random position within given bounds.
     *
     * @param maxRow row upper bound (excluded)
     * @param maxColumn column upper bound (excluded)
     * @return a random position between <i>(0,0)</i> and <i>(maxRow-1, maxColumn-1)</i>
     */
    public static Position getRandomPosition(int maxRow, int maxColumn) {
        Random rng = new Random();
        int row = rng.nextInt(maxRow);
        int column = rng.nextInt(maxColumn);
        return new Position(row, column);
    }

    /**
     * Checks if position is within bounds, i.e. between <i>(0,0)</i> and <i>(maxRow-1, maxColumn-1)</i>.
     * @param maxRow row upper bound (excluded)
     * @param maxColumn column upper bound (excluded)
     * @return <i>true</i> if position is in bounds, <i>false</i> else
     */
    public boolean isInBounds(int maxRow, int maxColumn) {
        if (this.row < 0) return false;
        if (this.row >= maxRow) return false;
        if (this.column < 0) return false;
        return this.column < maxColumn;
    }

    /**
     * Returns a human-readable representation of position as <i>(row, column)</i>.
     *
     * @return a human-readable representation of position as <i>(row, column)</i>
     */
    public String toString() {
        return "(" + this.row + "," + this.column + ")";
    }
}
