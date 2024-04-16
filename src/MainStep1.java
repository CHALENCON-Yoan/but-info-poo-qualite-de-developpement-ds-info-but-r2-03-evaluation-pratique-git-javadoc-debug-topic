import fr.iutvalence.info.but.r2_01.rushhourgame.*;

/**
 * Application used at step 1.
 */
public class MainStep1 {
    /**
     * Application's main.
     *
     * @param args command-line arguments (none expected here)
     */
    public static void main(String[] args) {
        new RushHourGame(new RushHourGameBoard(new Vehicle[8])).play();
    }
}
