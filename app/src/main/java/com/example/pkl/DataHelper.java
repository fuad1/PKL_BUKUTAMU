package com.example.pkl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "bukutamu.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table bukutamu(no integer primary key, tgl text null, nama text null, keterangan text null, jumlahtamu text null, namapegawai text null);";
        Log.d("Data","onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO bukutamu (no, tgl, nama, keterangan, jumlahtamu, namapegawai) VALUES ('1','1-1-2021','Muchammad Raka','ingin mengurus kegiatan A','1 orang','Pak Hasan');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2) {
        //TODO AUTO-generated method stub
    }
}
