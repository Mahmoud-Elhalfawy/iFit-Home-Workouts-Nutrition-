package com.example.i_fit.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.i_fit.Model.ListItem;
import com.example.i_fit.Util.Util;

import java.util.HashMap;


public class DataHandler extends SQLiteOpenHelper {
    private Util util;
    public DataHandler(@Nullable Context context, Util util) {
        super(context, util.DATABASE_NAME, null, util.DATABASE_VERSION);

        this.util=util;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //SQL ---- structured query language
        String createSongTable="CREATE TABLE "+util.TABLE_NAME+"("
                +util.KEY_ID+"INTEGER PRIMARY KEY," + util.KEY_NAME +" TEXT,"
                +util.KEY_ARTIST+" TEXT,"+util.KEY_URI+" TEXT"+")";

        db.execSQL(createSongTable);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+util.TABLE_NAME);
        onCreate(db);
    }


public void addSong(ListItem listItem){
        SQLiteDatabase db=this.getWritableDatabase();
    ContentValues values=new ContentValues();
    values.put(util.KEY_NAME,listItem.getName());
    values.put(util.KEY_ARTIST,listItem.getArtist());
    values.put(util.KEY_URI,listItem.getUrl());
    db.insert(util.TABLE_NAME,null,values);
    db.close();

}


public HashMap<String,ListItem> getAllSongs(){
        SQLiteDatabase db=this.getReadableDatabase();
       HashMap<String,ListItem> list=new HashMap<>();
       String selectAll="SELECT * FROM "+util.getTableName();
       Cursor cursor=db.rawQuery(selectAll,null);
       if(cursor.moveToFirst()){
           do{
                ListItem listItem=new ListItem();
                listItem.setId(cursor.getInt(0));
               listItem.setName(cursor.getString(1));
               listItem.setArtist(cursor.getString(2));
               listItem.setUrl(cursor.getString(3));
               list.put(listItem.getName(),listItem);
           }while(cursor.moveToNext());
       }
       return list;
}



public int updateSong(ListItem listItem){
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues values=new ContentValues();
    values.put(util.KEY_NAME,listItem.getName());
    values.put(util.KEY_ARTIST,listItem.getArtist());
    values.put(util.KEY_URI,listItem.getUrl());


    return db.update(util.getTableName(),values,util.KEY_URI+"=?",new String[]{listItem.getUrl()});
}


public void deleteSong(ListItem listItem){
    SQLiteDatabase db=this.getWritableDatabase();
    db.delete(util.getTableName(),util.KEY_NAME+" = ?",new String[]{listItem.getName()});
    db.close();



}
}
