package org.mods.goGreen.HarryTheHeap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.Menus.Sudoku;
import org.mods.goGreen.R;

/**
 * Created by Alissa on 7/12/2015.
 */
public class Trip extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG, "TRIP");
        setContentView(R.layout.trip);
        View lyrics = findViewById(R.id.trip_lyrics_button);
        lyrics.setOnClickListener(this);
        View materials= findViewById(R.id.trip_materials_button);
        materials.setOnClickListener(this);
        View home= findViewById(R.id.home);
        home.setOnClickListener(this);
    }



    public void onClick(View v){
        switch (v.getId()) {
            case R.id.trip_lyrics_button:
                Intent i = new Intent(this, TripLyrics.class);
                startActivity(i);
                break;
            case R.id.trip_materials_button:
                Log.d(TAG,"TRIP");
                Intent h=new Intent(this,TripMaterials.class);
                startActivity(h);
                break;
            case R.id.home:
                Intent j = new Intent(this, Sudoku.class);
                startActivity(j);
                break;
        }
    }
}
