package chetuan.com.flipscrollviewdemo;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;

/**
 * Created by qianyipeng on 2016/3/25.
 *
 *
 *
 */
public class FlipScrollView extends ScrollView{
    private View  mInnerView;
    private Rect rect = new Rect();
    private float damp =  0.2f;
    private float y;
    float InterY;

    public FlipScrollView(Context context) {
        super(context);
    }

    public FlipScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FlipScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
            if(getChildCount()>0){
                mInnerView = getChildAt(0);
            }
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                InterY = getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float y = getY();
                float prey=InterY;
                int v = (int) Math.abs(prey - y);
                if(v==0){
                    return true;
                }
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (mInnerView == null) {
            return super.onTouchEvent(ev);
        } else {
            setFlipMotionEvent(ev);
        }
        return super.onTouchEvent(ev);
    }

    private void setFlipMotionEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                y = ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                final float preY = y;
                float nowy=ev.getY();
                int distancey = (int) ((preY - nowy)*damp);
                y=nowy;

                if(isNeedMove()){
                    if(rect.isEmpty()){
                        rect.set(mInnerView.getLeft(),mInnerView.getTop(),mInnerView.getRight(),mInnerView.getBottom());
                        return;
                    }
                    int yyT = (int) (mInnerView.getTop()-distancey);
                    int yyB = (int) (mInnerView.getBottom()-distancey);
                    mInnerView.layout(mInnerView.getLeft(),yyT,mInnerView.getRight(),yyB);
                }
                break;
            case MotionEvent.ACTION_UP:
                if(isNeedAnimation()){
                   animation();
                }
                break;
            default:
                break;
        }
    }

    private boolean isNeedMove() {
        int offset = mInnerView.getMeasuredHeight() - getHeight();
        int scrollY = getScrollY();
        if (scrollY == 0 || scrollY >= offset) {
            return true;
        }
        return false;
       }

    private void animation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, mInnerView.getTop()-rect.top,0);
        translateAnimation.setDuration(200);
        mInnerView.startAnimation(translateAnimation);
        mInnerView.layout(rect.left, rect.top,rect.right,rect.bottom);
        rect.setEmpty();
    }

    private boolean isNeedAnimation() {
        return !rect.isEmpty();
    }
}
