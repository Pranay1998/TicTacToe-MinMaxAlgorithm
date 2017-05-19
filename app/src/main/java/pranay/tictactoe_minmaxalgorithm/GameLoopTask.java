package pranay.tictactoe_minmaxalgorithm;

import android.app.Activity;
import android.util.Log;

import java.util.TimerTask;

/**
 * Created by Pranay on 18/05/17.
 */



public class GameLoopTask extends TimerTask {


    TicTacToeGameBoard.STATE replaceLater;
    Activity myActivity;

    public GameLoopTask(Activity activity){



    }

    public void run(){

        myActivity.runOnUiThread(
            new Runnable(){
                public void run(){

                    switch (replaceLater) {

                        case PLAYING: {


                        }
                        break;

                        case CROSS_LOSES: {
                            destroyTimer();
                            Log.d("Game Over", "CIRCLE WINS");
                        }break;

                        case CROSS_WINS: {
                            destroyTimer();
                            Log.d("Game Over", "CROSS WINS");
                        }break;

                        case DRAW: {
                            destroyTimer();
                            Log.d("Game Over", "DRAW");
                        }break;

                    }
                    
                }
            }

        );

    }
    
    public void destroyTimer(){
        this.cancel();
    }

}
