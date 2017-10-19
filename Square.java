/**
 * Represents a square on a chess board
 *
 * @author mabdi3
 * @version 1.1
 */
public class Square {

    private String name;
    private char rank, file;

    /**
     * Creats a Square with all required paramters.
     * @exception InvalidSquareException for invalid rank or file
     * @param file the file in which the square presides
     * @param rank the rank in which the square presides
     */
    public Square(char file, char rank) throws InvalidSquareException{
        if (!validFile(file) || !validRank(rank)) {
            throw new InvalidSquareException(file, rank);
        } else {
            this.file = file;
            this.rank = rank;
            name = file + "" + rank;
        }
    }

    /**
     * @return the file of the square
     */
    public char getFile() {
        return file;
    }

    /**
     * @return the rank of the square
     */
    public char getRank() {
        return rank;
    }

    /**
    * Creates a Square with a rank and file with all required parameters.
    * @exception throws InvalidSquareException for invalid rank and file
    * @param name the name of the square written as file and rank
    */
    public Square(String name) throws InvalidSquareException {
        this(name.charAt(0) , name.charAt(1));
    }

    /**
     * Checks to see if file is between 'a' and 'h'
     * @param file
     * @return true if file is between 'a' and 'h', and false
     * otherwise
     */
    public static boolean validFile(char file) {
        boolean valid = false;
        for (int x = 97; x <= 104; x++) {
            if (file == x) {
                valid = true;
            }
        }
        return valid;
    }

    /**
     * Checks to see if rank is between '1' and '8'
     * @param rank
     * @return true if rank is between '1' and '8' and false
     * otherwise
     */
    public static boolean validRank(char rank) {
        boolean valid = false;
        for (int x = 49; x <= 56; x++) {
            if (rank == x) {
                valid = true;
            }
        }
        return valid;
    }

    /**
     * @return this square's rank and file
     */
    public String toString() {
        return String.format("%c%c", file, rank);
    }

    @Override
    /**
     * Evaluates whether or not other has the same name or rank and file
     * as the Square that is invoking the method.
     *
     * @param other other object to be used in comparison to Square object
     *        invoking the method.
     *
     * @return true if the Object other has the same rank and file as the
     *         Square invoking the method, and false otherwise.
     */
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Square)) {
            return false;
        }
        Square that = (Square) other;
        return this.name.equals(that.name);
    }
}

