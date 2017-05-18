package pranay.tictactoe_minmaxalgorithm;

/**
 * Created by Pranay on 18/05/17.
 */

public class TicTacToeGameBoard {


    public enum STATE {
        NOT_STARTED,
        CROSS_LOSES,
        CROSS_WINS,
        DRAW,
        PLAYING,
        RESET
    };

    public enum TILE {
        CROSS,
        CIRCLE,
        EMPTY
    };

    public enum CURRENT_TURN{
        CROSS,
        CIRCLE,
        NOT_STARTED
    }

    private STATE currentState = STATE.NOT_STARTED;

    private TILE currentTurn = TILE.EMPTY;

    private TILE[] gameBoard = new TILE[9];




    public TicTacToeGameBoard(){
        initBoard();
    }

    public void initBoard(){
        for(TILE tile : gameBoard){
            tile = TILE.EMPTY;
        }

        currentState = STATE.PLAYING;

    }

    public void resetGame(){
        currentState = STATE.RESET;
    }

    public STATE checkState(){

        //returns if anyone wins, state stays as playing if no one wins




        //code to check for winner





        //////////////////////////////////

        return STATE.PLAYING;

    }















}
