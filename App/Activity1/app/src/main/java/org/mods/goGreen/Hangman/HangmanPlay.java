package org.mods.goGreen.Hangman;

/**
 * Created by Alissa on 7/22/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import android.view.View;

import org.mods.goGreen.R;
import org.mods.goGreen.Menus.Sudoku;


public class HangmanPlay extends Activity {
    TextView tv_qq, tv_title,guesses_left,wrong_letters;
    EditText et_answer;
    Button btn_submit;
    ImageView image;
    private View view;
    String[]words={"recycle","green","climate","compost","reduce","landfill","decompose","soil","dirt","plants"
            ,"reuse","emission","water","weather"};
    String word;
    Drawable h1,h2,h3,h4,h5,h6,h7;
    Drawable pics[];
    ArrayList<String> guessed;
    int left;
    String[]lines;
    private Animation shakeAnimation; // animation for incorrect guess
    private static final String TAG="Go Green";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hangman_play2);
        tv_qq = (TextView) findViewById(R.id.tv_qq);
        tv_title = (TextView) findViewById(R.id.tv_title);
        wrong_letters = (TextView) findViewById(R.id.wrong_letters);
        guesses_left = (TextView) findViewById(R.id.guesses_left);
        et_answer = (EditText) findViewById(R.id.editText);
        btn_submit = (Button) findViewById(R.id.btn_submit);
        image=(ImageView)findViewById(R.id.image);
        h1  = getResources().getDrawable(R.drawable.hang1);
        h2  = getResources().getDrawable(R.drawable.hang2);
        h3  = getResources().getDrawable(R.drawable.hang3);
        h4  = getResources().getDrawable(R.drawable.hang4);
        h5  = getResources().getDrawable(R.drawable.hang5);
        h6  = getResources().getDrawable(R.drawable.hang6);
        h7  = getResources().getDrawable(R.drawable.hang7);
        Drawable[]d={h1,h2,h3,h4,h5,h6,h7 };
        pics=d;

        // load the shake animation that's used for incorrect answers
        // shakeAnimation = AnimationUtils.loadAnimation(R.anim.shake);
        //    shakeAnimation.setRepeatCount(3); // animation repeats 3 times

        String word;
        guessed=new ArrayList<String>();
        left=0;
        tv_qq.setText("Type in a letter below to guess!");
        setup();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void setup(){
        guessed.clear();
        et_answer.setText("");
        wrong_letters.setText("");
        word=words[(int)(Math.random()*words.length)];
        lines=new String[word.length()];
        String s="";
        for(int i=0;i<word.length();i++)
            lines[i] = "____   ";
        tv_qq.setText(arrayToString(lines));
        left=6;
        guesses_left.setText(("You have "+left + " guess(es) left"));
        image.setImageDrawable(pics[pics.length-1]);
    }
    private String arrayToString(String[]arr){
        String s="";
        for(String h:arr) {
            s += h + "";
            if(!h.contains("_"))
                s+="\t\t\t";
        }
        return s;
    }
    private String arrayToString(ArrayList<String>arr){
        String s="";
        for(String h:arr)
            s += h + " ";
        return s;
    }

    public void checkAnswer(View view){
        int c=0;
        tv_title.setText("Guess a letter!");
        String let=et_answer.getText().toString();
        if(let.equalsIgnoreCase("yes")){
            setup();
            return;
        }
        if(let.equalsIgnoreCase("home")){
            Intent f=new Intent(this,Sudoku.class);
            startActivity(f);
            finish();
            return;
        }
        String s=(String)tv_qq.getText();
        for(int i=0;i<word.length();i++) {
            if (word.substring(i, i + 1).equalsIgnoreCase(let))
                lines[i] = let+"\t";
            else
                c++;
        }
        if(c==word.length()) {
            left -= 1;
            guessed.add(let);
            if(left>=0)
                image.setImageDrawable(pics[left]);
            else
                setup();

        }
        tv_qq.setText(arrayToString(lines));
        guesses_left.setText(("You have " +left+" guesses left"));
        wrong_letters.setText(arrayToString(guessed));
        et_answer.setText("");
        if(!(arrayToString(lines).contains("_"))||left==0)
            over();

    }

    private void over(){
        //use more for classes
        if(left==0){
            tv_qq.setText(word);
            // tv_qq.startAnimation(shakeAnimation); // play shake
            tv_title.setText("\n\nThe word was\n"+word+". You lost!\nBetter luck next\ntime... If you would\nlike to play again,\ntype \"yes\"");

        }
        else if(!(arrayToString(lines).contains("_")))
            tv_title.setText("\n\nYou win!\nCongrats... \nIf you would\nlike to play \nagain, type \n\"yes\"");
        String ans=et_answer.getText().toString();
        if(ans.equalsIgnoreCase("yes")) {
            tv_title.setText("Guess a letter!");
            et_answer.setText("");
            setup();
        }
    }
}