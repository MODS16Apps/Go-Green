package org.mods.goGreen.Climate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.Climate.Climate2;
import org.mods.goGreen.R;

public class Waste extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    public Waste(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Diagram 1");
        setContentView(R.layout.waste);
        View energy = findViewById(R.id.next_button);
        energy.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.next_button:
                Intent i = new Intent(this, Climate2.class);
                startActivity(i);
                break;
        }
    }

    public void end(){
        Log.d(TAG,"ENDED! 1");
        finish();
        Log.d(TAG, "ENDED! 2");
    }
}
