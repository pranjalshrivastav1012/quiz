package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionTwo extends AppCompatActivity {

    TextView tv, mQuestionNo, mQuestion;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);

        tv = (TextView) findViewById(R.id.score_2);
        mB1 = (Button) findViewById(R.id.btn1_q2);
        mB2 = (Button) findViewById(R.id.btn2_q2);
        mB3 = (Button) findViewById(R.id.btn3_q2);
        mB4 = (Button) findViewById(R.id.btn4_q2);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        tv.setText("Score : " + score);

        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionThree(0);
            }
        });


        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionThree(0);
            }
        });

        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionThree(1);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionThree(0);
            }
        });


    }


    private void startQuestionThree(int scr) {
        Intent intent2 = new Intent(this, QuestionThree.class);
        intent2.putExtra("score", scr + score);
        startActivity(intent2);
    }
}