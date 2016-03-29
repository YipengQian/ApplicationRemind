package remind.jingteng.com.applicationremind.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import remind.jingteng.com.applicationremind.bean.ClockInfo;

/**
 * Created by qianyipeng on 2016/3/15.
 */
public class ClockDataHelper {
    private DBHelper mDBHelper ;


    public ClockDataHelper(DBHelper mDBHelper) {
        this.mDBHelper = mDBHelper;
    }

    public boolean insert(ClockInfo clockInfo){
        SQLiteDatabase writableDatabase = mDBHelper.getWritableDatabase();
        String sql = "insert into "+mDBHelper.TABLE_NAME
                +" (name,content,date) values ("
                + "'"+clockInfo.getName()
                + "' ," + "'"+ clockInfo.getContent()+ "',"
                +"'"+clockInfo.getDate()+"'"+ ")";
        try {
            writableDatabase.execSQL(sql);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            writableDatabase.close();
        }
    }

    public void update(ClockInfo clockInfo,int id){
        SQLiteDatabase writableDatabase = mDBHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("name",clockInfo.getName());
            values.put("content", clockInfo.getContent());
            values.put("date", clockInfo.getDate());
            int rows = writableDatabase.update(mDBHelper.TABLE_NAME, values, "_id=?", new String[] { id + "" });
            writableDatabase.close();
    }

    public void delete(int id){
        SQLiteDatabase writableDatabase = mDBHelper.getWritableDatabase();
        int rows = writableDatabase.delete(mDBHelper.TABLE_NAME, "_id=?", new String[]{id + ""});
        writableDatabase.close();
    }

    public List<ClockInfo> qureyAll(){
        ArrayList<ClockInfo> clockInfos = new ArrayList<>();
        SQLiteDatabase readableDatabase = mDBHelper.getReadableDatabase();
        Cursor query = readableDatabase.query(mDBHelper.TABLE_NAME, null, null, null, null, null, null);
        while(query.moveToNext()){
            ClockInfo clockInfo = new ClockInfo();
            clockInfo.setId(query.getInt(query.getColumnIndex("_id")));
            clockInfo.setName(query.getString(query.getColumnIndex("name")));
            clockInfo.setContent(query.getString(query.getColumnIndex("content")));
            clockInfo.setDate(query.getDouble(query.getColumnIndex("date")));
            clockInfos.add(clockInfo);
        }
        readableDatabase.close();
        return  clockInfos;
    }
}
