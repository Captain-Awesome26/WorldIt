package com.example.worldit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings_menu);
	
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				
					Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
					startActivity(i);
			}
		});
		
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				
					Intent i = new Intent(getApplicationContext(), ColourSettingsActivity.class);
					startActivity(i);
			}
		});
		
		Button btn3 = (Button) findViewById(R.id.button3);
		btn3.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				
					Intent i = new Intent(getApplicationContext(), SearchActivity.class);
					startActivity(i);
			}
		});
	}
}
