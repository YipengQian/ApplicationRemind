package remind.jingteng.com.applicationremind.ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import butterknife.Bind;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.adapter.NavigationAdatper;
import remind.jingteng.com.applicationremind.ui.base.BaseActivity;
import remind.jingteng.com.applicationremind.ui.fragment.MainFragment;

/**
 * Created by qianyipeng on 2016/3/3.
 */
public class MainActivity extends BaseActivity implements NavigationAdatper.NavigationItemListener {

    @Bind(R.id.fl_content)
    FrameLayout fl_cotent;
    @Bind(R.id.dl_drawer)
    DrawerLayout dl_drawer;
    @Bind(R.id.left_drawer)
    RecyclerView  left_drawer;

    private NavigationAdatper navigationAdatper;
    private MainFragment mainFragment;
    private FragmentManager manager;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainFragment = new MainFragment();
        manager = getSupportFragmentManager();
        initView();
        initEvent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                break;
            case R.id.action_history:
                break;
            case R.id.action_settings:
               RemindPreferenceActivity.launch(MainActivity.this);
                break;
            case R.id.action_author:
                break;
            case R.id.action_about:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        mToolbar.setTitle("提醒助手");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mToolbar.setElevation(0f);
        }
        actionBarDrawerToggle  = new ActionBarDrawerToggle(MainActivity.this, dl_drawer, mToolbar, R.string.app_name, R.string.app_name);
        actionBarDrawerToggle.syncState();
        dl_drawer.setDrawerListener(actionBarDrawerToggle);

        LinearLayoutManager layoutmanager = new LinearLayoutManager(App.getInstance());
        left_drawer.setLayoutManager(layoutmanager);
        navigationAdatper = new NavigationAdatper();
        left_drawer.setAdapter(navigationAdatper);
        manager.beginTransaction().replace(R.id.fl_content, mainFragment).commit();
    }

    private void initEvent() {
        navigationAdatper.setOnNavigationItemClick(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initToolbar(Toolbar toolbar) {
        if (toolbar == null)
            return;
        Drawable c = toolbar.getBackground();
        c.setAlpha(255);
        toolbar.setBackgroundDrawable(c);
        toolbar.collapseActionView();
        toolbar.setBackgroundColor(getResources().getColor(R.color.main_color));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    //左侧导航栏三个功能按钮
    @Override
    public void setMainOnClick() {
        mToolbar.setTitle("提醒助手");
        dl_drawer.closeDrawer(Gravity.LEFT);
        if(mainFragment==null){
             mainFragment = new MainFragment();
        }
        if(navigationAdatper.getStatus()==navigationAdatper.STATUS_MAIN){
            manager.beginTransaction().replace(R.id.fl_content, mainFragment).commit();
        }
    }

    @Override
    public void setCalendarOnClick() {
        dl_drawer.closeDrawer(Gravity.LEFT);
        Intent intent = new Intent();
        intent.setComponent((new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity")));
        startActivity(intent);
    }

    @Override
    public void setTrashOnClick() {
        dl_drawer.closeDrawer(Gravity.LEFT);
        mToolbar.setTitle("回收站");
        if(navigationAdatper.getStatus()==navigationAdatper.STATUS_TRASH){
            manager.beginTransaction().remove(mainFragment).commit();
        }
    }
}
