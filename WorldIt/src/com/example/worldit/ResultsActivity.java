package com.example.worldit;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;

public class ResultsActivity extends Activity{
	static String message = "Directions:";

	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);
		RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
		Button send = (Button) findViewById(R.id.button1);
		
		send.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				SMSSender.sendMsg(message);
			}
		});

	}
}

