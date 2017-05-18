package pranay.tictactoe_minmaxalgorithm;

/**
 * Created by Pranay on 18/05/17.
 */

public class SmartComputer {


    TicTacToeGameBoard gameBoard;
    public boolean trueXfalseY; //true for X and false for Y


    public SmartComputer(TicTacToeGameBoard gameBoardReference, boolean xtrueYfalse){
        this.gameBoard = gameBoardReference;
        trueXfalseY = xtrueYfalse;
    }

    public void play(TicTacToeGameBoard.CURRENT_TURN currentTurn){

        if((currentTurn == TicTacToeGameBoard.CURRENT_TURN.CROSS && trueXfalseY) || (currentTurn == TicTacToeGameBoard.CURRENT_TURN.CIRCLE && !trueXfalseY)){


            //place corresponding X or O at a tile after using MinMax Algorithm








        }


    }

    private void minMaxAlgorithm(){



    }



}
