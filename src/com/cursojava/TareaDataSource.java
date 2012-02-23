package com.cursojava;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class TareaDataSource {
	
	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;
	private String[] allColumns = {
			DatabaseHelper.COLUMN_ID, DatabaseHelper.COLUMN_TITULO,
			DatabaseHelper.COLUMN_DESCRIPCION,DatabaseHelper.COLUMN_FECHAINICIO,
			DatabaseHelper.COLUMN_ESTADO, DatabaseHelper.COLUMN_FECHAFIN
	};
	
	public TareaDataSource(Context context){
		dbHelper = new DatabaseHelper(context);
	}
	
	public void open() throws SQLException{
		database = dbHelper.getWritableDatabase();
	}
	
	public void close(){
		dbHelper.close();
	}

	public Tarea createTarea(String titulo, String descripcion, String fechainicio, String fechafin, String estado){
		ContentValues values = new ContentValues();
		values.put(DatabaseHelper.COLUMN_TITULO,titulo);
		values.put(DatabaseHelper.COLUMN_DESCRIPCION, descripcion);
		values.put(DatabaseHelper.COLUMN_FECHAINICIO,fechainicio );
		values.put(DatabaseHelper.COLUMN_FECHAFIN,fechafin);
		values.put(DatabaseHelper.COLUMN_ESTADO_, estado);
		long insertID = database.insert(DatabaseHelper.TABLE_NAME, null, values);
		Cursor cursor = database.query(DatabaseHelper.TABLE_NAME,allColumns,DatabaseHelper.COLUMN_ID + " = " + insertID , null, null, null,null);
		cursor.moveFirst();
		return cursorToTarea(cursor);
		
	}
}
