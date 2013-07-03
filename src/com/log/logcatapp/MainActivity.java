package com.log.logcatapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		logging();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	 public void logging() {
	    	String tag = "logTag";
			for (int i = 0; i < 10; i++) {
				Log.v(tag, "Verbose");
				Log.d(tag, "Debug");
				Log.i(tag, "Info");
				Log.w(tag, "Warning");
				Log.e(tag, "Error");
			}
		}

	
}
