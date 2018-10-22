package com.example.studybuddy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="createAssignment.db";
    public static final String TABLE_NAME="createAssignment";
    public static final String COL_1="ID";
    public static final String COL_2="name";
    public static final String COL_3="dueDate";
    public static final String COL_4="description";
    public static final String COL_5="percentageWorth";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT ,dueData TEXT ,description TEXT ,percentageWorth INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME );
        onCreate(db);
    }
}

//tutorial for creating form with database: https://www.youtube.com/watch?v=B2avB5tmTMM