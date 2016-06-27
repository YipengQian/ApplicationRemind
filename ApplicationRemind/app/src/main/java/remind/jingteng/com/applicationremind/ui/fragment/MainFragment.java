package remind.jingteng.com.applicationremind.ui.fragment;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;

import butterknife.Bind;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.adapter.MainViewPagerAdapter;
import remind.jingteng.com.applicationremind.ui.activity.EditingAlarmClockActivity;
import remind.jingteng.com.applicationremind.ui.base.BaseFragment;
import remind.jingteng.com.applicationremind.utils.BlurBuilder;

/**
 * Created by qianyipeng on 2016/3/2.
 */
public class MainFragment  extends BaseFragment implements View.OnClickListener {
    @Bind(R.id.tl_title)
    TabLayout tl_title;
    @Bind(R.id.vp_content)
    ViewPager vp_content;
    @Bind(R.id.fab_speech)
    FloatingActionButton fab_speech;

    private ArrayList<Fragment> fragments;
    private ArrayList<String> Titles;
    private FragmentManager supportFragmentManager;

    @Override
    protected View innerCreaetView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,null);
    }

    @Override
    protected void afterInflater(View view) {
        super.afterInflater(view);
        supportFragmentManager = getActivity().getSupportFragmentManager();
        fragments  = new ArrayList<>();
        Titles  = new ArrayList<>();

        fragments.add(new TabFragment1());
        fragments.add(new TabFragment2());
        fragments.add(new TabFragment3());

        Titles.add("每日闹钟");
        Titles.add("定期提醒");
        Titles.add("每日福利");
        initView();
        initEvent();
    }

    private void initView() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(supportFragmentManager, fragments, Titles);
        vp_content.setAdapter(mainViewPagerAdapter);
        tl_title.setupWithViewPager(vp_content);
    }

    private void initEvent() {
        fab_speech.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        BlurBuilder.snapShotWithoutStatusBar(getActivity());
        startActivity(new Intent(App.getInstance(), EditingAlarmClockActivity.class));
                 getActivity().overridePendingTransition(
                         android.R.anim.fade_in,
                         R.anim.activity_exit_anim);
    }
}
