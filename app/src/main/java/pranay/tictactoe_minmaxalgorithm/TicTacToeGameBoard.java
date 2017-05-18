package pranay.tictactoe_minmaxalgorithm;

/**
 * Created by Pranay on 18/05/17.
 */

public class TicTacToeGameBoard {


    public static enum STATE {
        NOT_STARTED,
        CROSS_LOSES,
        CROSS_WINS,
        DRAW,
        PLAYING,
        RESET
    };

    public static enum TILE {
        CROSS,
        CIRCLE,
        EMPTY
    };

    public static enum CURRENT_TURN{
        CROSS,
        CIRCLE,
        NOT_STARTED
    }

    private STATE currentState = STATE.NOT_STARTED;

    private TILE currentTurn = TILE.EMPTY;

    private TILE[][] gameBoard = new TILE[3][3];




    public TicTacToeGameBoard(){
        initBoard();
    }

    public void initBoard(){
        for(int i = 0; i < 3; i++) {
            for (TILE tile : gameBoard[i]) {
                tile = TILE.EMPTY;
            }
        }
        currentState = STATE.PLAYING;
    }

    public void resetGame(){
        currentState = STATE.RESET;
    }

    public STATE checkState(){

        //////////////////////////////////WIN-LOSE////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i = 0; i < 3; i++){

            if(gameBoard[i][0] == TILE.CROSS && gameBoard[i][1] == TILE.CROSS && gameBoard[i][2] == TILE.CROSS ){
                return STATE.CROSS_WINS;
            }

            if(gameBoard[0][i] == TILE.CROSS && gameBoard[1][i] == TILE.CROSS && gameBoard[2][i] == TILE.CROSS ){
                return STATE.CROSS_WINS;
            }

            if(gameBoard[i][0] == TILE.CIRCLE && gameBoard[i][1] == TILE.CIRCLE && gameBoard[i][2] == TILE.CIRCLE ){
                return STATE.CROSS_LOSES;
            }

            if(gameBoard[0][i] == TILE.CIRCLE && gameBoard[1][i] == TILE.CIRCLE && gameBoard[2][i] == TILE.CIRCLE ){
                return STATE.CROSS_LOSES;
            }

        }

        if((gameBoard[0][0] == TILE.CROSS && gameBoard[1][1] == TILE.CROSS && gameBoard[2][2] == TILE.CROSS) || (gameBoard[0][2] == TILE.CROSS && gameBoard[1][1] == TILE.CROSS && gameBoard[2][0] == TILE.CROSS)){
            return STATE.CROSS_WINS;
        }

        if((gameBoard[0][0] == TILE.CIRCLE && gameBoard[1][1] == TILE.CIRCLE && gameBoard[2][2] == TILE.CIRCLE) || (gameBoard[0][2] == TILE.CIRCLE && gameBoard[1][1] == TILE.CIRCLE && gameBoard[2][0] == TILE.CIRCLE)){
            return STATE.CROSS_LOSES;
        }

        //////////////////////////////////WIN-LOSE////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //////////////////////////////////DRAW////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        boolean isDraw = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gameBoard[i][j] == TILE.EMPTY){
                    isDraw = false;
                }
            }
        }

        if(isDraw) return STATE.DRAW;
        //////////////////////////////////DRAW////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //if none of the above cases , game is still in progress
        return STATE.PLAYING;

    }















}
