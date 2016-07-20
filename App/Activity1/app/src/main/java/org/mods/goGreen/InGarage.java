package org.mods.goGreen;

/**
 * Created by Alissa on 7/17/2015.
 */
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
    import android.widget.Button;

    public class InGarage extends Activity{
        private static final String TAG="Go Green";
        Button upstairs_button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(TAG, "Inside Garage");
            setContentView(R.layout.in_garage);
        }
}
