package com.cursojava;

import com.cursojava.todolist.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
//import com.cursojava.todolist.R;

public class todolistActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //setContentView(R.)
       /* datasource = new TareaDataSource(this);
        datasource.open();
        List<Tarea> values = datasource.getAllTareas();
        ArrayAdapter<Tarea> adapter = new ArrayAdapter<Tarea>(this, android.R.layout.simple_list_item_1,values);
        setListAdapter(adapter);*/
    }
    
    public void AddTarea(View view){
    //	@SuppressWarnings("unchecked")
	/*	ArrayAdapter<Tarea> adapter =  (ArrayAdapter<Tarea>) getListAdapter();
    	Tarea tarea = null;
    	Bundle bundle = getIntent().getExtras();
    	switch(view.getId()){
    	case R.id.btnAdd:
    		    String strTitulo = bundle.getString("txtTitulo");
    		    String strDescripcion = bundle.getString("txtDescripcion");
    		    String strFechaInicio = bundle.getString("dpFechaInicio");
    		    String strFechaFin = bundle.getString("dpFechaFin");
    		    String strEstado = "1";
    			tarea = datasource.createTarea(strTitulo, strDescripcion, strFechaInicio, strFechaFin,strEstado);
    			adapter.add(tarea);
    			break;
    	}*/
    }
}