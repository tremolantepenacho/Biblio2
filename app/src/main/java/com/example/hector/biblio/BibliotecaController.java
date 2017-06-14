package com.example.hector.biblio;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by hector on 14/06/17.
 */

public class BibliotecaController {

    private Activity main;
    private BibliotecaOpenHelper dbh;

    BibliotecaController (Activity main){
        this.main=main;
        dbh = new BibliotecaOpenHelper(main, "dbBiblioteca", null, 1);

    }
    public int autentificaUsuario(String nombre,String password){

        SQLiteDatabase db=dbh.getReadableDatabase();
        String[] campos=new String[] {"_id"};
        String[] args=new String[] {nombre,password};
        Cursor res=db.query("usuario",campos,"nombre=? AND password=?",args,null,null,null);
        if (res==null || res.getCount()==0) {
            return 0;
        }
        else {
            return res.getInt(0);
        }
    }
}
