package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionSeven extends AppCompatActivity {

    TextView mQuestionNo, mQuestion;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);

        mB1 = (Button)findViewById(R.id.btn1_q7);
        mB2 = (Button)findViewById(R.id.btn2_q7);
        mB3 = (Button)findViewById(R.id.btn3_q7);
        mB4 = (Button)findViewById(R.id.btn4_q7);

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);

        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionEight(0);

            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionEight(0);
            }
        });


        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionEight(1);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionEight(0);
            }
        });
    }


    private void startQuestionEight (int scr){
        Intent intent7 = new Intent(this,QuestionEight.class);
        intent7.putExtra("score", scr+ score);
        startActivity(intent7);





    }}