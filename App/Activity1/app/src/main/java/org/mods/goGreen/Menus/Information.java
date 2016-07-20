/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.mods.goGreen.Menus;


   import android.app.Activity;
   import android.content.Intent;
   import android.os.Bundle;
   import android.util.Log;
   import android.view.Menu;
   import android.view.MenuInflater;
   import android.view.MenuItem;
   import android.view.View;

   import org.mods.goGreen.House.EngeryEfficent0;
   import org.mods.goGreen.Constants.Prefs;
   import org.mods.goGreen.R;
   import org.mods.goGreen.Climate.Recycling.Recycling;
   import org.mods.goGreen.Climate.Tip;
   import org.mods.goGreen.HarryTheHeap.Trip;

public class Information extends Activity implements View.OnClickListener {
      private static final String TAG = "Go Green";

    //  @Override
     // protected void onCreate(Bundle savedInstanceState) {
       //  super.onCreate(savedInstanceState);
        // setContentView(R.layout.about1);
      //}
      /** Called when the activity is first created. */
      @Override
      protected void onCreate(Bundle savedInstanceState){
          super.onCreate(savedInstanceState);
          setContentView(R.layout.about1);
          Log.d(TAG, "info_ clicked on");
          View energy = findViewById(R.id.eng_eff_button);
          energy.setOnClickListener(this);
          View trip = findViewById(R.id.harry_heap_button);
          trip.setOnClickListener(this);
          View tips = findViewById(R.id.climate_change_button);
          tips.setOnClickListener(this);
          View rec = findViewById(R.id.recycle_button);
          rec.setOnClickListener(this);
       //   View back= findViewById(R.id.back_button);
         // back.setOnClickListener(this);

      }


      public void onClick(View v){
           switch (v.getId()) {
               case R.id.eng_eff_button:
                   Intent i = new Intent(this, EngeryEfficent0.class);
                   startActivity(i);
                   break;
               case R.id.harry_heap_button:
                   Log.d(TAG,"TRIP");
                   Intent h=new Intent(this,Trip.class);
                   startActivity(h);
                   break;
               case R.id.climate_change_button:
                   Intent a=new Intent(this,Tip.class);
                   startActivity(a);
                   break;
               case R.id.recycle_button:
                   Intent b=new Intent(this,Recycling.class);
                   startActivity(b);
                   break;

           }
       }



      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menu, menu);
         return true;
      }

      @Override
      public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
            case R.id.settings:
               startActivity(new Intent(this, Prefs.class));
               return true;
            // More items go here (if any) ...
         }
         return false;
      }

      /** Ask the user what difficulty level they want */

   }
