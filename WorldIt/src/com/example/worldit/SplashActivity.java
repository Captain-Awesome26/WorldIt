package com.example.worldit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashActivity extends Activity {
	
	private static String TAG = SplashActivity.class.getName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		setContentView(R.layout.activity_splash);
		
		IntentLauncher launcher = new IntentLauncher();
		launcher.start();
	}

	private class IntentLauncher extends Thread{
		@Override
		public void run(){
			try{
				Thread.sleep(1500);
			}catch(Exception e){
				Log.e(TAG, e.getMessage());
			}
			
			Intent intent = new Intent(SplashActivity.this, LogInActivity.class);
			SplashActivity.this.startActivity(intent);
			SplashActivity.this.finish();
		}
	}

}
