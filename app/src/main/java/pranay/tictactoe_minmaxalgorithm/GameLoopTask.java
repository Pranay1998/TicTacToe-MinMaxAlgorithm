package pranay.tictactoe_minmaxalgorithm;

import android.util.Log;

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
                try {
                    this.wait();
                }
                catch(Exception e){
                    Log.d("exception caught","dafuq do i do with this");
                    e.printStackTrace();
                }

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
