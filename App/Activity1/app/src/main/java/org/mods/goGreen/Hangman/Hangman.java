package org.mods.goGreen.Hangman;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.R;
import org.mods.goGreen.Menus.Sudoku;

/**
 * Created by Alissa on 7/15/2015.
 */
public class Hangman extends Activity implements View.OnClickListener {
    private static final String TAG = "Go Green Quiz";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hangman_start);
        Log.d(TAG, "info_ clicked on");
        View trip = findViewById(R.id.start);
        trip.setOnClickListener(this);
        View t=findViewById(R.id.home);
        t.setOnClickListener(this);
    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.start:
                Log.d(TAG, "Start");
                Intent t=new Intent(this,HangmanPlay.class);
                startActivity(t);
                //launchApp(v);
                //Intent intent = new Intent();
                //intent.setAction("edu.fau.testapp");
                //sendBroadcast(intent);
                break;
            case R.id.home:
                Intent y=new Intent(this,Sudoku.class);
                startActivity(y);

        }
    }

     public void launchApp(View v) {
         //Intent LaunchIntent = getPackageManager()
           //      .getLaunchIntentForPackage("edu.fau.testapp");
        // startActivity(LaunchIntent);

         Intent intent = new Intent();
         intent.setAction("edu.fau.testapp");
         sendBroadcast(intent);

     }


    //used instead so don have to download actual flag app
    public void launchApp1(View v){

        Intent intent = new Intent();
        intent.setAction("edu.fau.testapp");
        sendBroadcast(intent);

    }

}