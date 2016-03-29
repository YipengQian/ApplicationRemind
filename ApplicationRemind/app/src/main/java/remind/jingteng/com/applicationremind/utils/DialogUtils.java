package remind.jingteng.com.applicationremind.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;

import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.ui.widget.AppCustomDialog;

/**
 * Created by qianyipeng on 2016/3/23.
 */
public class DialogUtils {
    //默认背景不变暗
    public static AppCustomDialog showProgressDialog(Activity activity,String text){
        AppCustomDialog dialog = new AppCustomDialog(activity);
        if(!dialog.isShowing()) {
            dialog.show();
            dialog.setDialogText(text);
        }
        return dialog;
    }

    public static  AppCustomDialog showProgressDialog(Activity activity,String text,int them){
        AppCustomDialog dialog = new AppCustomDialog(activity,them);
        if(!dialog.isShowing()) {
            dialog.show();
            dialog.setDialogText(text);
        }
        return dialog;
    }


    public static void dismiss(Dialog mDialog){
        if(mDialog!=null&&mDialog.isShowing()){
            mDialog.dismiss();
        }
    }

    public static Dialog showMessageDialog(Activity activity,String title,String message, final DialogListener mDialogListener){
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogListener.setPositiveButtonOnClick();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

    public static Dialog showMessageDialog(Activity activity,String title,String message, String positiveButton,String negativeButton,final DialogListener mDialogListener){
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(positiveButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogListener.setPositiveButtonOnClick();
                    }
                })
                .setNegativeButton(negativeButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

    public static Dialog showItemDialog(Activity activity,String title,String[] items,final DialogItemsListener mDialogItemsListener){
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogItemsListener.setItemOnClick(which);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogItemsListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

    public static Dialog showSingleChoiceDialog(Activity activity,String title,String[] items,final DialogItemsListener mDialogItemsListener){
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogItemsListener.setItemOnClick(which);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogItemsListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

    public static Dialog showMultiChoiceDialog(Activity activity,String title,String[] items, final boolean[] isCheckedArray, final DialogMultiChoiceListener mDialogMultiChoiceListener){
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setMultiChoiceItems(items, isCheckedArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        isCheckedArray[which]=isChecked;
                        mDialogMultiChoiceListener.setItemOnClick(which, isChecked);

                    }
                })
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogMultiChoiceListener.setPositiveButtonOnClick(isCheckedArray);
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogMultiChoiceListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

    public static Dialog showEditTextDialog(Activity activity,String title, final DialogEditTextListener mDialogEditTextListener){
        final EditText et = new EditText(activity);
        Dialog alertDialog = new AlertDialog.Builder(activity)
                .setTitle(title)
                .setView(et, ScreenUtils.dp2px(App.getInstance(),20), ScreenUtils.dp2px(App.getInstance(),15), ScreenUtils.dp2px(App.getInstance(),20), ScreenUtils.dp2px(App.getInstance(),15))
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogEditTextListener.setPositiveButtonOnClick(et.getText().toString());
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mDialogEditTextListener.setNegativeButtonOnClick();
                    }
                }).create();
        alertDialog.show();
        return  alertDialog;
    }

   public  interface DialogListener{
        void setPositiveButtonOnClick();
        void setNegativeButtonOnClick();
    }

   public  interface DialogEditTextListener{
        void setPositiveButtonOnClick(String text);
        void setNegativeButtonOnClick();
    }

   public  interface DialogItemsListener{
        void setItemOnClick(int which);
        void setNegativeButtonOnClick();
    }

   public  interface DialogMultiChoiceListener{
        void setItemOnClick(int which,boolean isChecked);
        void setNegativeButtonOnClick();
       void setPositiveButtonOnClick(boolean[] isCheckedArray);
    }




}
