/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.mods.goGreen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudoku extends Activity implements OnClickListener {
    private static final String TAG = "Go Green";
    private View view;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.new_button);
        game_button.setOnClickListener(this);
        /*View aboutButton = findViewById(R.id.map_button);
        aboutButton.setOnClickListener(this);*/
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        View view;
        //Methods.setBackground(Constants.goGreenGreen, continueButton.getBackground());
        //Methods.setBackground(Constants.goGreenGreen, game_button.getBackground());
        //Methods.setBackground(Constants.goGreenGreen, exitButton.getBackground());
    }

    // ...
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.continue_button:
                Intent i = new Intent(this, Information.class);
                startActivity(i);
                Log.d(TAG, "Info was clicked on!");
                break;
            case R.id.new_button:
                view = v;
                openGames();
                break;
            /*case R.id.map_button:
                Intent j = new Intent(this, Map.class);
                startActivity(j);
 
//not used with understanding that Github has upload size limits, will use in actual app               //Intent LaunchIntent = getPackageManager()
                        //.getLaunchIntentForPackage("com.example.modsexplorer");
                //startActivity(LaunchIntent);
                break;*/
            case R.id.exit_button:
                Log.d(TAG, "Exit was clicked on!");
                Intent y=new Intent(this,ClimateMap.class);
                startActivity(y);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                startActivity(new Intent(this, Prefs.class));
                return true;
            // More items go here (if any) ...
        }
        return false;
    }

    /**
     * Ask the user what difficulty level they want
     */

    private void openGames() {
        new AlertDialog.Builder(this)
                .setTitle("Which game do you want to play?")
                .setItems(R.array.games,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialoginterface,
                                                int i) {
                                startGame(i);
                            }
                        })
                .show();
    }


    /**
     * Start a new game with the given difficulty level
     */
    private void startGame(int i) {
        Log.d(TAG, "Game was clicked on, with difficulty " + i);
        if (i == 0) {
            //launchApp(view);
            Intent h=new Intent(this,Hangman.class);
            startActivity(h);
        }
        else {
            Intent j=new Intent(this,MyQuiz.class);
            startActivity(j);
            Log.d(TAG, "after intent");
           // launchApp(view);
        }
    }
    public void launchApp2(View v) {
        Intent LaunchIntent = getPackageManager()
                .getLaunchIntentForPackage("edu.fau.testapp");
        startActivity(LaunchIntent);
        //finish();

    }


    //actually use this one
    public void launchApp1(View v){

        Intent intent = new Intent();
        intent.setAction("edu.fau.testapp");
        sendBroadcast(intent);

    }
    public void launchApp(View v){

        Intent LaunchIntent = getPackageManager()
                .getLaunchIntentForPackage("package com.example.modsexplorer");
        startActivity(LaunchIntent);

    }
}
