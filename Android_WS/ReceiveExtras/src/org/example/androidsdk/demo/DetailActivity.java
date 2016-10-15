package org.example.androidsdk.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

	String flowerName ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		Intent intent = getIntent();
		flowerName = intent.getStringExtra("flowerName");
		int imageReosurce = intent.getIntExtra("imageResource", 0);
		String instruction = intent.getStringExtra("instructions");
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText(flowerName);
		
		tv = (TextView) findViewById(R.id.textView2);
		tv.setText(instruction);
		
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		iv.setImageResource(imageReosurce);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		MenuItem item = menu.add(R.string.external_url);
//		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//			
//			@Override
//			public boolean onMenuItemClick(MenuItem item) {
//				String webpage = "http://developer.android.com/index.html";
//				
//				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
//				startActivity(intent);
//				return false;
//			}
//		});
		getMenuInflater().inflate(R.menu.detail, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	public void addToCart(MenuItem item){
		Intent intent = new Intent();
		intent.putExtra("flowerName", flowerName);
		intent.putExtra("action","add");
		
		setResult(RESULT_OK, intent);
		finish();
	}
}
