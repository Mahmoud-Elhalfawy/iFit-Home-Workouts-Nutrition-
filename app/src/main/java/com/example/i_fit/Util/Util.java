package com.example.i_fit.Util;

public class Util {

    // Database Version
    public   int DATABASE_VERSION;
    public   String DATABASE_NAME;
    public   String TABLE_NAME;

    public  String KEY_ID="id";
    public  String KEY_NAME="name";
    public  String KEY_ARTIST="artist";
    public  String KEY_URI="uri";



    public Util() {
        this.DATABASE_VERSION=1;
        this.DATABASE_NAME="songsDB";
        this.TABLE_NAME="songs";
    }



    public  int getDatabaseVersion() {
        return DATABASE_VERSION;
    }

    public  void setDatabaseVersion(int databaseVersion) {
        DATABASE_VERSION = databaseVersion;
    }

    public  String getDatabaseName() {
        return DATABASE_NAME;
    }



    public  void setDatabaseName(String databaseName) {
        DATABASE_NAME = databaseName;
    }

    public  String getTableName() {
        return TABLE_NAME;
    }

    public  void setTableName(String tableName) {
        TABLE_NAME = tableName;
    }

    public  String getKeyId() {
        return KEY_ID;
    }

    public  void setKeyId(String keyId) {
        KEY_ID = keyId;
    }

    public  String getKeyName() {
        return KEY_NAME;
    }

    public  void setKeyName(String keyName) {
        KEY_NAME = keyName;
    }



}
