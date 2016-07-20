package org.mods.goGreen.House;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

import org.mods.goGreen.R;

public class HouseKitchen extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "house garage");
        setContentView(R.layout.house_kitchen);
        View energy = findViewById(R.id.sink);
        energy.setOnClickListener(this);
        View continueButton = findViewById(R.id.fridge);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.oven);
        game_button.setOnClickListener(this);
        View aboutButton = findViewById(R.id.dishwasher);
        aboutButton.setOnClickListener(this);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dishwasher:
                new AlertDialog.Builder(this)
                        .setItems(R.array.dishwasher,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.oven:
                new AlertDialog.Builder(this)
                        .setItems(R.array.oven,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.sink:
                new AlertDialog.Builder(this)
                        .setItems(R.array.sink2,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.fridge:
                new AlertDialog.Builder(this)
                        .setItems(R.array.fridge,
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

    public void startGame(int i){}

}
