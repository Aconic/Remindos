package develop.aconic.com.remindos.database;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DBUpdateManager {

    SQLiteDatabase database;

    public DBUpdateManager(SQLiteDatabase database) {
        this.database = database;
    }

    public void update(String column, long key, String value) {
        ContentValues cv = new ContentValues();
        cv.put(column, value);
    }
}
