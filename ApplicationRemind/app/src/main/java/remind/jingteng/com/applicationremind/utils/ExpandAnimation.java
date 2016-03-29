package remind.jingteng.com.applicationremind.utils;


import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;

/**
 * Created by qianyipeng on 2016/3/16.
 */
public class ExpandAnimation extends Animation {
    private View mAnimatedView;
    private LayoutParams mViewLayoutParams;
    private int mMarginStart, mMarginEnd;
    private boolean mIsVisibleAfter = false;
    private boolean mWasEndedAlready = false;

    /**
     * Initialize the animation
     *
     * @param view     The layout we want to animate
     * @param duration The duration of the animation, in ms
     */
    public ExpandAnimation(View view, int duration) {

        setDuration(duration);
        mAnimatedView = view;
        mViewLayoutParams = (LayoutParams) view.getLayoutParams();

// if the bottom margin is 0,
// then after the animation will end it'll be negative, and invisible.
        mIsVisibleAfter = (mViewLayoutParams.bottomMargin == 0);

        mMarginStart = mViewLayoutParams.bottomMargin;
        mMarginEnd = (mMarginStart == 0 ? (0 - view.getHeight()) : 0);

        view.setVisibility(View.VISIBLE);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);

        if (interpolatedTime < 1.0f) {

// Calculating the new bottom margin, and setting it
            mViewLayoutParams.bottomMargin = mMarginStart
                    + (int) ((mMarginEnd - mMarginStart) * interpolatedTime);

// Invalidating the layout, making us seeing the changes we made
            mAnimatedView.requestLayout();

// Making sure we didn't run the ending before (it happens!)
        } else if (!mWasEndedAlready) {
            mViewLayoutParams.bottomMargin = mMarginEnd;
            mAnimatedView.requestLayout();

            if (mIsVisibleAfter) {
                mAnimatedView.setVisibility(View.GONE);
            }
            mWasEndedAlready = true;
        }
    }
}