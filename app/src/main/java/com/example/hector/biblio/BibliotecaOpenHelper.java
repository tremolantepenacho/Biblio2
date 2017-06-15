package com.example.hector.biblio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hector on 14/06/17.
 */

public class BibliotecaOpenHelper extends SQLiteOpenHelper {

    private static final String sql = "create table usuario " +
            "(_id integer PRIMARY KEY AUTOINCREMENT, " +
            "nombre text not null, " +
            "password text not null," +
            "genero char(1) not null);";


    public BibliotecaOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS usuario");
        db.execSQL(sql);
    }
}



