package org.mods.goGreen.House;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

import org.mods.goGreen.R;

/**
 * Created by Alissa on 7/13/2015.
 */
public class HouseBedroom extends Activity implements View.OnClickListener {
    private static final String TAG = "Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside Garage");
        setContentView(R.layout.house_bedroom);
        View energy = findViewById(R.id.power_button);
        energy.setOnClickListener(this);
        View continueButton = findViewById(R.id.window_button);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.temp_button);
        game_button.setOnClickListener(this);
        View aboutButton = findViewById(R.id.light_button);
        aboutButton.setOnClickListener(this);
        View aboutButto = findViewById(R.id.door_button);
        aboutButto.setOnClickListener(this);
        View aboutButt = findViewById(R.id.back);
        aboutButt.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.power_button:
;                new AlertDialog.Builder(this)
                    .setItems(R.array.power,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialoginterface,
                                                    int i) {
                                    startGame(i);
                                }
                            })
                    .show();
            break;
            case R.id.window_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.window,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.temp_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.temp,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.door_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.door,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.light_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.light,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.back:
                finish();
                break;
        }
    }

    public void startGame(int i){}

}
