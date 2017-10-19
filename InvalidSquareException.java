/**
 * Represents an exception made when an invalid Square of invalid rank or
 * file is created. I chose to make my exception a checked exception since a square can't be
 * changed to be made a valid square during runtime. Before any methods can be called, a square must
 * be valid, and a checked exception makes sure it's handled before the square can be used for movement
 * with a chess Piece.
 *
 * @see Square, Piece
 * @version 1.0
 * @author mabdi3
 */
public class InvalidSquareException extends Exception {
    private char file, rank;

    /**
     * Creates InvalidSquareException with all the required paramaters
     * @param file file of the invalid Square
     * @param rank rank of the invalid Square
     * @see Square
     */
    public InvalidSquareException(char file, char rank) {
        this.file = file;
        this.rank = rank;
    }

    /**
     * @return the invalid Square as a String message
     */
    public String getMessage() {
        return file + "" + rank;
    }


}