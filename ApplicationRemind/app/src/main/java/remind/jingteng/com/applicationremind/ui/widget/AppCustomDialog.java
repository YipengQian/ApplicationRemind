package remind.jingteng.com.applicationremind.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import remind.jingteng.com.applicationremind.R;


/**
 * Created by qianyipeng on 2016/2/23.
 */
public class AppCustomDialog extends Dialog{

    TextView tv_dialog;

    public AppCustomDialog(Context context) {
        this(context, R.style.progress_dialog);
    }
    public AppCustomDialog(Context context, int theme) {
        super(context,theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widget_dialog_progress);
        tv_dialog = (TextView) findViewById(R.id.tv_dialog);
        this.setCanceledOnTouchOutside(false);
    }

    public void setDialogText(String text){
        tv_dialog.setText(text);
    }

}
