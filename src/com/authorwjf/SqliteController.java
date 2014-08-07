package com.authorwjf;

import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.*;
import android.util.Log;

public class SqliteController extends SQLiteOpenHelper {
	private static final String LOGCAT = null;
	
	public SqliteController(Context applicationcontext) { 
		super(applicationcontext, "androidsqlite.db", null, 1); 
		Log.d(LOGCAT,"Created"); 
		}

	@Override
	public void onCreate(SQLiteDatabase database) {
		String query; 
		query = "CREATE TABLE ShakerData ( id INTEGER PRIMARY KEY, driverId TEXT, xaxis_gyro REAL, yaxix_gyro REAL, zaxix_gyro REAL, xaxix_gps REAL, yaxix_gps REAL ,timestamp TEXT)"; 
		database.execSQL(query); 
		Log.d(LOGCAT,"ShakerData Created");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
	}

	public void insertShakerData(HashMap<String, String> queryValues){
		SQLiteDatabase database = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("StudentName", queryValues.get("StudentName"));
		database.insert("Students", null, values);
		
	}
}
