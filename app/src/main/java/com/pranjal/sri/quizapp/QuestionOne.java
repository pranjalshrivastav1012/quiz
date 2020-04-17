package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionOne extends AppCompatActivity {

    TextView getmQuestionNo1, mQuestion, tv;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);

        tv = (TextView)findViewById(R.id.score_1);
        mB1 = (Button)findViewById(R.id.btn1_q1);
        mB2 = (Button)findViewById(R.id.btn2_q1);
        mB3 = (Button)findViewById(R.id.btn3_q1);
        mB4 = (Button)findViewById(R.id.btn4_q1);
        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        tv.setText(score + "");

        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionTwo(1);

            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTwo(0);

            }
        });

        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTwo(0);

            }
        });


        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionTwo(0);
            }
        });



    }

    private void startQuestionTwo(int scr){
        Intent intent1 = new Intent(this, QuestionTwo.class);
        intent1.putExtra("score", scr+score);
        startActivity(intent1);
    }
}

