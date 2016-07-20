package org.mods.goGreen.HarryTheHeap;

/**
 * Created by Alissa on 7/12/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

import org.mods.goGreen.Menus.Sudoku;
import org.mods.goGreen.R;

public class TripMaterials extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "materials screen");
        setContentView(R.layout.trip_materials);
        View energy = findViewById(R.id.home);
        energy.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                Intent i = new Intent(this, Sudoku.class);
                startActivity(i);
                break;
        }
    }
}
