package com.coolweather.app.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 *  Province表建表语句
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
				+ "id integer primary key autoincrement, " 
				+ "province_name text, "
				+ "province_code text)";
	/**
	 *  City表建表语句
	 */
	public static final String CREATE_CITY = "create table City ("
				+ "id integer primary key autoincrement, " 
				+ "city_name text, " 
				+ "city_code text, " 
				+ "province_id integer)";
	/**
	 *  County表建表语句
	 */
	public static final String CREATE_COUNTY = "create table County ("
				+ "id integer primary key autoincrement, " 
				+ "county_name text, " 
				+ "county_code text, " 
				+ "city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);  // 创建Province表
		addProvince(db,"北京");
		addProvince(db,"上海");
		addProvince(db,"天津");
		addProvince(db,"重庆");
		addProvince(db,"黑龙江");
		addProvince(db,"吉林");
		addProvince(db,"辽宁");
		addProvince(db,"内蒙古");
		addProvince(db,"河北");
		addProvince(db,"山西");
		addProvince(db,"陕西");
		addProvince(db,"山东");
		addProvince(db,"新疆");
		addProvince(db,"西藏");
		addProvince(db,"青海");
		addProvince(db,"甘肃");
		addProvince(db,"宁夏");
		addProvince(db,"河南");
		addProvince(db,"江苏");
		addProvince(db,"湖北");
		addProvince(db,"浙江");
		addProvince(db,"安徽");
		addProvince(db,"福建");
		addProvince(db,"江西");
		addProvince(db,"湖南");
		addProvince(db,"贵州");
		addProvince(db,"四川");
		addProvince(db,"广东");
		addProvince(db,"云南");
		addProvince(db,"广西");
		addProvince(db,"海南");
		addProvince(db,"香港");
		addProvince(db,"澳门");
		addProvince(db,"台湾");

		db.execSQL(CREATE_CITY);  // 创建City表
		db.execSQL(CREATE_COUNTY);  // 创建County表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

	private void addProvince(SQLiteDatabase db,String provinceName){
		ContentValues contentValues = new ContentValues();
		contentValues.put("province_name",provinceName);db.insert("Province",null,contentValues);
	}

}