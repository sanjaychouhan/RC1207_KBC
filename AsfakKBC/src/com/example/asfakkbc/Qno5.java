package com.example.asfakkbc;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Qno5 extends Activity {

	private static final int RED = 0xffFFAA00;
	private static final int BLUE = 0xff00FFAA;
	private MediaPlayer mediaPlayer;
	EditText t, t1, t2, t3, t4;
	String x1;
	int a=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qno5);
		mediaPlayer = MediaPlayer.create(this, R.raw.five);
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
		getMenuInflater().inflate(R.menu.qno5, menu);
		return true;
	}

	
	 public void aClick(View view){
	    	if(a==0)
	    	((EditText) t1).setBackgroundColor(0xFF00FF7F);
	    	else{
	    		 mediaPlayer.stop();
	    		((EditText) t1).setBackgroundColor(0xFFFF0000);
	    		
	    		((EditText) t3).setBackgroundColor(0xFF00FF7F);
	        	Intent intent = new Intent(this, Price4.class);
	    		startActivity(intent);
	    	}
	    }
	    
	    public void bClick(View view){
	    	if(a==0)
		    	((EditText) t2).setBackgroundColor(0xFF00FF7F);
		    	else{
		    		 mediaPlayer.stop();
		    		((EditText) t2).setBackgroundColor(0xFFFF0000);
		    	
		    		((EditText) t3).setBackgroundColor(0xFF00FF7F);
		        	Intent intent = new Intent(this, Price4.class);
		    		startActivity(intent);
		    	}
	    }
	    
	    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
		@SuppressLint("NewApi")
		public void cClick(View view){
	    	if(a==1){
	    		ValueAnimator colorAnim = ObjectAnimator.ofInt(t3, "backgroundColor", RED, BLUE);
	            colorAnim.setDuration(200);
	            colorAnim.setEvaluator(new ArgbEvaluator());
	            colorAnim.setRepeatCount(ValueAnimator.INFINITE);
	            colorAnim.setRepeatMode(ValueAnimator.REVERSE);
	            colorAnim.start();
	            
	            
	            new Handler().postDelayed(new Runnable() {
	                @Override
	                public void run() {

	                    Intent i=new Intent(Qno5.this,Level5.class);
	                    startActivity(i);
	                }
	            }, 2000);
	            
	    	//((EditText) t2).setBackgroundColor(0xFF00FF7F);
			 mediaPlayer.stop();
	    	}
		    	else
		    		((EditText) t3).setBackgroundColor(0xFFFF0000);
	    	
	    }
	    public void dClick(View view){
	    	if(a==0)
	    	((EditText) t4).setBackgroundColor(0xFF00FF7F);
	    	else{
	    		 mediaPlayer.stop();
	    		((EditText) t4).setBackgroundColor(0xFFFF0000);
	    		
	    		((EditText) t3).setBackgroundColor(0xFF00FF7F);
	        	Intent intent = new Intent(this, Price4.class);
	    		startActivity(intent);
	    	}
	    }
	
}
