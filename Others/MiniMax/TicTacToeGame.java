package tictactoe;

public class TicTacToeGame extends Board{
    
    private String winner = "Cats";
    private int move_count = 0;
    private int row_count = 0; 
    private int col_count = 0;
    private int diag_count = 0; 
    private int rdiag_count = 0;
    private boolean game_over = false;
    
    public TicTacToeGame(){
        super(3);
        super.clearBoard();
    }
    
    public boolean isOver(){
        return game_over;
    }
    
    public String getWinner(){
        return winner;
    }
    
    public void playerMove(String player, int row, int col){
        setVal(row, col, player);
        move_count++;
        checkWin(player, row, col);
    }
    
    public void checkWin(String player, int x, int y){
        
        for(int i = 0; i < 3; i++){
            if(player.equals(getVal(x, i)))
                col_count++;
            if(player.equals(getVal(i, y)))
                row_count++;
            if(player.equals( getVal(i, i)))
                diag_count++;
            if(player.equals(getVal(i, 3 - (i + 1) )))
                rdiag_count++;
        }
        if(row_count == 3 || col_count == 3 || diag_count == 3 || rdiag_count == 3){
            winner = player;
            game_over = true;
        }
        if(move_count == 9)
            game_over = true;
    }
    
}
