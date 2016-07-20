package org.mods.goGreen;

/**
 * Created by Alissa on 7/17/2015.
 */

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class Credits extends Activity{
    private static final String TAG="Go Green";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "house garage");
        setContentView(R.layout.credits);
    }
}
