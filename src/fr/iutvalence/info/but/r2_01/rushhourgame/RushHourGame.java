package fr.iutvalence.info.but.r2_01.rushhourgame;

/**
 * Class representing a Rush Hour game.
 */
public class RushHourGame {

    /**
     * Rush Hour game board.
     */
    private final RushHourGameBoard board;

    /**
     * Creates a new Rush Hour game, with given board.
     * @param theBoard board
     */
    public RushHourGame(RushHourGameBoard theBoard) {
        this.board = theBoard;
    }

    /**
     * Plays Rush Hour game until red exits. Move are chosen randomly, moves are printed on standard output.
     */
    public void play(){
        int turn = 0;
        System.out.println(this.board.toString());
        while (!this.board.isRedCarOnExit()) {
            Move move = Move.getRandomMove(RushHourGameBoard.ROWS, RushHourGameBoard.COLUMNS);
            boolean moveResult = this.board.processMove(move);
            if (moveResult) {
                System.out.println(turn + ": " + move.toString());
                System.out.println(this.board.toString());
                turn++;
            }
        }
        System.out.println("Red car has reached exit after " + turn + " turns");
    }

}
