//Mike DeJoseph
package tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        
        //Data Members
        TicTacToeGame game = new TicTacToeGame();
        Scanner kbb = new Scanner(System.in);
        String player = "X"; //comuter starts
        int x = 0, y = 0;
        
        
        while(!game.isOver()){
            game.printBoard();
            player = "X";
            game.playerMove(player, x, y);
            if(game.isOver())
                break;
            System.out.println("Your move: ");
            player = "O";
            game.playerMove(player, kbb.nextInt(), kbb.nextInt());
        }
        
        System.out.print("Winner: " + game.getWinner());
    }
    
    public int max(TicTacToeGame state){
        if(state.isOver()){
            return score(state);
        }
        int max = -1; 
        for(Object game : possibleMoves(state)){
            TicTacToeGame next = null;
            int score = min(next);
            if(score > max)
                max = score;
        }
        return max;
    }
    
    public int min(TicTacToeGame state){
        if(state.isOver()){
            return score(state);
        }
        int min = -1; 
        for(Object game : possibleMoves(state)){
            TicTacToeGame next = null;
            int score = min(next);
            if(score < min)
                min = score;
        }
        return min;
    }
    
    public int score(TicTacToeGame state){
        
        return 1;
    }
    
    public List possibleMoves(TicTacToeGame game){
        List<TicTacToeGame> states = new ArrayList<>();
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                System.out.print("");
        return states;
                
    }
    
}
