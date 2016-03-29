package remind.jingteng.com.applicationremind.ui.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;



import butterknife.ButterKnife;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;


/**
 * Created by qianyipeng on 2015/8/27.
 */
public abstract class BaseFragment extends Fragment {

    protected View containerView;
    protected Toolbar toolbar;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = innerCreaetView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, view);
        this.containerView = view;
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((BaseActivity) getActivity()).initToolbar(findToolbar());
        afterInflater(view);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (toolbar != null) {
            Drawable c = toolbar.getBackground();
            c.setAlpha(255);
            toolbar.setBackgroundDrawable(c);
        }
    }

    protected abstract View innerCreaetView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    protected void afterInflater(View view) {

    }

    protected Toolbar findToolbar() {
        toolbar = (Toolbar) containerView.findViewById(R.id.toolbar);

        return toolbar;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    public BaseActivity getBaseActivity() {
        return (BaseActivity)getActivity();
    }



//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Log.e("dfsdfdsdddddddd","gggggggggggg");
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
