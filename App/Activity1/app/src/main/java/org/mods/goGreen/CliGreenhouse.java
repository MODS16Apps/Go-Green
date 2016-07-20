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
public class CliGreenhouse extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "cli greenhouse");
        setContentView(R.layout.cli_greenhouse);
        View energy = findViewById(R.id.button7);
        energy.setOnClickListener(this);
        View b= findViewById(R.id.home);
        b.setOnClickListener(this);
        View energ = findViewById(R.id.button8);
        energ.setOnClickListener(this);
        View robot= findViewById(R.id.button9);
        robot.setOnClickListener(this);
        View robo= findViewById(R.id.button10);
        robo.setOnClickListener(this);
        View rob= findViewById(R.id.diagram_button);
        rob.setOnClickListener(this);
    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button7:
                /////////////
                //finish();
                finish();
                Intent k = new Intent(this, Tip.class);
                startActivity(k);
                break;
            case R.id.home:
                Intent y=new Intent(this,Sudoku.class);
                startActivity(y);
                break;
            case R.id.button8:
                break;
            case R.id.button10:
                finish();
                Intent h = new Intent(this, CliWeather.class);
                startActivity(h);
                break;
            case R.id.button9:
                finish();
                Intent g = new Intent(this, CliWater.class);
                startActivity(g);
                break;
            case R.id.diagram_button:
                Intent p = new Intent(this, Waste.class);
                startActivity(p);
                break;
        }
    }
}