package org.mods.goGreen.House;
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
import android.widget.Button;

import org.mods.goGreen.R;

public class HouseGarage extends Activity implements OnClickListener {
    private static final String TAG = "Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside Garage");
        setContentView(R.layout.house_garage);
        View energy = findViewById(R.id.car_button);
        energy.setOnClickListener(this);
        View continueButton = findViewById(R.id.bins_button);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.line_button);
        game_button.setOnClickListener(this);
        View aboutButton = findViewById(R.id.machine_button);
        aboutButton.setOnClickListener(this);
        View aboutButto = findViewById(R.id.back);
        aboutButto.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.car_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.car,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.bins_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.bins,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.line_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.line,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.machine_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.machine,
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

