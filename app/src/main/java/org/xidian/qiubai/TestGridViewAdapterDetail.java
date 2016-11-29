package org.xidian.qiubai;


import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import net.tsz.afinal.FinalBitmap;

import java.util.ArrayList;

public class TestGridViewAdapterDetail extends BaseAdapter {

    public Bitmap bitmaps[];
    Activity context;
    ArrayList<String> list;
    private FinalBitmap finalImageLoader;
    private int wh;

    public TestGridViewAdapterDetail(Activity context, ArrayList<String> data) {
        this.context = context;
        this.wh = (SysUtils.getScreenWidth(context) - SysUtils.Dp2Px(context, 99)) / 3;
        this.list = data;
//        this.finalImageLoader = FinalBitmap.create(context);
//        this.finalImageLoader.configLoadingImage(R.drawable.ic_head);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int arg0) {
        return list.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }


    @Override
    public View getView(final int position, View view, ViewGroup arg2) {
        Holder holder;
        if (view == null || ((Holder) view.getTag()).id != position) {
            view = LayoutInflater.from(context).inflate(R.layout.item_gridview, null);
            holder = new Holder();
            holder.imageView = (ImageView) view.findViewById(R.id.imageView);
            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }
//        finalImageLoader.display(holder.imageView, list.get(position));
//        Glide.with(context).load(list.get(position)).into(holder.imageView);
        LoadImageUtil.loadImage(list.get(position), holder.imageView);
        AbsListView.LayoutParams param = new AbsListView.LayoutParams(wh, wh);
        view.setLayoutParams(param);
        return view;
    }

    class Holder {
        int id;
        ImageView imageView;
    }


}

