import java.util.Scanner;

public class TicTacToe {
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static String board [][] = new String[ROWS][COLS];
    private static void clearBoard() =
    private static void display() =
    private static boolean isValidMove(int row, int col) =
    private static boolean isWin(String player) =
    private static boolean isColWin(String player) =
    private static boolean isRowWin(String player) =
    private static boolean isDiagonalWin(String player) =
    private static boolean isTie() =
    static void main() {

        int rowmove;
        int colmove;


        //Create do while loop for whether or not to keep playing
        //Clear board, set player to 1 or X
        //Create loop running until valid input is taken, checking if spot is already occupied
        //Collect player one's input, row and column number
        //Record valid move on the board
        //Switch to player two, do same thing
        //Run the 'IsWin' methods to check if the game is won
        //Run the 'IsTie' method to check if game is won
        //If not win, loop
        //If win, end loop, announce winner and prompt players to play again
        //If yes, loop. If no, end program

    }
}
