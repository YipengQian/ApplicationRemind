package remind.jingteng.com.applicationremind.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.utils.ScreenUtils;

/**
 * Created by qianyipeng on 2016/3/30.
 */
public class GestureBackLinearLayout extends LinearLayout{
    public GestureBackLinearLayout(Context context) {
        super(context);
        init();
    }

    public GestureBackLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private long downTime;
    private float x;
    private float y;
    private void init() {
        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action){
                    case MotionEvent.ACTION_DOWN:
                        downTime = System.currentTimeMillis();
                         x = event.getX();
                         y = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        float upX = event.getX();
                        float upY = event.getY();
                        float absx = upX - x;
                        float absy = Math.abs(upY - y);
                        long upTime = System.currentTimeMillis();
                        long time = upTime - downTime;
                        if(absx> ScreenUtils.dp2px(App.getInstance(),100)&&time<=500&&absy<=ScreenUtils.dp2px(App.getInstance(),40)){
                            mGestureBackListener.setBack();
                        }
                }
                return true;
            }
        });
    }
    private GestureBackListener mGestureBackListener;
    public  interface  GestureBackListener{
        void setBack();
    }
    public void setGestureBackListener(GestureBackListener mGestureBackListener){
        this.mGestureBackListener = mGestureBackListener;
    }
}
