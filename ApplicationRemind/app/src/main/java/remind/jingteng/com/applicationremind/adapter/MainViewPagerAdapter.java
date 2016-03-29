package remind.jingteng.com.applicationremind.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by qianyipeng on 2016/3/3.
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;                         //fragment列表
    private List<String> Titles;
    public MainViewPagerAdapter(FragmentManager fm,List<Fragment> fragments,List<String> Titles) {
        super(fm);
        this.fragments = fragments;
        this.Titles = Titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return Titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles.get(position%Titles.size());
    }
}
