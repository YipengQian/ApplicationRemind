package remind.jingteng.com.applicationremind.ui.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

import android.widget.FrameLayout;

import butterknife.Bind;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.ui.base.BaseActivity;
import remind.jingteng.com.applicationremind.ui.fragment.PreferenceFragment;

/**
 * Created by qianyipeng on 2016/3/3.
 */
public class RemindPreferenceActivity extends BaseActivity {

    @Bind(R.id.fl_preference)
    FrameLayout fl_preference;

    private FragmentManager manager;
    private PreferenceFragment preferenceFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         preferenceFragment = new PreferenceFragment();
         manager = getFragmentManager();
        initView();
        initEvent();
    }

    private void initView() {
        mToolbar.setTitle("设置");
        manager.beginTransaction().replace(R.id.fl_preference,preferenceFragment).commit();
    }

    private void initEvent() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_preference;
    }

    public static void launch(Activity activity){
        activity.startActivity(new Intent(App.getInstance(),RemindPreferenceActivity.class));
    }
}
