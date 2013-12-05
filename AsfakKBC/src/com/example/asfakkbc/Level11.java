package com.example.asfakkbc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Level11 extends Activity {

	private MediaPlayer me;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level11);
		
		me = MediaPlayer.create(this, R.raw.righttwo);
		me.start();
		me.setLooping(false);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level11, menu);
		return true;
	}
	
	public void goNxt(View view){
		
		 me.stop();
		Intent intent = new Intent(this, Qno12.class);
		startActivity(intent);
	}

}
