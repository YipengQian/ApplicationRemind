package remind.jingteng.com.applicationremind.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TimePicker;

/**
 * Created by qianyipeng on 2016/3/15.
 */
public class PickerView extends TimePicker {

    public PickerView(Context context) {
        super(context);
        init();
    }


    public PickerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PickerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
    }

}
