package remind.jingteng.com.applicationremind.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by storm on 14-4-8.
 */
public class DBHelper extends SQLiteOpenHelper {
    // 数据库名
    public static final String DB_NAME = "clock.db";
    //表名
    public static final String TABLE_NAME = "clocklist";
    // 数据库版本
    private static final int VERSION = 3;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table usertable(_id integer primary key autoincrement,sname text,snumber text);
        String sql = "CREATE TABLE "+TABLE_NAME+" (_id integer primary key autoincrement,name TEXT,content TEXT,date double)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql ="ALTER TABLE clocklist ADD COLUMN date double";
        db.execSQL(sql);
    }
}
