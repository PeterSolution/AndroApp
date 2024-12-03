package com.example.kolokwiumpiotrwolff;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DbFunction {
    public void dodajpoledogra(Context ctx, String wartosc1){
        String tabelanazwa="grawygrana";
        SQLiteDatabase db=ctx.openOrCreateDatabase("dane.db",Context.MODE_PRIVATE,null);
        ContentValues values=new ContentValues();
        values.put("wygrana",wartosc1);
        db.insert(tabelanazwa,null,values);
        db.close();

    }
}
