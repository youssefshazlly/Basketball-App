package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button backToActivity;
    private int scoreA = 0;
    private int scoreB = 0;
    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backToActivity = (Button) findViewById(R.id.back);
        backToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    // Start Team A
    public void displayscoreA (int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }


    public void pa3(View view) {
        scoreA = scoreA +3;
        displayscoreA(scoreA);

    }

    public void pa2(View view) {
        scoreA = scoreA +2;
        displayscoreA(scoreA);
    }

    public void freeA(View view) {
        scoreA = scoreA + 1;
        displayscoreA(scoreA);
    }

    // End Team A

    // Start Team B

    public void displayScoreB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void pb3(View view) {
        scoreB = scoreB +3;
        displayScoreB(scoreB);
    }

    public void pb2(View view) {
        scoreB = scoreB +2;
        displayScoreB(scoreB);
    }

    public void freeB(View view) {
        scoreB = scoreB +1;
        displayScoreB(scoreB);
    }

    public void rest2(View view) {
        scoreA = 0;
        scoreB = 0;
        displayscoreA(scoreA);
        displayScoreB(scoreB);
    }


    // End Team B
}

