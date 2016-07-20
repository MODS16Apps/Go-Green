package org.mods.goGreen;

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

public class MyQuiz extends Activity implements View.OnClickListener {
    private static final String TAG = "Go Green Quiz";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_homepage);
        Log.d(TAG, "info_ clicked on");
        View energy = findViewById(R.id.home);
        energy.setOnClickListener(this);
        View trip = findViewById(R.id.start_button);
        trip.setOnClickListener(this);
    }


    public void onClick(View v){
        switch (v.getId()) {
            case R.id.start_button:
                Intent i=new Intent(this,QuizEasy.class);
                startActivity(i);
                //launchApp(v);
                break;
            case R.id.home:
                Log.d(TAG, "back");
                finish();
                break;
        }
    }

/**  public void launchApp(View v) {
        Intent LaunchIntent = getPackageManager()
                .getLaunchIntentForPackage("com.deitel.flagquiz");
        startActivity(LaunchIntent);

    }
**/

  //used instead so don have to download actual flag app
   public void launchApp(View v){

        Intent intent = new Intent();
        intent.setAction("com.deitel.flagquiz");
        sendBroadcast(intent);

    }

}

