package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionThree extends AppCompatActivity {

    TextView  mQuestionNo, mQuestion;
    Button mB1, mB2;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);

        mB1 = (Button) findViewById(R.id.btn1_q3);
        mB2 = (Button) findViewById(R.id.btn2_q3);


        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);


        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionFour(1);
            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionFour(0);
            }
        });


    }

        private void startQuestionFour (int scr) {
            Intent intent3 = new Intent(this, QuestionFour.class);
            intent3.putExtra("score", scr + score);
            startActivity(intent3);


        }
    }

