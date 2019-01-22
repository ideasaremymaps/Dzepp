package com.example.dzepp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;

 
public class RedcrossActivity extends Activity {
	final Context context = this;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redcross);
        TextView srcani = (TextView) findViewById(R.id.srcani);
        TextView glava = (TextView) findViewById(R.id.glava);
        TextView kosti = (TextView) findViewById(R.id.kosti);
        TextView rane = (TextView) findViewById(R.id.rane);
        TextView trovanje = (TextView) findViewById(R.id.trovanje);
        TextView toplina = (TextView) findViewById(R.id.toplina);
        TextView spasavanje = (TextView) findViewById(R.id.spasavanje);
        TextView disanje = (TextView) findViewById(R.id.disanje);
        TextView ostalo = (TextView) findViewById(R.id.ostalo);
        TextView scene = (TextView) findViewById(R.id.scene);
        
        srcani.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder srcaniDialog = new AlertDialog.Builder(context);	
				srcaniDialog.setTitle("Srèani udar i šok");
				final ArrayAdapter<String> srcaniAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				srcaniAdapter.add("Srèani udar");
				srcaniAdapter.add("Teške alergijske reakcije");
				srcaniAdapter.add("Šok");
				srcaniDialog.setAdapter(srcaniAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				srcaniDialog.show();
			}	
        });
        kosti.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder kostiDialog = new AlertDialog.Builder(context);	
				kostiDialog.setTitle("Kosti, mišiæi i zglobovi");
				final ArrayAdapter<String> kostiAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				kostiAdapter.add("Uganuæe/istegnuæe");
				kostiAdapter.add("Grè u mišiæu");
				kostiAdapter.add("Ozljeda zdjelice");
				kostiAdapter.add("Ozljede kralježnice");
				kostiAdapter.add("Lom kostiju kod djece");
				kostiAdapter.add("Modrice");
				kostiDialog.setAdapter(kostiAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				kostiDialog.show();			
			}	
        });
        glava.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder glavaDialog = new AlertDialog.Builder(context);	
				glavaDialog.setTitle("Ozljede glave i napadaji");
				final ArrayAdapter<String> glavaAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				glavaAdapter.add("Lom lubanje");
				glavaAdapter.add("Visoka temperatura");
				glavaAdapter.add("Cerebralna kompresija");
				glavaAdapter.add("Potres mozga");
				glavaAdapter.add("Napadaji");
				glavaDialog.setAdapter(glavaAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				glavaDialog.show();			
			}	
        });
        rane.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder raneDialog = new AlertDialog.Builder(context);	
				raneDialog.setTitle("Rane i krvarenja");
				final ArrayAdapter<String> raneAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				raneAdapter.add("Manje porezotine i oderotine");
				raneAdapter.add("Krvarenje iz nosa");
				raneAdapter.add("Strani objekti u oku");
				raneAdapter.add("Teže krvarenje");
				raneDialog.setAdapter(raneAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				raneDialog.show();			
			}	
        });
        trovanje.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder trovanjeDialog = new AlertDialog.Builder(context);	
				trovanjeDialog.setTitle("Trovanje");
				final ArrayAdapter<String> trovanjeAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				trovanjeAdapter.add("Progutani otrovi");
				trovanjeAdapter.add("Trovanje alkoholom");
				trovanjeAdapter.add("Trovanje lijekovima");
				trovanjeAdapter.add("Trovanje hranom");
				trovanjeAdapter.add("Otrovne biljke i gljive");
				trovanjeAdapter.add("Ugrizi");
				trovanjeAdapter.add("Ubodi");
				trovanjeDialog.setAdapter(trovanjeAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				trovanjeDialog.show();
			}	
        });
        toplina.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder toplinaDialog = new AlertDialog.Builder(context);	
				toplinaDialog.setTitle("Posljedice topline i hladnoæe");
				final ArrayAdapter<String> toplinaAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				toplinaAdapter.add("Toplinski udar");
				toplinaAdapter.add("Umor uslijed topline");
				toplinaAdapter.add("Opekline i opekotine");
				toplinaAdapter.add("Opeklina od sunca");
				toplinaAdapter.add("Osip od vruæine");
				toplinaAdapter.add("Promrzlina/ozebotina");
				toplinaAdapter.add("Pothlaðivanje");
				toplinaDialog.setAdapter(toplinaAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				toplinaDialog.show();			
			}	
        });
        spasavanje.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder spasavanjeDialog = new AlertDialog.Builder(context);	
				spasavanjeDialog.setTitle("Postupci za spašavanje života");
				final ArrayAdapter<String> spasavanjeAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				spasavanjeAdapter.add("Oživljavanje za odrasle");
				spasavanjeAdapter.add("Oživljavanje za djecu");
				spasavanjeAdapter.add("Oživljavanje za novoroðenèad");
				spasavanjeAdapter.add("Stavljanje u boèni položaj");
				spasavanjeDialog.setAdapter(spasavanjeAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				spasavanjeDialog.show();
			}	
        });
        disanje.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder disanjeDialog = new AlertDialog.Builder(context);	
				disanjeDialog.setTitle("Problemi s disanjem");
				final ArrayAdapter<String> disanjeAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				disanjeAdapter.add("Astma");
				disanjeAdapter.add("Gušenje");
				disanjeAdapter.add("Hiperventilacija");
				disanjeAdapter.add("Napad panike");
				disanjeDialog.setAdapter(disanjeAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				disanjeDialog.show();
			}	
        });
        ostalo.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder ostaloDialog = new AlertDialog.Builder(context);	
				ostaloDialog.setTitle("Ostale hitne situacije");
				final ArrayAdapter<String> ostaloAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				ostaloAdapter.add("Hipoglikemija");
				ostaloAdapter.add("Hiperglikemija");
				ostaloAdapter.add("Moždani udar");
				ostaloAdapter.add("Pad u nesvijest - odrasli");
				ostaloAdapter.add("Pad u nesvijest - djeca");
				ostaloAdapter.add("Pad u nesvijest - bebe");
				ostaloDialog.setAdapter(ostaloAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				ostaloDialog.show();
			}	
        });
        scene.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				AlertDialog.Builder sceneDialog = new AlertDialog.Builder(context);	
				sceneDialog.setTitle("Scene nesreæe");
				final ArrayAdapter<String> sceneAdapter = new ArrayAdapter<String>(
	                    context,android.R.layout.select_dialog_singlechoice);
				sceneAdapter.add("Korištenje defibrilatora");
				sceneAdapter.add("Utapanje");
				sceneAdapter.add("Strujni udar");
				sceneAdapter.add("Na sceni nesreæe");
				sceneDialog.setAdapter(sceneAdapter, new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
					}
				});
				sceneDialog.show();	
			}	
        });
        
        
}
}