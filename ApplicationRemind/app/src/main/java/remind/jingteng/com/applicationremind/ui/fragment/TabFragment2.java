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
public class TabFragment2 extends BaseFragment {

    @Override
    protected View innerCreaetView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab2,null);
    }

    @Override
    protected void afterInflater(View view) {
        super.afterInflater(view);
        initView(view);
        initEvent();
    }

    private void initView(View view) {
    }

    private void initEvent() {

    }
}
