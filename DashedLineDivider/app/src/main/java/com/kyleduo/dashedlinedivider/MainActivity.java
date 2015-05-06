package com.kyleduo.dashedlinedivider;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		int id = item.getItemId();
		switch (id) {
			case R.id.action_github:
				intent.setData(Uri.parse("https://github.com/kyleduo/DashedLineDivider"));
				startActivity(intent);
				return true;
			case R.id.action_blog:
				intent.setData(Uri.parse("http://www.kyleduo.com"));
				startActivity(intent);
				return true;
			default:
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}
