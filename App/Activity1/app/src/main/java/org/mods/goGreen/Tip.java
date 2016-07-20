package org.mods.goGreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Alissa on 7/12/2015.
 */

//DO THE BUTTONS AND ALL THE STUFF
public class Tip extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "tips");
        setContentView(R.layout.cli_about);
        View energ = findViewById(R.id.button7);
        energ.setOnClickListener(this);
        View energy = findViewById(R.id.button8);
        Log.d(TAG, "tips");
        energy.setOnClickListener(this);
        View robot= findViewById(R.id.button9);
        robot.setOnClickListener(this);
        View robo= findViewById(R.id.button10);
        robo.setOnClickListener(this);
        View rob= findViewById(R.id.waste_button);
        rob.setOnClickListener(this);
        View b= findViewById(R.id.home);
        b.setOnClickListener(this);
        Log.d(TAG, "tips2");
    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.home:
                Intent y=new Intent(this,Sudoku.class);
                startActivity(y);
                break;
            case R.id.button7:
                break;
            case R.id.button8:
                finish();
                Intent i = new Intent(this, CliGreenhouse.class);
                startActivity(i);
                break;
            case R.id.button10:
                finish();
                Intent g = new Intent(this, CliWeather.class);
                startActivity(g);
                break;
            case R.id.button9:
                finish();
                Intent h = new Intent(this, CliWater.class);
                startActivity(h);
                break;
            case R.id.waste_button:
                Intent k = new Intent(this, Waste.class);
                startActivity(k);
                break;
        }
    }
 }
