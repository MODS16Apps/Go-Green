package org.mods.goGreen;

/**
 * Created by Alissa on 7/13/2015.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EngeryEfficent0 extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Energy Efficency Screen");
        setContentView(R.layout.outside);
        View energy = findViewById(R.id.door_button);
        energy.setOnClickListener(this);
        View robo= findViewById(R.id.home);
        robo.setOnClickListener(this);
        View rob= findViewById(R.id.x);
        rob.setOnClickListener(this);
        View robt= findViewById(R.id.check);
        robt.setOnClickListener(this);

    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.door_button:
                Intent i = new Intent(this,EnergyEfficient.class);
                startActivity(i);
                break;
            case R.id.home:
                Intent w = new Intent(this, Sudoku.class);
                startActivity(w);
            case R.id.check:
                new AlertDialog.Builder(this)
                        .setItems(R.array.check,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.x:
                Log.d(TAG,"x");
                new AlertDialog.Builder(this)
                        .setItems(R.array.x,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
        }
    }

    private void startGame(int x){}
}
