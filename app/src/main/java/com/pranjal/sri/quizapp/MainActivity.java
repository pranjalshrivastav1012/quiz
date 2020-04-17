package com.pranjal.sri.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mStart;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mStart = (Button)findViewById(R.id.start_btn);
       mStart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               startQuestionOne(0);

           }
       });
            }


    private void startQuestionOne(int score){
        Intent intent = new Intent(this, QuestionOne.class);
        startActivity(intent);
    }

}
