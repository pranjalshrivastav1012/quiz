package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionFive extends AppCompatActivity {

    TextView  mQuestionNo, mQuestion;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);

        mB1 = (Button)findViewById(R.id.btn1_q5);
        mB2 = (Button)findViewById(R.id.btn2_q5);
        mB3 = (Button)findViewById(R.id.btn3_q5);
        mB4 = (Button)findViewById(R.id.btn4_q5);

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);


        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionSix(1);

            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionSix(0);
            }
        });


        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionSix(0);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionSix(0);
            }
        });
    }


    private void startQuestionSix (int scr){
        Intent intent5 = new Intent(this,QuestionSix.class);
        intent5.putExtra("score", scr+ score);
        startActivity(intent5);





    }}