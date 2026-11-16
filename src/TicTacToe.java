import java.util.Scanner;

public class TicTacToe {
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static String board [][] = new String[ROWS][COLS];
    private static void clearBoard() {
        for(int rows = 0; rows < ROWS; rows++) {

            for(int col = 0; col < COLS;col++ ){

                board[rows][col] = " ";

            }

        }
    }
    private static void display() {
        for(int rows = 0; rows < ROWS; rows++) {
            System.out.print("| ");
            for(int col = 0; col < COLS;col++ ){

                System.out.print(board[rows][col] + " |");

            }
            System.out.println();

        }
    }
    private static boolean isValidMove(int row, int col){
        Boolean empty = false;
        if(board[row][col].equals(" ")){
            empty = false;
        }else{
            empty = true;
        }
        return empty;
    }
    private static boolean isWin(String player){
        System.out.println("Wow, looks like " + player + " wins!");
        return true;
    }
    private static boolean isColWin(String player){
        boolean win;
        if(board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player)){
            win = true;
        }else if(board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player)){
            win = true;
        }else if(board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player)){
            win = true;
        }else{
            win = false;
        }
        return win;
    }
    private static boolean isRowWin(String player){
        boolean win;
        if(board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)){
            win = true;
        }else if(board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)){
            win = true;
        }else if(board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player)){
            win = true;
        }else{
            win = false;
        }
        return win;
    }
    private static boolean isDiagonalWin(String player) {
        boolean win;
        if(board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)){
            win = true;
        }else if(board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)){
            win = true;
        }else{
            win = false;
        }
        return win;
    }
    private static boolean isTie(){
        for(int rows = 0; rows < ROWS; rows++) {

            for(int col = 0; col < COLS;col++ ){

                if(board[rows][col].equals(" ")){
                    return false;
                }

            }

        }
        return true;
    }
    static void main() {

        int playerpickrow;
        int playerpickcol;


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
