package pranay.tictactoe_minmaxalgorithm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button start = (Button) findViewById(R.id.button);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askGameInformation();
            }
        });




    }


    public void askGameInformation(){

        Intent myIntent = new Intent(MainActivity.this,GameBoard.class);
        startActivity(myIntent);

    }
}
