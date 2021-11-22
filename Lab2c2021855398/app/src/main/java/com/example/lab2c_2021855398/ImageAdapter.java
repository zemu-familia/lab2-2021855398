package com.example.lab2c_2021855398;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    //Add all our images to arrayList
    public Integer[] thumbImages = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9
    };

    public ImageAdapter(Context c){ mContext = c; }

    public int getCount(){ return thumbImages.length; }

    public Object getItem(int position) { return null; }

    public long getItemId(int position){ return 0; }

    //create new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource((thumbImages[position]));
        return imageView;
    }
}

