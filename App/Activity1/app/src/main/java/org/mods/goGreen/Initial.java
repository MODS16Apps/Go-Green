package org.mods.goGreen;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.String;


/**
 * Created by sergioramirez on 7/19/16.
 */
public class Initial extends Activity implements View.OnClickListener{
    private static String TAG="Go Green Analytics";

    private static EditText userNameGet;
    private static EditText userBirthGet;
    public static String userName="";
    public static String userBirth="";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_page);
        View uN=findViewById(R.id.nameEntry);
        uN.setOnClickListener(this);
        View uB=findViewById(R.id.dateEntry);
        uB.setOnClickListener(this);
        userNameGet=(EditText) findViewById(R.id.nameEntry);
        userBirthGet=(EditText) findViewById(R.id.dateEntry);
        View go=findViewById(R.id.enter_button);
        go.setOnClickListener(this);
        View view;

    }

    @Override
    public void onClick(View view) {
        getInfo();
        switch (view.getId()) {
            case R.id.nameEntry:
                if (userNameGet.getText().toString().equals("Name"))
                    userNameGet.setText("");
                if(userBirthGet.getText().toString().equals("")){
                    userBirthGet.setText("Birthday (mm/dd/yyyy)");
                }
                break;
            case R.id.dateEntry:
                if(userBirthGet.getText().toString().equals("Birthday (mm/dd/yyyy)"))
                    userBirthGet.setText("");
                if(userNameGet.getText().toString().equals("")){
                    userNameGet.setText("Name");
                }
                break;
            case R.id.enter_button:
                Intent i = new Intent(this, Sudoku.class);
                startActivity(i);
        }
    }
    public void getInfo(){
        userName=userNameGet.getText().toString();
        userBirth=userBirthGet.getText().toString();
        Log.d(TAG, userName);
        Log.d(TAG, userBirth);
    }
}
