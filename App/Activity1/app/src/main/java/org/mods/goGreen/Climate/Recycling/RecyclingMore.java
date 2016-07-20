package org.mods.goGreen.Climate.Recycling;

/**
 * Created by Alissa on 7/19/2015.
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.Menus.Sudoku;
import org.mods.goGreen.R;

public class RecyclingMore extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "More Recycling");
        setContentView(R.layout.recycling_more);
        View energy = findViewById(R.id.paper_button);
        energy.setOnClickListener(this);
        View energ = findViewById(R.id.phone_button);
        energ.setOnClickListener(this);
        View continueButton = findViewById(R.id.can_button);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.cardboard_button);
        game_button.setOnClickListener(this);
        View aboutButton = findViewById(R.id.socks_button);
        aboutButton.setOnClickListener(this);
        View u=findViewById(R.id.home);
        u.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.paper_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.paper,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.phone_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.phone,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.can_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.can,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.cardboard_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.cardboard,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.socks_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.socks,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.home:
                Intent w=new Intent(this,Sudoku.class);
                startActivity(w);
                break;

        }
    }

    private void startGame(int i){}
}

