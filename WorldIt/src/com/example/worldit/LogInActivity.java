package com.example.worldit;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;

public class LogInActivity extends Activity {
	EditText et1;
	EditText et2;
	TextView tv1;
	TextView tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView)findViewById(R.id.textView5);
		tv1.setVisibility(100);
		tv2 = (TextView) findViewById(R.id.TextView01);
		tv2.setVisibility(100);
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);

		Button btn1 = (Button) findViewById(R.id.Button01);
		btn1.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				
					Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
					startActivity(i);
			}
		});
	
		
		Button btn2 = (Button) findViewById(R.id.button10);
		btn2.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				boolean validEmail = false;
				if(et1.getText().toString().matches("[a-zA-Z0-9_.-]+@+[a-z]+\\.+[a-z]+") || et1.getText().toString().matches("[a-zA-Z0-9_.-]+@+[a-z]+\\.+[a-z]+\\.+[a-z]+")){
					validEmail = true;
				}
				if(et1.length() != 0 && et2.length() != 0 && validEmail == true){
					Intent i = new Intent(getApplicationContext(), SearchActivity.class);
					startActivity(i);	
				}else if((et1.length() != 0 && et2.length() != 0) && validEmail == false){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Email is invalid");
					d.show();
				}else if((et1.length() != 0 && et2.length() == 0) && validEmail == true){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Content Missing");
					d.show();
					tv2.setVisibility(0);
				}else if((et1.length() == 0 && et2.length() != 0) && validEmail == true){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Content Missing");
					d.show();
					tv1.setVisibility(0);
				}else if((et1.length() == 0 && et2.length() == 0) && validEmail == false){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Content Missing");
					d.show();
					tv1.setVisibility(0);
					tv2.setVisibility(0);
				}else if((et1.length() == 0 && et2.length() != 0) && validEmail == false){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Content Missing");
					d.show();
					tv1.setVisibility(0);
				}else if((et1.length() != 0 && et2.length() == 0) && validEmail == false){
					Dialog d = new Dialog(LogInActivity.this);
					d.setTitle("Content Missing");
					d.show();
					tv2.setVisibility(0);
				}
				
			}
		});
	}

}
