package com.example.dzepp;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class InfoAdapter extends BaseAdapter {
	ArrayList<String> infoLista = new ArrayList<String>();
	
	public InfoAdapter() {
		infoLista.add("Informacije o crvenom križu");
		infoLista.add("Savjeti");
		infoLista.add("Procedure pri prirodnim nepogodama");
		infoLista.add("About");
	}
	
	@Override
	public int getCount() {
		return infoLista.size();
	}

	@Override
	public Object getItem(int index) {
		return getItem(index);
	}

	@Override
	public long getItemId(int index) {
		return index;
	}

	@Override
	public View getView(int index, View view, ViewGroup parent) {
		if(view==null){
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			view= inflater.inflate(R.layout.info_item, parent, false);
		}
		String info = infoLista.get(index);
		TextView nameTextView = (TextView) view.findViewById(R.id.nameInfo);
		nameTextView.setText(info);
		
		return view;
	}

}
