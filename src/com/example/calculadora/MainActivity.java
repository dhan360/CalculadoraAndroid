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
import android.widget.Toast;



public class MainActivity extends Activity  {

	private String operacion;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView resultado = (TextView)findViewById(R.id.etRes);
        resultado.setText("");
        TextView linea = (TextView)findViewById(R.id.etOp);
        linea.setText("");
        this.operacion="";
     
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
        Button borrar = (Button)findViewById(R.id.btnBorrar);
        
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
				if(operacion == ""){
					operacionInicial("+");
				}
				else{
					operacionSiguiente("+");
				}
				
			}
		});
		
		resta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(operacion == ""){
					operacionInicial("-");
				}
				else{
					operacionSiguiente("-");
				}
				
			}
		});
		
		multiplicar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(operacion == ""){
					operacionInicial("x");
				}
				else{
					operacionSiguiente("x");
				}
				
			}
		});
		
		dividir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(operacion == ""){
					operacionInicial("/");
				}
				else{
					operacionSiguiente("/");
				}
				
			}
		});
		
		igual.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				igualFinal();
			}
		});
		
		borrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				borrarTodo();
			}
		});
		
        
        
    }
    
    public void presionarNumero(int numero){
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	TextView nuevaOperacion = (TextView)findViewById(R.id.etOp);
    	nuevaOperacion.setText(oper.getText().toString() + Integer.toString(numero));
    }
    
    public void operacionInicial(String operacion){
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	if (oper.getText().toString().equals("")){
    		Toast.makeText(this, "Debes ingresar un numero para realizar la operación", Toast.LENGTH_LONG).show();
    	}
    	else{
	    	this.operacion = operacion;
	    	TextView resultado = (TextView)findViewById(R.id.etRes);
	    	resultado.setText(oper.getText().toString());
	    	TextView nuevoOper = (TextView)findViewById(R.id.etOp);
	    	nuevoOper.setText("");
    	}
    	
    }
    
    public void operacionSiguiente(String op){
    	
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	if (oper.getText().toString().equals("")){
    		Toast.makeText(this, "Debes ingresar un numero para realizar la operación", Toast.LENGTH_LONG).show();
    	}
    	else{
	    	EditText oper2 = (EditText)findViewById(R.id.etRes);
	    	int res = 0;
	    	if (this.operacion == "+"){
	    		res = Integer.parseInt(oper2.getText().toString()) + Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "-"){
	    		res = Integer.parseInt(oper2.getText().toString()) - Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "x"){
	    		res = Integer.parseInt(oper2.getText().toString()) * Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "/"){
	    		res = Integer.parseInt(oper2.getText().toString()) / Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	TextView resultado = (TextView)findViewById(R.id.etRes);
	    	resultado.setText(Integer.toString(res));
	    	this.operacion = op;
	    	TextView nuevoOper = (TextView)findViewById(R.id.etOp);
	    	nuevoOper.setText("");
    	}
    	
    }
    
    public void igualFinal(){
    	EditText oper = (EditText)findViewById(R.id.etOp);
    	if (oper.getText().toString().equals("")){
    		Toast.makeText(this, "Debes ingresar un numero para realizar la operación", Toast.LENGTH_LONG).show();
    	}
    	else{
	    	EditText oper2 = (EditText)findViewById(R.id.etRes);
	    	int res = 0;
	    	if (this.operacion == "+"){
	    		res = Integer.parseInt(oper2.getText().toString()) + Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "-"){
	    		res = Integer.parseInt(oper2.getText().toString()) - Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "x"){
	    		res = Integer.parseInt(oper2.getText().toString()) * Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else if (this.operacion == "/"){
	    		res = Integer.parseInt(oper2.getText().toString()) / Integer.parseInt(oper.getText().toString()) ;
	    	}
	    	else{
	    		res = Integer.parseInt(oper.getText().toString());
	    	}
	    	TextView resultado = (TextView)findViewById(R.id.etRes);
	    	resultado.setText(Integer.toString(res));
	    	this.operacion = "";
	    	TextView nuevoOper = (TextView)findViewById(R.id.etOp);
	    	nuevoOper.setText("");
    	}
    }
    
    public void borrarTodo(){
    	TextView nuevoOper = (TextView)findViewById(R.id.etOp);
    	TextView resultado = (TextView)findViewById(R.id.etRes);
    	this.operacion="";
    	nuevoOper.setText("");
    	resultado.setText("");
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
