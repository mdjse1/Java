//General board class
// Mike Dejoseph

package tictactoe;

public class Board {
    
    private String board[][];
    
    public Board(int size){
        board = new String[size][size];
    }
   
    public void setVal(int row, int col, String val){board[row][col] = val;} 
    
    public String getVal(int row, int col){return board[row][col];}
    
    public void clearBoard(){
        for (String[] board1 : board)
            for (int col = 0; col < board.length; col++)
                board1[col] = " ";
    }
    
    public void printBoard(){
        for (String[] board1 : board) {
            System.out.println();
            for (int col = 0; col < board.length; col++) {
                System.out.print("|"  + board1[col]);
            }
            System.out.print("|");
        }
        System.out.println();
    }
}
