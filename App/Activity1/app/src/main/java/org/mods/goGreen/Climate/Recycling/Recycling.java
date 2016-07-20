package org.mods.goGreen.Climate.Recycling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.mods.goGreen.Climate.Decay;
import org.mods.goGreen.Menus.Sudoku;
import org.mods.goGreen.R;

public class Recycling extends Activity implements View.OnClickListener{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Rec at Mods");
        setContentView(R.layout.rec_at_mods);
        View energy = findViewById(R.id.back_rec_button);
        energy.setOnClickListener(this);
        View energ = findViewById(R.id.home);
        energ.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.back_rec_button:
                Intent b=new Intent(this,Decay.class);
                startActivity(b);
                break;
            case R.id.home:
                Intent w=new Intent(this,Sudoku.class);
                startActivity(w);
                break;
        }
    }
}
