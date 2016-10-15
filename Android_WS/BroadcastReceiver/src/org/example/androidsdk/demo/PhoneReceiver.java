/**
 * 
 */
package org.example.androidsdk.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * @author Ranvirsinh
 *
 */
public class PhoneReceiver extends BroadcastReceiver {

	/* (non-Javadoc)
	 * @see android.content.BroadcastReceiver#onReceive(android.content.Context, android.content.Intent)
	 */
	@Override
	public void onReceive(Context context, Intent intent) {
		Bundle extras = intent.getExtras();
		if(extras != null){
			String state = extras.getString(TelephonyManager.EXTRA_STATE);
			Log.d("PhoneReceiver",state);
			
			if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
				String phNo = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
				Log.d("PhoneRecceiver", phNo);
			}
		}
	}

}
