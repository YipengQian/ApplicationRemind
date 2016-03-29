package remind.jingteng.com.applicationremind.ui.base;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import butterknife.ButterKnife;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;

/**
 * @author qianyipeng on 2016/1/27.
 * @Description:
 * Initialize activity
 */
public abstract class BaseActivity extends AppCompatActivity {


    public Toolbar mToolbar;



    private volatile boolean isDestroyed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWindow();
        setContentView(getLayoutId());
        initToolbar(findToolbar());
        ButterKnife.bind(this);
        XPRuntime.getInstance().setCurrentActivity(this);
    }

    public void initToolbar(Toolbar toolbar) {
        if (toolbar == null)
            return;
        Drawable c = toolbar.getBackground();
        c.setAlpha(255);
        toolbar.setBackgroundDrawable(c);
        toolbar.collapseActionView();
        toolbar.setBackgroundColor(getResources().getColor(R.color.main_color));
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }


    //处理返回键
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private Toolbar findToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        return  mToolbar;
    }


//    protected int getColor(int res) {
//        if (res <= 0)
//            throw new IllegalArgumentException("resource id can not be less 0");
//        return getResources().getColor(res);
//    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart" + this.getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume" + this.getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause" + this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop" + this.getClass().getSimpleName());
    }
    //初始化窗口
    public void initWindow() {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
 //           getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintColor(getResources().getColor(R.color.main_color));
            tintManager.setStatusBarTintEnabled(true);

        }
    }
    //设置布局内容
    protected abstract int getLayoutId();

    //获取aplication上下文
    protected App getApp() {
        return App.getInstance();
    }
    //登录校验，需要登录时调用
    public void toLoginActivity() {
        //TODO
    }
    //获取本类对象
    protected BaseActivity getActivity() {
        return this;
    }

    /**
     * 延迟结束activity
     * @param leaymillis
     */
    public void finishDelayed(long leaymillis) {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                BaseActivity.this.finish();
            }
        }, leaymillis);
    }


//    /**
//     *
//     * @param containerId
//     * @param paramClass
//     * @param paramBundle
//     * @param <T>
//     * @return
//     */
//    public <T extends Fragment> T innerShowFragment(int containerId,Class<T> paramClass,
//                                                    Bundle paramBundle) {
//        Fragment localFragment = null;
//        FragmentTransaction localFragmentTransaction = null;
//        try {
//            localFragment = getFragmentManager().findFragmentByTag(
//                    paramClass.getSimpleName());
//            if (localFragment != null) {
//                return (T)localFragment;
//            }
//            localFragment = (Fragment) paramClass.newInstance();
//            if (paramBundle == null)
//                paramBundle = new Bundle();
//            paramBundle.putInt("component_hash", getActivity()
//                    .hashCode());
//            localFragment.setArguments(paramBundle);
//            localFragmentTransaction = getFragmentManager()
//                    .beginTransaction();
//            if ((localFragment instanceof DialogFragment)) {
//                localFragmentTransaction.add(localFragment,
//                        paramClass.getSimpleName());
//            } else {
//                localFragmentTransaction.replace(Window.ID_ANDROID_CONTENT, localFragment,
//                        paramClass.getSimpleName());
//            }
//            localFragmentTransaction.commitAllowingStateLoss();
//            getActivity().getFragmentManager()
//                    .executePendingTransactions();
//        } catch (Exception localException) {
//            localException.printStackTrace();
//            localFragment = null;
//        }
//        return (T) localFragment;
//    }
//
//    public <T extends Fragment> void innerDismissFragment(Class<T> paramClass) {
//        if (!isActivityDestroyed()){
//            try {
//                Fragment localFragment = getFragmentManager()
//                        .findFragmentByTag(paramClass.getSimpleName());
//                if (localFragment != null) {
//                    if ((localFragment instanceof DialogFragment))
//                        ((DialogFragment) localFragment).dismiss();
//                    FragmentTransaction localFragmentTransaction = getFragmentManager()
//                            .beginTransaction();
//                    localFragmentTransaction.remove(localFragment);
//                    localFragmentTransaction.commit();
//                }
//            } catch (Throwable localThrowable) {
//                localThrowable.printStackTrace();
//            }
//        }
//    }
//
//    public boolean isActivityDestroyed() {
//        return isDestroyed;
//    }
//
//    @Override
//    protected void onDestroy() {
//        Log.d("TAG", "onDestroy" + this.getClass().getSimpleName());
//        this.isDestroyed = true;
//        super.onDestroy();
//    }


    /**
     * 以Toast形式显示一个消息
     *
     * @param msg
     */
    public void showMsg(CharSequence msg) {
        Toast.makeText(App.getInstance(), msg, Toast.LENGTH_SHORT).show();
    }




}
