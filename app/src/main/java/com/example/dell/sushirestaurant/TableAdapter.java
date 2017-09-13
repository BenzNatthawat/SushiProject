package com.example.dell.sushirestaurant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class TableAdapter extends BaseAdapter {
    private Context mContext;

    public TableAdapter(Context context) {
        mContext = context;
    }

    public int getCount() {
        return 24;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, 200));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(4,4,4,4);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(R.drawable.backg2);
        return imageView;
    }

}


