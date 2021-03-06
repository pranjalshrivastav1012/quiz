package com.pranjal.sri.quizapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionTen extends AppCompatActivity {

    TextView  mQuestionNo, mQuestion;
    Button mPlay,mPause, mB2, mB3, mB4;
    int score = 0;
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);


        mySong = MediaPlayer.create(QuestionTen.this,R.raw.letmedown);
        mPlay = (Button)findViewById(R.id.Play_it);
        mPause = (Button)findViewById(R.id.Pause_it);
        mB2 = (Button)findViewById(R.id.btn2_q10);
        mB3 = (Button)findViewById(R.id.btn3_q10);
        mB4 = (Button)findViewById(R.id.btn4_q10);

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);


        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mySong.start();
            }


        });


        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySong.pause();
            }
        });



        mB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFinalClass(0);
            }
        });


        mB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startFinalClass(1);
            }
        });

        mB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startFinalClass(0);
            }
        });
    }


    private void startFinalClass (int scr){
        Intent intent10 = new Intent(this,FinalClass.class);
        intent10.putExtra("score", scr+ score);
        startActivity(intent10);

    }

     @Override
    protected void onPause(){
        super.onPause();
        mySong.release();

     }


}
