package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinalClass extends AppCompatActivity {

    TextView tv;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_class);

        tv = (TextView) findViewById(R.id.Final_score);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);

        if (score > 0 && score <= 3) {
            tv.setText("Ah! Its bit low" + "Score : " + score);
        } else if (score > 3 && score <= 7) {
            tv.setText("Congratulations! Your score is"+"Score : " + score );
        } else if (score>7&& score<=9) {
            tv.setText("Congratulations! Your score is"+"Score : " + score );
        } else {
            tv.setText("Congratulations! Your score is"+"Score : " + score );
        }
    }
}

