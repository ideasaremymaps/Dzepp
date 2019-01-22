package com.example.dzepp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemLongClickListener;
 
public class AmbulanceActivity extends Activity {
	BolniceAdapter bolniceAdapter;
	final Context context = this;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
        
        ListView listView = (ListView) findViewById(R.id.bolnice);
        bolniceAdapter = new BolniceAdapter();
        listView.setAdapter(bolniceAdapter);
        
        listView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				AlertDialog.Builder bolniceDialog = new AlertDialog.Builder(context);	
				bolniceDialog.setTitle("Izbornik bolnice");
				final ArrayAdapter<String> bolniceAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				bolniceAdapter.add("Pronaði na karti");
				bolniceAdapter.add("Nazovi bolnicu");
				bolniceAdapter.add("Dodaj u favorite");
				bolniceDialog.setAdapter(bolniceAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				bolniceDialog.show();
				
                return true;
			}
        	
		});
        	
    }
}