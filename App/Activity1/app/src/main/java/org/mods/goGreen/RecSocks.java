package org.mods.goGreen;

/**
 * Created by Alissa on 7/19/2015.
 */
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

public class RecSocks extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "rec socks");
        setContentView(R.layout.rec_socks);
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