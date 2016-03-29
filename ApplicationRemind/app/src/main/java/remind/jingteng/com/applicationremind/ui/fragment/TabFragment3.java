package remind.jingteng.com.applicationremind.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.ui.base.BaseFragment;

/**
 * Created by qianyipeng on 2016/3/2.
 */
public class TabFragment3 extends BaseFragment {


    @Override
    protected View innerCreaetView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab3,null);
    }

    @Override
    protected void afterInflater(View view) {
        super.afterInflater(view);
        initView();
        initEvent();
    }

    private void initView() {

    }

    private void initEvent() {

    }
}
