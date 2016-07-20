package org.mods.goGreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Alissa on 7/20/2015.
 */
public class CliWater extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "cli WATER");
        setContentView(R.layout.cli_water);
        Log.d(TAG, "cli WATER 2");
        View energy = findViewById(R.id.button7);
        energy.setOnClickListener(this);
        View b= findViewById(R.id.home);
        b.setOnClickListener(this);
        View energ = findViewById(R.id.button8);
        energ.setOnClickListener(this);
        Log.d(TAG, "cli WATER 3");
        View robot= findViewById(R.id.button9);
        robot.setOnClickListener(this);
        Log.d(TAG, "cli WATER 4");
        View robo= findViewById(R.id.button10);
        robo.setOnClickListener(this);
        Log.d(TAG, "cli WATER 5");
        View rob= findViewById(R.id.diagram_button);
        rob.setOnClickListener(this);
        Log.d(TAG, "cli WATER 00");

    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button7:
                finish();
                Intent j = new Intent(this, Tip.class);
                startActivity(j);
                break;
            case R.id.home:
                Intent y=new Intent(this,Sudoku.class);
                startActivity(y);
                break;
            case R.id.button8:
                finish();
                Intent g = new Intent(this, CliGreenhouse.class);
                startActivity(g);
                break;
            case R.id.button10:
                finish();
                Intent h = new Intent(this, CliWeather.class);
                startActivity(h);
                break;
            case R.id.button9:
                break;
            case R.id.diagram_button:
                Intent k = new Intent(this, Waste.class);
                startActivity(k);
                break;
        }
    }
}
