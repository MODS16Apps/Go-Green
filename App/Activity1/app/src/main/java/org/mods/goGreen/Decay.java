package org.mods.goGreen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import org.mods.goGreen.R;

/**
 * Created by sergioramirez on 7/18/16.
 */
public class Decay extends Activity implements View.OnClickListener {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setItems(R.array.decay_explain,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialoginterface,
                                                int i) {
                                startGame(i);
                            }
                        })
                .show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycling_more);
        View can = findViewById(R.id.can_button);
        can.setOnClickListener(this);
        View bag_paper = findViewById(R.id.bag_button);
        bag_paper.setOnClickListener(this);
        View bottle_plastic = findViewById(R.id.bottle_button);
        bottle_plastic.setOnClickListener(this);
        View plastic_wrap = findViewById(R.id.aluminum_foil_button);
        plastic_wrap.setOnClickListener(this);
        View banana = findViewById(R.id.banana_button);
        banana.setOnClickListener(this);
        View apple = findViewById(R.id.apple_button);
        apple.setOnClickListener(this);
        View bottle_glass = findViewById(R.id.glass_bottle_button);
        bottle_glass.setOnClickListener(this);
        View bag_plastic = findViewById(R.id.plastic_bag);
        bag_plastic.setOnClickListener(this);
        View gum = findViewById(R.id.gum_button);
        gum.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.can_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.cans,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.bag_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.paper_bag,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.bottle_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.plastic_bottle,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.aluminum_foil_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.plastic_wrap,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.banana_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.banana,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.apple_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.apple,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.glass_bottle_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.glass_bottle,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.plastic_bag:
                new AlertDialog.Builder(this)
                        .setItems(R.array.plastic_bag,
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialoginterface,
                                                        int i) {
                                        startGame(i);
                                    }
                                })
                        .show();
                break;
            case R.id.gum_button:
                new AlertDialog.Builder(this)
                        .setItems(R.array.gum,
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

    public void startGame(int i) {
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Decay Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.mods.goGreen/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Decay Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.mods.goGreen/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
