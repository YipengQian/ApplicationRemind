package remind.jingteng.com.applicationremind.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import remind.jingteng.com.applicationremind.App;
import remind.jingteng.com.applicationremind.R;

/**
 * Created by qianyipeng on 2016/3/7.
 */
public class NavigationAdatper extends RecyclerView.Adapter<NavigationAdatper.MyViewHolder>{

    public static final int STATUS_MAIN=0x78;
    public static final int STATUS_CALENDAR=0x79;
    public static final int STATUS_TRASH=0x80;

    private  int status=STATUS_MAIN;

    private String[] nav={"我的提醒","日历详情","回收站"};

    @Override
    public NavigationAdatper.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = (LayoutInflater) App.getInstance().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = mInflater.inflate(R.layout.adapter_item_navigation, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final NavigationAdatper.MyViewHolder holder, int position) {

        if(status ==STATUS_MAIN){
            if(position == 0){
                holder.tv_navigation.setSelected(true);
            }else {
                holder.tv_navigation.setSelected(false);
            }
        }else if(status == STATUS_CALENDAR){
//            if(position == 1){
//                holder.tv_navigation.setSelected(true);
//            }else {
//                holder.tv_navigation.setSelected(false);
//            }
        }else {
            if(position == 2){
                holder.tv_navigation.setSelected(true);
            }else {
                holder.tv_navigation.setSelected(false);
            }
        }


        holder.tv_navigation.setText(nav[position]);
        switch (position){
            case 0:
                holder.tv_navigation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        status = STATUS_MAIN;
                        setRefresh();
                        mNavigationItemListener.setMainOnClick();
                    }
                });
                break;
            case 1:
                holder.tv_navigation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        status = STATUS_CALENDAR;
                        setRefresh();
                        mNavigationItemListener.setCalendarOnClick();
                    }
                });
                break;
            case 2:
                holder.tv_navigation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        status = STATUS_TRASH;
                        setRefresh();
                        mNavigationItemListener.setTrashOnClick();
                    }
                });
                break;
        }

    }

    @Override
    public int getItemCount() {
        return nav.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_navigation;
        public MyViewHolder(View itemView) {
            super(itemView);
             tv_navigation = (TextView) itemView.findViewById(R.id.tv_navigation);
        }
    }

    public interface NavigationItemListener{
        void setMainOnClick();
        void setCalendarOnClick();
        void setTrashOnClick();
    }

    private NavigationItemListener mNavigationItemListener;

    public void setOnNavigationItemClick(NavigationItemListener mNavigationItemListener){
        this.mNavigationItemListener = mNavigationItemListener;
    }

    public void setRefresh(){
        this.notifyDataSetChanged();
    }

    public int getStatus(){
        return status;
    }

}
