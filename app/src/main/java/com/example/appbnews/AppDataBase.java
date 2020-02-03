package com.example.appbnews;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Equipo.class}, version = 2)
public abstract class AppDataBase  extends RoomDatabase {

    public abstract AppDAO dao();
    private static AppDataBase INSTANCE;

    public static AppDataBase getInstance(final Context context){
        if (INSTANCE == null){
            synchronized (AppDataBase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context,AppDataBase.class,"app-db")
                            .fallbackToDestructiveMigration()
                            .addCallback(new Callback() {
                                @Override
                                public void onCreate(@NonNull SupportSQLiteDatabase db) {
                                    super.onCreate(db);
                                    insertarDatosIniciales();
                                }
                            })
                            .build();
                }
            }
        }
        return INSTANCE;
    }
    private static void insertarDatosIniciales(){
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                INSTANCE.dao().insertarEquipo(new Equipo("Cleveland Cavaliers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Phoenix Suns"));
                INSTANCE.dao().insertarEquipo(new Equipo("New York Knicks"));
                INSTANCE.dao().insertarEquipo(new Equipo("Milwaukee Bucks"));
                INSTANCE.dao().insertarEquipo(new Equipo("Toronto Raptors"));
                INSTANCE.dao().insertarEquipo(new Equipo("Boston Celctics"));
                INSTANCE.dao().insertarEquipo(new Equipo("Miami Heat"));
                INSTANCE.dao().insertarEquipo(new Equipo("Indiana Pacers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Philadelphia 76ers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Brooklyn Nets"));
                INSTANCE.dao().insertarEquipo(new Equipo("Orlando Magic"));
                INSTANCE.dao().insertarEquipo(new Equipo("Dallas Mavericks"));
                INSTANCE.dao().insertarEquipo(new Equipo("Los Angeles Clippers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Denver Nuggets"));
                INSTANCE.dao().insertarEquipo(new Equipo("Sacramento Kings"));
                INSTANCE.dao().insertarEquipo(new Equipo("Minnesota Timberwolves"));
                INSTANCE.dao().insertarEquipo(new Equipo("Utah Jazz"));
                INSTANCE.dao().insertarEquipo(new Equipo("Portland Trail Blazers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Los Angeles Lakers"));
                INSTANCE.dao().insertarEquipo(new Equipo("Houston Rockets"));
                INSTANCE.dao().insertarEquipo(new Equipo("Oklahoma City Thunder"));
                INSTANCE.dao().insertarEquipo(new Equipo("San Antonio Spurs"));
                INSTANCE.dao().insertarEquipo(new Equipo("New Orleans Pelicans"));
                INSTANCE.dao().insertarEquipo(new Equipo("Golden State Warriors"));
                INSTANCE.dao().insertarEquipo(new Equipo("Chicago Bulls"));
                INSTANCE.dao().insertarEquipo(new Equipo("Washington Wizards"));
                INSTANCE.dao().insertarEquipo(new Equipo("Detroit Pistons"));
                INSTANCE.dao().insertarEquipo(new Equipo("Charlotte Hornets"));
                INSTANCE.dao().insertarEquipo(new Equipo("Atlanta Hawks"));






            }
        });
    }
}
