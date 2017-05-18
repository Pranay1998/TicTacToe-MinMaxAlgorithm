package pranay.tictactoe_minmaxalgorithm;

import java.util.TimerTask;

/**
 * Created by Pranay on 18/05/17.
 */



public class GameLoopTask extends TimerTask {

    TicTacToeGameBoard.STATE replaceLater;
    public GameLoopTask(){



    }

    public void run(){

        switch (replaceLater) {

            case PLAYING: {


            }
            break;

            case CROSS_LOSES: {
                this.cancel();
            }break;

            case CROSS_WINS: {
                this.cancel();
            }break;

            case DRAW: {
                this.cancel();
            }break;

        }



    }
}
