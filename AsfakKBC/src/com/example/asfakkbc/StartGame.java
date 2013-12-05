package com.example.asfakkbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class StartGame extends Activity {
	
	private static final int RED = 0xffFFAA00;
	private static final int BLUE = 0xff00FFAA;
	
	private MediaPlayer mediaPlayer;
	EditText t, t1, t2, t3, t4;
	String x1;
	int a=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_game);
		mediaPlayer = MediaPlayer.create(this, R.raw.one);
		mediaPlayer.start();
		mediaPlayer.setLooping(false);
		
		t = (EditText) findViewById(R.id.editText1);
		t1 = (EditText) findViewById(R.id.editText2);
		t2 = (EditText) findViewById(R.id.editText3);
		t3 = (EditText) findViewById(R.id.editText4);
		t4 = (EditText) findViewById(R.id.editText5);
	 	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_game, menu);
		return true;
	}
	
    public void aClick(View view){
    	if(a==0){
    	((EditText) t1).setBackgroundColor(0xFF00FF7F);
    	
    	}
    	else{
    		mediaPlayer.stop();
    		((EditText) t1).setBackgroundColor(0xFFFF0000);
    	((EditText) t2).setBackgroundColor(0xFF00FF7F);
    	
    	Intent intent = new Intent(this, Price1.class);
		startActivity(intent);
    	}
    }
    
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	public void bClick(View view){
    	if(a==1){
    		
    		ValueAnimator colorAnim = ObjectAnimator.ofInt(t2, "backgroundColor", RED, BLUE);
            colorAnim.setDuration(200);
            colorAnim.setEvaluator(new ArgbEvaluator());
            colorAnim.setRepeatCount(ValueAnimator.INFINITE);
            colorAnim.setRepeatMode(ValueAnimator.REVERSE);
            colorAnim.start();
            
            
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i=new Intent(StartGame.this,Level1.class);
                    startActivity(i);
                }
            }, 2000);
            
    	//((EditText) t2).setBackgroundColor(0xFF00FF7F);
		 mediaPlayer.stop();

    	//Intent intent = new Intent(this, Level1.class);
		//startActivity(intent);
    	}
    	else
    		((EditText) t2).setBackgroundColor(0xFFFF0000);
    }
    
    public void cClick(View view){
    	if(a==0)
    	((EditText) t3).setBackgroundColor(0xFF00FF7F);
    	else{
    		mediaPlayer.stop();
    		((EditText) t3).setBackgroundColor(0xFFFF0000);
    	((EditText) t2).setBackgroundColor(0xFF00FF7F);
    	Intent intent = new Intent(this, Price1.class);
		startActivity(intent);
    	}
    	
    }
    public void dClick(View view){
    	if(a==0)
    	((EditText) t4).setBackgroundColor(0xFF00FF7F);
    	else{
    		mediaPlayer.stop();
    		((EditText) t4).setBackgroundColor(0xFFFF0000);
    	((EditText) t2).setBackgroundColor(0xFF00FF7F);
    	Intent intent = new Intent(this, Price1.class);
		startActivity(intent);
    	}
    }
}
