package com.example.niman;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.niman.Tables.Student;
import com.example.niman.Tables.Tourtable;

@Database(entities = {Tourtable.class,Student.class,Factor.class}, version =1,exportSchema = false)
public abstract class DataBase  extends RoomDatabase {
    static  String namedab="databasecontact";
    static  DataBase instance;
    public static  synchronized  DataBase getInstances(Context context){
        if (instance==null)
        {
            instance= Room.databaseBuilder(context.getApplicationContext(),
                            DataBase.class,
                            namedab)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return  instance;
    };


    public abstract StudentDao StudentDaoA();
    public abstract TourDao TourDaoA();
    public abstract FactorDao FactorDaoA();


}
