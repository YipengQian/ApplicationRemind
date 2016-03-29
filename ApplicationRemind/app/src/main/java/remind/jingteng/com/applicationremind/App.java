package remind.jingteng.com.applicationremind;

import android.app.Application;


/**
 * Created by Abraham on 2016/1/11.
 */
public class App extends Application {
    private static App mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
    }


    public static App getInstance(){
        return mInstance;
    }

}