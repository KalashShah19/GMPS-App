package com.example.greenplantationmanagementsystem;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.*;
import android.content.Context;
import android.support.annotation.Nullable;

public class ConnectionHelper extends SQLiteOpenHelper {

    public ConnectionHelper(Context context) {
        super(context, "gpms", null, 1);
    }

    @Override
     public void onCreate(SQLiteDatabase sqLiteDatabase) {

     }

     @Override
     public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

     }
 }
