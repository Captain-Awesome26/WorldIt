package com.example.worldit;

import android.telephony.SmsManager;

public class SMSSender {
	static String number = "07875167919";
	
	protected static void sendMsg(String message){
		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(number, null, message, null, null);	
	}	
}
