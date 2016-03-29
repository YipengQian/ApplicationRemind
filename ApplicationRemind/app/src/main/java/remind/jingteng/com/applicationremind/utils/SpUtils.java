package remind.jingteng.com.applicationremind.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 作者： 钱以鹏
 *
 * @Description: 首选项工具类
 * @date 2015/7/15
 */
public final class SpUtils {
	private final static String name = "ncofig";
	private final static int mode = Context.MODE_PRIVATE;
	private SpUtils() {
	}

	//存储
	public static void putBoolean(Context context,String key,boolean value){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		SharedPreferences.Editor editor = sp.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}

	public static void putInt(Context context,String key,int value){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		SharedPreferences.Editor editor = sp.edit();
		editor.putInt(key, value);
		editor.commit();
	}
	public static void putString(Context context,String key,String value){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		SharedPreferences.Editor editor = sp.edit();
		editor.putString(key, value);
		editor.commit();
	}

	//获取
	public static boolean getBoolean(Context context,String key,Boolean defValue){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		boolean value = sp.getBoolean(key, defValue);
		return value;
	}
	public static int getInt(Context context,String key,int defValue){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		int value = sp.getInt(key, defValue);
		return value;
	}

	public static String getString(Context context,String key,String defValue){
		SharedPreferences sp = context.getSharedPreferences(name, mode);
		String value = sp.getString(key, defValue);
		return value;
	}

}

