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
import remind.jingteng.com.applicationremind.utils.DialogUtils;

/**
 * Created by qianyipeng on 2016/3/7.
 */
public class EditingAlarmClockActivity extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.ll_clock_period)
    LinearLayout ll_clock_period;
    @Bind(R.id.ll_setting)
    LinearLayout ll_setting;
    @Bind(R.id.ll_setting_voice)
    LinearLayout ll_setting_voice;
    @Bind(R.id.ll_small_sleep)
    LinearLayout ll_small_sleep;
    @Bind(R.id.ll_title)
    LinearLayout ll_title;
    @Bind(R.id.timePicker)
    TimePicker timePicker;

    // 定义5个记录当前时间的变量
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initEvent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, 0, "保存");
            menu.getItem(0).setIcon(R.drawable.ic_done_white).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
       return true;
    }

    private void initView() {
        mToolbar.setTitle("编辑闹钟");
        timePicker.setIs24HourView(true);
        initDatePicker();
    }

    private void initEvent() {
            ll_clock_period.setOnClickListener(this);
            ll_setting.setOnClickListener(this);
            ll_setting_voice.setOnClickListener(this);
            ll_small_sleep.setOnClickListener(this);
            ll_title.setOnClickListener(this);
    }

    private void initDatePicker() {

        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);


        // 为TimePicker指定监听器
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                EditingAlarmClockActivity.this.hour = hourOfDay;
                EditingAlarmClockActivity.this.minute = minute;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_title:
                setItemTitle();
                break;
            case R.id.ll_small_sleep:
                setItemSmallSleep();
                break;
            case R.id.ll_clock_period:
                setItemClockPeriod();
                break;
            case R.id.ll_setting_voice:
                setItemSettingVoice();
                break;
            case R.id.ll_setting:
                setItemSetting();
                break;
        }
    }

    private  void  setItemTitle(){
       DialogUtils.showEditTextDialog(this, "请输入闹钟标题", new DialogUtils.DialogEditTextListener() {
           @Override
           public void setPositiveButtonOnClick(String text) {
           }

           @Override
           public void setNegativeButtonOnClick() {

           }
       });
    }
    private Dialog mSmallSleepDialog;
    private  void  setItemSmallSleep(){
        final String[] array = {"每隔5分钟","每隔10分钟","每隔15分钟","每隔20分钟"};
        mSmallSleepDialog = DialogUtils.showSingleChoiceDialog(this, "小睡设置 注意只提醒6次哦！", array, new DialogUtils.DialogItemsListener() {
            @Override
            public void setItemOnClick(int which) {
                showMsg(array[which]);
                DialogUtils.dismiss(mSmallSleepDialog);
            }

            @Override
            public void setNegativeButtonOnClick() {

            }
        });
    }

    private  void  setItemClockPeriod(){
        final String[] array = {"周一","周二","周三","周四","周五","周六","周日"};
        final boolean[] isarray = {true,true,true,true,true,false,false};
        DialogUtils.showMultiChoiceDialog(this, "提示", array, isarray, new DialogUtils.DialogMultiChoiceListener() {
                    @Override
                    public void setItemOnClick(int which, boolean isChecked) {
                        showMsg(array[which]);
                    }

                    @Override
                    public void setNegativeButtonOnClick() {

                    }

                    @Override
                    public void setPositiveButtonOnClick(boolean[] isCheckedArray) {
                        if(isCheckedArray[0]) {
                            showMsg("true");
                        }
                    }


                }
        );
    }
//测试dialogPlus列子
    private  void  setItemSettingVoice(){
        TextView textView = new TextView(App.getInstance());
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(20, 20, 20, 20);
        textView.setText("测试");
        textView.setTextSize(17);
        textView.setTextColor(getResources().getColor(R.color.black));
        textView.setBackgroundColor(getResources().getColor(R.color.white));
        View contentView = getLayoutInflater().inflate(R.layout.content2, null);
        DialogPlus dialogPlus = DialogPlus.newDialog(this)
                .setGravity(Gravity.BOTTOM)
                .setHeader(textView)
                .setFooter(contentView)
                .setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{ "sdfsdf", "sdfsdf", "sdfsdf", "sdfsdf"}))
                .setCancelable(true)
                .setOnDismissListener(new OnDismissListener() {
                    @Override
                    public void onDismiss(DialogPlus dialog) {

                    }
                })
                .setOnCancelListener(new OnCancelListener() {
                    @Override
                    public void onCancel(DialogPlus dialog) {

                    }
                })
                .setOnBackPressListener(new OnBackPressListener() {
                    @Override
                    public void onBackPressed(DialogPlus dialogPlus) {

                    }
                })
                .create();

        dialogPlus.show();

    }

    private  void  setItemSetting(){

    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_edit_clock;
    }

    public static void launch(Activity activity){
        activity.startActivity(new Intent(App.getInstance(), EditingAlarmClockActivity.class));
    }

}
