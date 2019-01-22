package com.example.dzepp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
 
public class InfoActivity extends Activity {
	InfoAdapter infoAdapter;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.activity_info);
        
        ListView listView = (ListView) findViewById(R.id.informacije);
        infoAdapter = new InfoAdapter();
        listView.setAdapter(infoAdapter);
    }
}