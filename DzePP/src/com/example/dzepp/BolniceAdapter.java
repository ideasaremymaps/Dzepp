package com.example.dzepp;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BolniceAdapter extends BaseAdapter {
	
	ArrayList<Bolnice> bolniceLista = new ArrayList<Bolnice>();
	
	public BolniceAdapter() {
		bolniceLista.add(new Bolnice("KBC Rebro", "Kišpatiæeva 12, 10000 Zagreb", "Broj telefona: 012367579"));
		bolniceLista.add(new Bolnice("KB Merkur", "Zajèeva 19, 10000 Zagreb", "Broj telefona: 012431390"));
		bolniceLista.add(new Bolnice("KB Dubrava", "Avenija Gojka Šuška 6, 10000 Zagreb", "Broj telefona: 012902444"));
		bolniceLista.add(new Bolnice("KBC Šalata", "Šalata 4, 10000 Zagreb", "Broj telefona: 012368987"));
	}

	@Override
	public int getCount() {
		return bolniceLista.size();
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
			view= inflater.inflate(R.layout.bolnice_item, parent, false);
		}
		
		Bolnice bolnice = bolniceLista.get(index);
		TextView nameTextView = (TextView) view.findViewById(R.id.nameHospital);
		nameTextView.setText(bolnice.getNameHospital());
		
		TextView addressTextView = (TextView) view.findViewById(R.id.addressHospital);
		addressTextView.setText(bolnice.getAddressHospital());
		
		TextView numberTextView = (TextView) view.findViewById(R.id.numberHospital);
		numberTextView.setText(bolnice.getNumberHospital());
		
		return view;
	}

}
