package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionNine extends AppCompatActivity {

    TextView mQuestionNo, mQuestion;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);


        mB1 = (Button)findViewById(R.id.btn1_q9);
        mB2 = (Button)findViewById(R.id.btn2_q9);
        mB3 = (Button)findViewById(R.id.btn3_q9);
        mB4 = (Button)findViewById(R.id.btn4_q9);

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);



        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTen(0);

            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionTen(1);
            }
        });


        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTen(0);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTen(0);
            }
        });
    }


    private void startQuestionTen (int scr){
        Intent intent9 = new Intent(this,QuestionTen.class);
        intent9.putExtra("score", scr+ score);
        startActivity(intent9);





    }}