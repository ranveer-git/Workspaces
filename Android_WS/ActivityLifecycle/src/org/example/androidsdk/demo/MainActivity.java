package org.example.androidsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private static final String LOGTAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d(LOGTAG, "onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void gotoActivity(View v) {
		Intent intent = new Intent(this, DetailActivity.class);
		startActivity(intent);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(LOGTAG, "onResume");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(LOGTAG, "onStart");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(LOGTAG, "onPause");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(LOGTAG, "onDestroy");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(LOGTAG, "onStop");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(LOGTAG, "onRestart");
	}

}
