package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionFour extends AppCompatActivity {

    TextView  mQuestionNo, mQuestion;
    Button mB1, mB2, mB3, mB4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);

        mB1 = (Button) findViewById(R.id.btn1_q4);
        mB2 = (Button) findViewById(R.id.btn2_q4);
        mB3 = (Button) findViewById(R.id.btn3_q4);
        mB4 = (Button) findViewById(R.id.btn4_q4);


        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);

        mB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionFive(0);

            }
        });

        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuestionFive(0);
            }
        });


        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionFive(1);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startQuestionFive(0);
            }
        });
    }


    private void startQuestionFive (int scr){
        Intent intent4 = new Intent(this,QuestionFive.class);
        intent4.putExtra("score", scr+ score);
        startActivity(intent4);




        }

}
