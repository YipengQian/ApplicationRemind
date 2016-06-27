package remind.jingteng.com.applicationremind.utils;

import android.app.Activity;
import android.content.Context;

public class ScreenUtils {

	public static int dp2px(Context context, float dp) {
		if (context == null) {
			return -1;
		}
		return (int) (dp * context.getResources().getDisplayMetrics().density + 0.5f);
	}

	public static float px2dp(Context context, float px) {
		if (context == null) {
			return -1;
		}
		return px / context.getResources().getDisplayMetrics().density;
	}

	public static float dpToPxInt(Context context, float dp) {
		return dp2px(context, dp) + 0.5f;
	}

	public static float pxToDpCeilInt(Context context, float px) {
		return px2dp(context, px) + 0.5f;
	}

	/**
	 * 
	 * @Title getScreentWidth
	 * @Description TODO(获取屏幕宽度，单位像素)
	 * @param context
	 * @return int
	 */
	public static int getScreentWidth(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}

	/**
	 *
	 * @Title getScreentHeight
	 * @Description TODO(获取屏幕高度，单位像素)
	 * @param context
	 * @return int
	 */
	public static int getScreentHeight(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}

}