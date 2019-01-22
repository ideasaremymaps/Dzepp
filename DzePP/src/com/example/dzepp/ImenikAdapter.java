package com.example.dzepp;

import java.util.ArrayList;
import com.example.dzepp.Imenik;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ImenikAdapter extends BaseAdapter {

	ArrayList<Imenik> contacts = new ArrayList<Imenik>();
	
	public ImenikAdapter () {
		contacts.add(new Imenik("Hitna pomoæ", "112"));
		contacts.add(new Imenik("Policija", "192"));
		contacts.add(new Imenik("Vatrogasci", "193"));
		contacts.add(new Imenik("Vanja", "0917359373"));
		contacts.add(new Imenik("Crowley", "666"));
	}
	
	@Override
	public int getCount() {
		return contacts.size();
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
			view= inflater.inflate(R.layout.imenik_item, parent, false);
		}
		
		Imenik imenik = contacts.get(index);
		TextView nameTextView = (TextView) view.findViewById(R.id.name);
		nameTextView.setText(imenik.getName());
		
		TextView numberTextView = (TextView) view.findViewById(R.id.number);
		numberTextView.setText(imenik.getNumber());
		
		return view;
	}
}
