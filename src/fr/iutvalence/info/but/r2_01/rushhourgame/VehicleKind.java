package fr.iutvalence.info.but.r2_01.rushhourgame;

/**
 * Rush Hour Game vehicle kinds (and associated sizes).
 */
public enum VehicleKind {

    /**
     * Car.
     */
    CAR(2),
    /**
     * Truck.
     */
    TRUCK(3);

    /**
     * Size (number of positions occupied on board)
     */
    private final int size;

    /**
     * Creates a new vehicle kind with given size.
     * @param theSize size.
     */
    VehicleKind(int theSize) {
        this.size = theSize;
    }

    /**
     * Returns size.
     * @return size.
     */
    public int getSize() {
        return this.size;
    }
}
