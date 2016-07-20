package org.mods.goGreen.Climate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.R;

/**
 * Created by Alissa on 7/16/2015.
 */
public class Climate2 extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Diagram 2");
        setContentView(R.layout.climate2);
        View energy = findViewById(R.id.next_button);
        energy.setOnClickListener(this);
        View energ = findViewById(R.id.exit);
        energ.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.next_button:
                finish();
                break;
            case R.id.exit:
                Intent i=new Intent(this,Tip.class);
                startActivity(i);
        }
    }
}

