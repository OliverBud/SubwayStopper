package com.subwaystopper.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import android.content.ContentValues;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;

public class Stops {
	
		public static final String TABLE_STOPS = "stops_table";
		  public static final String COLUMN_ID = "_id";
		  public static final String COLUMN_STOP_ID = "stop_id";
		  public static final String COLUMN_STOP_NAME = "stop_name";
		  public static final String COLUMN_STOP_HEADING = "stop_heading";
		  public static final String COLUMN_STOP_HEADING_NAME = "stop_heading_name";


		  private static final String DATABASE_CREATE = "create table " 
			      + TABLE_STOPS
			      + "(" 
			      + COLUMN_ID + " integer primary key autoincrement, " 
			      + COLUMN_STOP_ID + " text not null," 
			      + COLUMN_STOP_HEADING + " text not null," 
			      + COLUMN_STOP_HEADING_NAME + " text not null," 
			      + COLUMN_STOP_NAME + " text not null" + ");";
		  
		  public static void onCreate(SQLiteDatabase database) {
			    
			  database.execSQL(DATABASE_CREATE);
			  fill_table(database);
		  }
		  
		  private static void fill_table(SQLiteDatabase database){
			  ContentValues stops1 = new ContentValues();
			  stops1.put(COLUMN_STOP_ID, "L01N");
			  stops1.put(COLUMN_STOP_NAME, "8 Av");
			  stops1.put(COLUMN_STOP_HEADING, "N");
			  stops1.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops1);
			  
			  ContentValues stops2 = new ContentValues();
			  stops2.put(COLUMN_STOP_ID, "L01S");
			  stops2.put(COLUMN_STOP_NAME, "8 Av");
			  stops2.put(COLUMN_STOP_HEADING, "S");
			  stops2.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops2);
			  
			  ContentValues stops3 = new ContentValues();
			  stops3.put(COLUMN_STOP_ID, "L02N");
			  stops3.put(COLUMN_STOP_NAME, "6 Av");
			  stops3.put(COLUMN_STOP_HEADING, "N");
			  stops3.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops3);
			  
			  ContentValues stops4 = new ContentValues();
			  stops4.put(COLUMN_STOP_ID, "L02S");
			  stops4.put(COLUMN_STOP_NAME, "6 Av");
			  stops4.put(COLUMN_STOP_HEADING, "S");
			  stops4.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops4);
			  
			  ContentValues stops5 = new ContentValues();
			  stops5.put(COLUMN_STOP_ID, "L03N");
			  stops5.put(COLUMN_STOP_NAME, "Union Sq - 14 St");
			  stops5.put(COLUMN_STOP_HEADING, "N");
			  stops5.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops5);
			  
			  ContentValues stops6 = new ContentValues();
			  stops6.put(COLUMN_STOP_ID, "L03S");
			  stops6.put(COLUMN_STOP_NAME, "Union Sq - 14 St");
			  stops6.put(COLUMN_STOP_HEADING, "S");
			  stops6.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops6);
			  
			  ContentValues stops7 = new ContentValues();
			  stops7.put(COLUMN_STOP_ID, "L05N");
			  stops7.put(COLUMN_STOP_NAME, "3 Av");
			  stops7.put(COLUMN_STOP_HEADING, "N");
			  stops7.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops7);
			  
			  ContentValues stops8 = new ContentValues();
			  stops8.put(COLUMN_STOP_ID, "L05S");
			  stops8.put(COLUMN_STOP_NAME, "3 Av");
			  stops8.put(COLUMN_STOP_HEADING, "S");
			  stops8.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops8);
			  
			  ContentValues stops9 = new ContentValues();
			  stops9.put(COLUMN_STOP_ID, "L06N");
			  stops9.put(COLUMN_STOP_NAME, "1 Av");
			  stops9.put(COLUMN_STOP_HEADING, "N");
			  stops9.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops9);
			  
			  ContentValues stops10 = new ContentValues();
			  stops10.put(COLUMN_STOP_ID, "L06S");
			  stops10.put(COLUMN_STOP_NAME, "1 Av");
			  stops10.put(COLUMN_STOP_HEADING, "S");
			  stops10.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops10);
			  
			  ContentValues stops11 = new ContentValues();
			  stops11.put(COLUMN_STOP_ID, "L08N");
			  stops11.put(COLUMN_STOP_NAME, "Bedford Av");
			  stops11.put(COLUMN_STOP_HEADING, "N");
			  stops11.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops11);
			  
			  ContentValues stops12 = new ContentValues();
			  stops12.put(COLUMN_STOP_ID, "L08S");
			  stops12.put(COLUMN_STOP_NAME, "Bedford Av");
			  stops12.put(COLUMN_STOP_HEADING, "S");
			  stops12.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops12);
			  
			  ContentValues stops13 = new ContentValues();
			  stops13.put(COLUMN_STOP_ID, "L10N");
			  stops13.put(COLUMN_STOP_NAME, "Lorimer St");
			  stops13.put(COLUMN_STOP_HEADING, "N");
			  stops13.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops13);
			  
			  ContentValues stops14 = new ContentValues();
			  stops14.put(COLUMN_STOP_ID, "L10S");
			  stops14.put(COLUMN_STOP_NAME, "Lorimer St");
			  stops14.put(COLUMN_STOP_HEADING, "S");
			  stops14.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops14);
			  
			  ContentValues stops15 = new ContentValues();
			  stops15.put(COLUMN_STOP_ID, "L11N");
			  stops15.put(COLUMN_STOP_NAME, "Graham Av");
			  stops15.put(COLUMN_STOP_HEADING, "N");
			  stops15.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops15);
			  
			  ContentValues stops16 = new ContentValues();
			  stops16.put(COLUMN_STOP_ID, "L11S");
			  stops16.put(COLUMN_STOP_NAME, "Graham Av");
			  stops16.put(COLUMN_STOP_HEADING, "S");
			  stops16.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops16);
			  
			  ContentValues stops17 = new ContentValues();
			  stops17.put(COLUMN_STOP_ID, "L12N");
			  stops17.put(COLUMN_STOP_NAME, "Grand St");
			  stops17.put(COLUMN_STOP_HEADING, "N");
			  stops17.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops17);
			  
			  ContentValues stops18 = new ContentValues();
			  stops18.put(COLUMN_STOP_ID, "L12S");
			  stops18.put(COLUMN_STOP_NAME, "Grand St");
			  stops18.put(COLUMN_STOP_HEADING, "S");
			  stops18.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops18);
			  
			  ContentValues stops19 = new ContentValues();
			  stops19.put(COLUMN_STOP_ID, "L13N");
			  stops19.put(COLUMN_STOP_NAME, "Montrose Av");
			  stops19.put(COLUMN_STOP_HEADING, "N");
			  stops19.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops19);
			  
			  ContentValues stops20 = new ContentValues();
			  stops20.put(COLUMN_STOP_ID, "L13S");
			  stops20.put(COLUMN_STOP_NAME, "Montrose Av");
			  stops20.put(COLUMN_STOP_HEADING, "S");
			  stops20.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops20);
			  
			  ContentValues stops21 = new ContentValues();
			  stops21.put(COLUMN_STOP_ID, "L14N");
			  stops21.put(COLUMN_STOP_NAME, "Morgan Av");
			  stops21.put(COLUMN_STOP_HEADING, "N");
			  stops21.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops21);
			  
			  ContentValues stops22 = new ContentValues();
			  stops22.put(COLUMN_STOP_ID, "L14S");
			  stops22.put(COLUMN_STOP_NAME, "Morgan Av");
			  stops22.put(COLUMN_STOP_HEADING, "S");
			  stops22.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops22);
			  
			  ContentValues stops23 = new ContentValues();
			  stops23.put(COLUMN_STOP_ID, "L15N");
			  stops23.put(COLUMN_STOP_NAME, "Jefferson St");
			  stops23.put(COLUMN_STOP_HEADING, "N");
			  stops23.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops23);
			  
			  ContentValues stops24 = new ContentValues();
			  stops24.put(COLUMN_STOP_ID, "L15S");
			  stops24.put(COLUMN_STOP_NAME, "Jefferson St");
			  stops24.put(COLUMN_STOP_HEADING, "S");
			  stops24.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops24);
			  
			  ContentValues stops25 = new ContentValues();
			  stops25.put(COLUMN_STOP_ID, "L16N");
			  stops25.put(COLUMN_STOP_NAME, "DeKalb Av");
			  stops25.put(COLUMN_STOP_HEADING, "N");
			  stops25.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops25);
			  
			  ContentValues stops26 = new ContentValues();
			  stops26.put(COLUMN_STOP_ID, "L16S");
			  stops26.put(COLUMN_STOP_NAME, "DeKalb Av");
			  stops26.put(COLUMN_STOP_HEADING, "S");
			  stops26.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops26);
			  
			  ContentValues stops27 = new ContentValues();
			  stops27.put(COLUMN_STOP_ID, "L17N");
			  stops27.put(COLUMN_STOP_NAME, "Myrtle - Wyckoff Avs");
			  stops27.put(COLUMN_STOP_HEADING, "N");
			  stops27.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops27);
			  
			  ContentValues stops28 = new ContentValues();
			  stops28.put(COLUMN_STOP_ID, "L17S");
			  stops28.put(COLUMN_STOP_NAME, "Myrtle - Wyckoff Avs");
			  stops28.put(COLUMN_STOP_HEADING, "S");
			  stops28.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops28);
			  
			  ContentValues stops29 = new ContentValues();
			  stops29.put(COLUMN_STOP_ID, "L19N");
			  stops29.put(COLUMN_STOP_NAME, "Halsey St");
			  stops29.put(COLUMN_STOP_HEADING, "N");
			  stops29.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops29);
			  
			  ContentValues stops30 = new ContentValues();
			  stops30.put(COLUMN_STOP_ID, "L19S");
			  stops30.put(COLUMN_STOP_NAME, "Halsey St");
			  stops30.put(COLUMN_STOP_HEADING, "S");
			  stops30.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops30);
			  
			  ContentValues stops31 = new ContentValues();
			  stops31.put(COLUMN_STOP_ID, "L20N");
			  stops31.put(COLUMN_STOP_NAME, "Wilson Av");
			  stops31.put(COLUMN_STOP_HEADING, "N");
			  stops31.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops31);
			  
			  ContentValues stops32 = new ContentValues();
			  stops32.put(COLUMN_STOP_ID, "L20S");
			  stops32.put(COLUMN_STOP_NAME, "Wilson Av");
			  stops32.put(COLUMN_STOP_HEADING, "S");
			  stops32.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops32);
			  
			  ContentValues stops33 = new ContentValues();
			  stops33.put(COLUMN_STOP_ID, "L21N");
			  stops33.put(COLUMN_STOP_NAME, "Bushwick Av - Aberdeen St");
			  stops33.put(COLUMN_STOP_HEADING, "N");
			  stops33.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops33);
			  
			  ContentValues stops34 = new ContentValues();
			  stops34.put(COLUMN_STOP_ID, "L21S");
			  stops34.put(COLUMN_STOP_NAME, "Bushwick Av - Aberdeen St");
			  stops34.put(COLUMN_STOP_HEADING, "S");
			  stops34.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops34);
			  
			  ContentValues stops35 = new ContentValues();
			  stops35.put(COLUMN_STOP_ID, "L22N");
			  stops35.put(COLUMN_STOP_NAME, "Broadway Jct");
			  stops35.put(COLUMN_STOP_HEADING, "N");
			  stops35.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops35);
			  
			  ContentValues stops36 = new ContentValues();
			  stops36.put(COLUMN_STOP_ID, "L22S");
			  stops36.put(COLUMN_STOP_NAME, "Broadway Jct");
			  stops36.put(COLUMN_STOP_HEADING, "S");
			  stops36.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops36);
			  
			  ContentValues stops37 = new ContentValues();
			  stops37.put(COLUMN_STOP_ID, "L24N");
			  stops37.put(COLUMN_STOP_NAME, "Atlantic Av");
			  stops37.put(COLUMN_STOP_HEADING, "N");
			  stops37.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops37);
			  
			  ContentValues stops38 = new ContentValues();
			  stops38.put(COLUMN_STOP_ID, "L24S");
			  stops38.put(COLUMN_STOP_NAME, "Atlantic Av");
			  stops38.put(COLUMN_STOP_HEADING, "S");
			  stops38.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops38);
			  
			  ContentValues stops39 = new ContentValues();
			  stops39.put(COLUMN_STOP_ID, "L25N");
			  stops39.put(COLUMN_STOP_NAME, "Sutter Av");
			  stops39.put(COLUMN_STOP_HEADING, "N");
			  stops39.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops39);
			  
			  ContentValues stops40 = new ContentValues();
			  stops40.put(COLUMN_STOP_ID, "L25S");
			  stops40.put(COLUMN_STOP_NAME, "Sutter Av");
			  stops40.put(COLUMN_STOP_HEADING, "S");
			  stops40.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops40);
			  
			  ContentValues stops41 = new ContentValues();
			  stops41.put(COLUMN_STOP_ID, "L26N");
			  stops41.put(COLUMN_STOP_NAME, "Livonia Av");
			  stops41.put(COLUMN_STOP_HEADING, "N");
			  stops41.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops41);
			  
			  ContentValues stops42 = new ContentValues();
			  stops42.put(COLUMN_STOP_ID, "L26S");
			  stops42.put(COLUMN_STOP_NAME, "Livonia Av");
			  stops42.put(COLUMN_STOP_HEADING, "S");
			  stops42.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops42);
			  
			  ContentValues stops43 = new ContentValues();
			  stops43.put(COLUMN_STOP_ID, "L27N");
			  stops43.put(COLUMN_STOP_NAME, "New Lots Av");
			  stops43.put(COLUMN_STOP_HEADING, "N");
			  stops43.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops43);
			  
			  ContentValues stops44 = new ContentValues();
			  stops44.put(COLUMN_STOP_ID, "L27S");
			  stops44.put(COLUMN_STOP_NAME, "New Lots Av");
			  stops44.put(COLUMN_STOP_HEADING, "S");
			  stops44.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops44);
			  
			  ContentValues stops45 = new ContentValues();
			  stops45.put(COLUMN_STOP_ID, "L28N");
			  stops45.put(COLUMN_STOP_NAME, "E 105 St");
			  stops45.put(COLUMN_STOP_HEADING, "N");
			  stops45.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops45);
			  
			  ContentValues stops46 = new ContentValues();
			  stops46.put(COLUMN_STOP_ID, "L28S");
			  stops46.put(COLUMN_STOP_NAME, "E 105 St");
			  stops46.put(COLUMN_STOP_HEADING, "S");
			  stops46.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops46);
			  
			  ContentValues stops47 = new ContentValues();
			  stops47.put(COLUMN_STOP_ID, "L29N");
			  stops47.put(COLUMN_STOP_NAME, "Canarsie - Rockaway Pkwy");
			  stops47.put(COLUMN_STOP_HEADING, "N");
			  stops47.put(COLUMN_STOP_HEADING_NAME, "8 Av");
			  database.insert(TABLE_STOPS, null, stops47);
			  
			  ContentValues stops48 = new ContentValues();
			  stops48.put(COLUMN_STOP_ID, "L29S");
			  stops48.put(COLUMN_STOP_NAME, "Canarsie - Rockaway Pkwy");
			  stops48.put(COLUMN_STOP_HEADING, "S");
			  stops48.put(COLUMN_STOP_HEADING_NAME, "CANARSIE - ROCKAWAY PKWY");
			  database.insert(TABLE_STOPS, null, stops48);
			  

		  }
		  
		  
}
