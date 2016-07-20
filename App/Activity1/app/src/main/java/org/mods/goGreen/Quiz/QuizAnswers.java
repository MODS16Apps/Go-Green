package org.mods.goGreen.Quiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.mods.goGreen.Menus.Sudoku;
import org.mods.goGreen.Quiz.MyQuiz;
import org.mods.goGreen.R;

/**
 * Created by Alissa on 7/20/2015.
 */
public class QuizAnswers extends MyQuiz implements View.OnClickListener {
    static final String TAG="Go Green";
    TextView ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,num;
    TextView[]ts;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_answers);
        View energy = findViewById(R.id.home);
        energy.setOnClickListener(this);
        ans1 = (TextView) findViewById(R.id.ans1);
        ans2 = (TextView) findViewById(R.id.ans2);
        ans3 = (TextView) findViewById(R.id.ans3);
        ans4 = (TextView) findViewById(R.id.ans4);
        ans5 = (TextView) findViewById(R.id.ans5);
        ans6 = (TextView) findViewById(R.id.ans6);
        ans7 = (TextView) findViewById(R.id.ans7);
        ans8 = (TextView) findViewById(R.id.ans8);
        ans9 = (TextView) findViewById(R.id.ans9);
        ans10 = (TextView) findViewById(R.id.ans10);
        num = (TextView) findViewById(R.id.num);

        //---
        Intent i = getIntent();
        boolean[]correct= i.getBooleanArrayExtra("ans");


        Log.d(TAG, "answers"+correct);
        TextView[] t={ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10};
        ts=t;
        grade();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                Intent w = new Intent(this, Sudoku.class);
                startActivity(w);
        }
    }

    public void grade(){
        Intent j = getIntent();
        boolean[]corr= j.getBooleanArrayExtra("ans");
        int c=0;
        Log.d(TAG, "grade");
        for(int i=0;i<ts.length;i++){
            Log.d(TAG, "grade 2");
            if(corr[i]==true){
                Log.d(TAG, "grade 3");
                ts[i].setTextColor(android.graphics.Color.GREEN);
                Log.d(TAG, "grade 4");
                c++;
            }
            else
                ts[i].setTextColor(android.graphics.Color.RED);
        }
     num.setText("You got "+c+"/"+corr.length+" correct");
    }
}
