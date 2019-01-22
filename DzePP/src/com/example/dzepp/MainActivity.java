package com.example.dzepp;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost(); 
 
		Intent intentRedcross = new Intent().setClass(this, RedcrossActivity.class);
		TabSpec tabSpecRedcross = tabHost
		  .newTabSpec("Redcross")
		  .setIndicator("", ressources.getDrawable(R.drawable.icon_redcross_config))
		  .setContent(intentRedcross);
 
		Intent intentCall = new Intent().setClass(this, CallActivity.class);
		TabSpec tabSpecCall = tabHost
		  .newTabSpec("Call")
		  .setIndicator("", ressources.getDrawable(R.drawable.icon_call_config))
		  .setContent(intentCall);
 
		Intent intentAmbulance = new Intent().setClass(this, AmbulanceActivity.class);
		TabSpec tabSpecAmbulance = tabHost
		  .newTabSpec("Bolnice")
		  .setIndicator("", ressources.getDrawable(R.drawable.icon_ambulance_config))
		  .setContent(intentAmbulance);
 
		Intent intentInfo = new Intent().setClass(this, InfoActivity.class);
		TabSpec tabSpecInfo = tabHost
		  .newTabSpec("info")
		  .setIndicator("", ressources.getDrawable(R.drawable.icon_info_config))
		  .setContent(intentInfo);
 
		// add all tabs 
		tabHost.addTab(tabSpecRedcross);
		tabHost.addTab(tabSpecCall);
		tabHost.addTab(tabSpecAmbulance);
		tabHost.addTab(tabSpecInfo);
 
		tabHost.setCurrentTab(1);
	}
	
	public void onBackPressed() {
        super.onBackPressed();
        this.finish();
}
 
}