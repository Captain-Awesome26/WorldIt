package com.example.worldit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterActivity extends Activity {
	ImageView iv;
	EditText et1;
	EditText et2;
	EditText et3;
	EditText et4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText3);
		et3 = (EditText) findViewById(R.id.editText2);
		et4 = (EditText) findViewById(R.id.editText4);
		iv =(ImageView) findViewById(R.id.imageView1);
		Button btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener(){
		
			
				@Override
				public void onClick(View v){
					boolean validEmail = false;
					if(et2.getText().toString().matches("[a-zA-Z0-9_.-]+@+[a-z]+\\.+[a-z]")){
						validEmail = true;
					}
					if(validEmail == true && et3.length() != 0){
						Intent i = new Intent(getApplicationContext(), SearchActivity.class);
						startActivity(i);
					}
				}
		});
		
		
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new OnClickListener(){
		
			@Override
			public void onClick(View v){
				Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, 0);
			}
			
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if(requestCode == 0){
			Bitmap theImage = (Bitmap) data.getExtras().get("data");
			iv.setImageBitmap(theImage);
		}
	}	
}


