package org.mods.goGreen;

/**
 * Created by Alissa on 7/13/2015.
 */
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.view.View;

public class HouseBathroom extends Activity implements View.OnClickListener {
    private static final String TAG="Go Green";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inside Bathroom");
        setContentView(R.layout.house_bathroom);
        View continueButton = findViewById(R.id.shower_button);
        continueButton.setOnClickListener(this);
        View game_button = findViewById(R.id.toilet_button);
        game_button.setOnClickListener(this);
        View aboutButton = findViewById(R.id.sink_button);
        aboutButton.setOnClickListener(this);
        View aboutButto = findViewById(R.id.back);
        aboutButto.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shower_button:
                 new AlertDialog.Builder(this)
                    .setItems(R.array.shower,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialoginterface,
                                                    int i) {
                                    startGame(i);
                                }
                            })
                    .show();
                break;
            case R.id.sink_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.sink,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.toilet_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.toilet,
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
