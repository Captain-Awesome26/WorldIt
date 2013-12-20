package com.example.worldit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SearchActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener(){
	    
			@Override
			public void onClick(View v){
				Intent i = new Intent(getApplicationContext(), SettingsMenu.class);
				startActivity(i);
			}
		});
	
	
	Button btn2 = (Button) findViewById(R.id.button3);
	btn2.setOnClickListener(new OnClickListener(){
	
		public void onClick(View v){	
			Intent i = new Intent(getApplicationContext(), ResultsActivity.class);
			startActivity(i);
		}
	});

	}
}
