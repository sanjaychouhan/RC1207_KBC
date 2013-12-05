package com.example.asfakkbc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Level13 extends Activity {

	private MediaPlayer mediaPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level13);
		
		mediaPlayer = MediaPlayer.create(this, R.raw.rightlast);
		mediaPlayer.start();
		mediaPlayer.setLooping(false);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level13, menu);
		return true;
	}
	
	public void goNxt(View view){
		
		 mediaPlayer.stop();
		Intent intent = new Intent(this, Qno13.class);
		startActivity(intent);
	}

}