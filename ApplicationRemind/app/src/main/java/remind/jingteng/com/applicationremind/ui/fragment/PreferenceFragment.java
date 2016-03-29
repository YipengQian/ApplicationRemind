package remind.jingteng.com.applicationremind.ui.fragment;

import android.os.Bundle;

import remind.jingteng.com.applicationremind.R;


/**
 * Created by qianyipeng on 2016/3/2.
 */
public class PreferenceFragment extends android.preference.PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
}
