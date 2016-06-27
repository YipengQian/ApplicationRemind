package remind.jingteng.com.applicationremind.ui.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnBackPressListener;
import com.orhanobut.dialogplus.OnCancelListener;
import com.orhanobut.dialogplus.OnDismissListener;

import java.util.Calendar;

import butterknife.Bind;
import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;
import remind.jingteng.com.applicationremind.ui.base.BaseActivity;
import remind.jingteng.com.applicationremind.ui.view.GestureBackLinearLayout;
import remind.jingteng.com.applicationremind.utils.BlurBuilder;
import remind.jingteng.com.applicationremind.utils.DialogUtils;

/**
 * Created by qianyipeng on 2016/3/7.
 */
public class ListActivity extends BaseActivity  {

    @Override
    protected int getLayoutId() {
        return 0;
    }
}
