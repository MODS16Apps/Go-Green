package org.mods.goGreen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

/**
 * Created by Alissa on 7/12/2015.
 */
public class TripLyrics extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Lyrics");
        setContentView(R.layout.trip_lyrics);
        View robo= findViewById(R.id.home);
        robo.setOnClickListener(this);
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
