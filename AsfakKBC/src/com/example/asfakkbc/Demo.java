package com.example.asfakkbc;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class Demo extends Activity {

	EditText tag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
		tag = (EditText) findViewById(R.id.editText1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demo, menu);
		return true;
	}

    public void goNext(View view){
		
		//Intent intent = new Intent(this, MainActivity.class);
		//startActivity(intent);
		
    	((EditText) tag).setBackgroundColor(0xFF0000FF); 
	}
	
	
}
