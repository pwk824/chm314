package com.pwk.app.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pwk82_000 on 2016-01-11.
 */
public class CustomGridAdapter extends BaseAdapter {
    Drawable[] imgs;
    String[] title;
    Context mContext;

    //생성자 : (class가 안 붙음)객체가 초기화 될 때 호출되는 것
    public CustomGridAdapter(Context context, Drawable[] Imgs, String[] Title){
        imgs = Imgs;
        title = Title;
        mContext = context;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        ImageView mImg;
        TextView mTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder Holder;
        LayoutInflater LI = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            //Inflate VIew -- bbsrow.xml을 view 객체로 만든다?
            convertView = LI.inflate(R.layout.griditem, null);
            Holder = new ViewHolder();
            Holder.mTitle = (TextView)convertView.findViewById(R.id.title);
            Holder.mImg = (ImageView)convertView.findViewById(R.id.imageview);
        }else{
            //Nothing
            Holder = (ViewHolder) convertView.getTag();
        }

        Holder.mTitle.setText(title[position]); //TODO - ERR!
        Holder.mImg.setImageDrawable(imgs[position]);  //TODO - ERR!
        Log.d("TAG", "Returning View...");
        return convertView;
    }
}

