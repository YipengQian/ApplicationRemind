package remind.jingteng.com.applicationremind.ui.base;

import java.lang.ref.WeakReference;

/**
 * Created by qianyipeng on 16/1/31.
 */
public class XPRuntime {

    private static XPRuntime instance;

    private WeakReference<BaseActivity> baseActivityWeakReference;

    private XPRuntime() {

    }
    public static XPRuntime getInstance() {
        if(instance == null) {
            instance = new XPRuntime();
        }
        return instance;
    }

    public void setCurrentActivity(BaseActivity currentActivity) {
        baseActivityWeakReference = new WeakReference<BaseActivity>(currentActivity);
    }

    public BaseActivity getCurrentActivity() {
        if(baseActivityWeakReference == null) {
            return null;
        }
        return baseActivityWeakReference.get();
    }

}
