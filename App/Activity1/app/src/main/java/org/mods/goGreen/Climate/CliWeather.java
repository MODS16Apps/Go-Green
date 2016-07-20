package org.mods.goGreen.Climate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.R;
import org.mods.goGreen.Menus.Sudoku;

/**
 * Created by Alissa on 7/20/2015.
 */
public class CliWeather extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "cli greenhouse");
        setContentView(R.layout.cli_weather);
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
                Intent j = new Intent(this, Tip.class);
                finish();
                startActivity(j);
                break;
            case R.id.button8:
                finish();
                Intent g = new Intent(this, CliGreenhouse.class);
                startActivity(g);
                break;
            case R.id.button10:
                break;
            case R.id.button9:
                finish();
                Intent h = new Intent(this, CliWater.class);
                startActivity(h);
                break;
            case R.id.diagram_button:
                Intent k = new Intent(this, Waste.class);
                startActivity(k);
                break;
            case R.id.home:
                Intent y=new Intent(this,Sudoku.class);
                startActivity(y);
                break;
        }
    }
}
