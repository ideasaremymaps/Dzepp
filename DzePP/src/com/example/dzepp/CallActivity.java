package com.example.dzepp;

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
 
public class CallActivity extends Activity {
	ImenikAdapter imenikAdapter;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        
 
        ListView listView = (ListView) findViewById(R.id.imenik);
        imenikAdapter = new ImenikAdapter();
        listView.setAdapter(imenikAdapter);
        
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> imenikAdapter, View view,
					int index, long id) {
				TextView c= (TextView) view.findViewById(R.id.number);
				String change = c.getText().toString();
				Intent phoneCallIntent = new Intent(Intent.ACTION_CALL); 
                phoneCallIntent.setData(Uri.parse("tel:"+change)); 
                startActivity(phoneCallIntent); 
			}
        	
        });      	
        
    
    }
}