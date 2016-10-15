package org.example.androidsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
	
	public void implicitViewURL(View v) {
		String webPage = "http://www.facebook.com";
		Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(webPage));
		startActivity(intent);
		}
	
	public void implicitSendText(View v) {
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_SEND);
		intent.putExtra(Intent.EXTRA_TEXT,"Hello from Bapu");
		intent.setType("text/plain");
		startActivity(intent);
	}
	
}
