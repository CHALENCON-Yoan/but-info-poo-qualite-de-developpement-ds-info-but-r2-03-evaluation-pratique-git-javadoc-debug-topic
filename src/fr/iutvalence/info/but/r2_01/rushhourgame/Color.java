package fr.iutvalence.info.but.r2_01.rushhourgame;
/**
 * Enumeration for vehicle colors.
 */
public enum Color {

    /**
     * Red.
     */
   RED,

    /**
     * Green.
     */
    GREEN,

    /**
     * Light green.
     */
    LIGHT_GREEN,

    /**
     * Dark green.
     */
   DARK_GREEN,

    /**
     * Blue.
     */
    BLUE,

    /**
     * Light blue.
     */
    LIGHT_BLUE,

    /**
     * Dark blue.
     */
    DARK_BLUE,

    /**
     * Purple.
     */
    PURPLE,

    /**
     * Light purple.
     */
    LIGHT_PURPLE,

    /**
     * Yellow.
     */
    YELLOW,

    /**
     * Light yellow.
     */
    LIGHT_YELLOW,

    /**
     * Brown.
     */
    BROWN,

    /**
     * Light brown.
     */
    LIGHT_BROWN,

    /**
     * Black.
     */
    BLACK,

    /**
     * Orange.
     */
    ORANGE,

    /**
     * Pink.
     */
    PINK;

    /**
     * Human-readable representation of colors.
     * (array index is color value, array cell content is "0",...,"9","A",...,"F").
     */
    private final static String[] COLORS_STRINGS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /**
     * Returns a human-readable representation of the color
     *
     * @return a human-readable representation of the color
     */
    public String toString() {
        return COLORS_STRINGS[this.ordinal()];
    }
}
