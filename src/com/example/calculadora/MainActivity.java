package com.example.calculadora;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity  {

	private String operacion;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView resultado = (TextView)findViewById(R.id.etRes);
        resultado.setText("");
     
        Button nueve = (Button)findViewById(R.id.btnNueve);
        Button ocho = (Button)findViewById(R.id.btnOcho);
        Button siete = (Button)findViewById(R.id.btnSiete);
        Button seis = (Button)findViewById(R.id.btnSeis);
        Button cinco = (Button)findViewById(R.id.btnCinco);
        Button cuatro = (Button)findViewById(R.id.btnCuatro);
        Button tres = (Button)findViewById(R.id.btnTres);
        Button dos = (Button)findViewById(R.id.btnDos);
        Button uno = (Button)findViewById(R.id.btnUno);
        Button cero = (Button)findViewById(R.id.btnCero);
        Button suma = (Button)findViewById(R.id.btnSumar);
        Button resta = (Button)findViewById(R.id.btnResta);
        Button multiplicar = (Button)findViewById(R.id.btnMulti);
        Button dividir = (Button)findViewById(R.id.btnDivision);
        Button igual = (Button)findViewById(R.id.btnIgual);
        
        nueve.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(9);
				
			}
		});
        
		 ocho.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View arg0) {
				presionarNumero(8);
				
			}
		});
		 
		 siete.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View arg0) {
				presionarNumero(7);
				
			}
		});
		 
		 seis.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View arg0) {
				presionarNumero(6);
				
			}
		});
		 
		cinco.setOnClickListener(new View.OnClickListener() {
				
			@Override
			public void onClick(View arg0) {
				presionarNumero(5);
				
			}
		});
		
		cuatro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(4);
				
			}
		});
		
		tres.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(3);
				
			}
		});
		dos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(2);
				
			}
		});
		
		uno.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(1);
				
			}
		});
		
		cero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				presionarNumero(0);
				
			}
		});
		 
		suma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				OperacionInicial("+");
				
			}
		});
        
        
    }
    
    public void presionarNumero(int numero){
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	TextView nuevaOperacion = (TextView)findViewById(R.id.etOp);
    	nuevaOperacion.setText(oper.getText().toString() + Integer.toString(numero));
    }
    
    public void OperacionInicial(String operacion){
    	this.operacion = operacion;
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	TextView resultado = (TextView)findViewById(R.id.etRes);
    	resultado.setText(oper.getText().toString());
    	TextView nuevoOper = (TextView)findViewById(R.id.etOp);
    	nuevoOper.setText("");
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	
}
