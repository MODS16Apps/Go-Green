package org.mods.goGreen.Quiz;

/**
 * Created by Alissa on 7/18/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

import org.mods.goGreen.R;

public class QuizEasy extends Activity implements OnClickListener {
    private static final String TAG = "Go Green";
    RadioButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    RadioButton[] butts;
    boolean[]correct;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Entered Quiz");
        setContentView(R.layout.quiz_easy);
        View energy = findViewById(R.id.submit);
        energy.setOnClickListener(this);
        c1 = (RadioButton) findViewById(R.id.c1);
        c2 = (RadioButton) findViewById(R.id.c2);
        c3 = (RadioButton) findViewById(R.id.c3);
        c4 = (RadioButton) findViewById(R.id.c4);
        c5 = (RadioButton) findViewById(R.id.c5);
        c6 = (RadioButton) findViewById(R.id.c6);
        c7 = (RadioButton) findViewById(R.id.c7);
        c8 = (RadioButton) findViewById(R.id.c8);
        c9 = (RadioButton) findViewById(R.id.c9);
        c10 = (RadioButton) findViewById(R.id.c10);
        RadioButton[] q={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
        butts=q;
        correct=new boolean[q.length];
    }


   public void onClick(View v){
        switch (v.getId()) {
            case R.id.submit:
                numCorrect();
                Log.d(TAG, "4");
                Intent i = new Intent(this,QuizAnswers.class);
                i.putExtra("ans",correct);
                startActivity(i);
                Log.d(TAG, "5");
                break;
        }
    }

    public int numCorrect(){
        int c=0;
        Log.d(TAG,"1");
        for(int i=0;i<butts.length;i++) {
            if (butts[i].isChecked()) {
                c++;
                correct[i]=true;
            }
            else
                correct[i]=false;
        }
        Log.d(TAG,c+"!");
        return c;

    }

    public boolean[] getCorrect(){return correct;}
}