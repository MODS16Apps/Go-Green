package org.mods.goGreen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sergioramirez on 7/18/16.
 */
public class ClimateMap extends Activity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.climate_change_map);
        View australia = findViewById(R.id.australia_button);
        australia.setOnClickListener(this);
        View brazil = findViewById(R.id.brazil_button);
        brazil.setOnClickListener(this);
        View china = findViewById(R.id.china_button);
        china.setOnClickListener(this);
        View eu = findViewById(R.id.eu_button);
        eu.setOnClickListener(this);
        View india = findViewById(R.id.india_button);
        india.setOnClickListener(this);
        View indonesia = findViewById(R.id.indonesia_button);
        indonesia.setOnClickListener(this);
        View japan = findViewById(R.id.japan_button);
        japan.setOnClickListener(this);
        View russia = findViewById(R.id.russia_button);
        russia.setOnClickListener(this);
        View southAfrica = findViewById(R.id.south_africa_button);
        southAfrica.setOnClickListener(this);
        View us = findViewById(R.id.usa_button);
        us.setOnClickListener(this);
        new AlertDialog.Builder(this)
                .setItems(R.array.map_explain,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialoginterface,
                                                int i) {
                                startGame(i);
                            }
                        })
                .show();
        //View un = findViewById(R.id.un);
        //un.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.australia_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.australia,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.brazil_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.brazil,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.china_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.china,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.eu_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.eu,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.india_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.india,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.indonesia_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.indonesia,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.japan_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.japan,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.russia_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.russia,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.south_africa_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.south_africa,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.usa_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.usa,
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

    public void startGame(int i) {
    }

}
