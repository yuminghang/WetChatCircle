package org.xidian.qiubai;


import android.app.Activity;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import net.tsz.afinal.FinalBitmap;

import java.util.ArrayList;
import java.util.List;

public class TestListViewAdapter extends BaseAdapter {
    private final List<QiuBaiBean.DataEntity> data;
    private LayoutInflater mInflater;
    private Activity context;
    private FinalBitmap finalImageLoader;
    private TestGridViewAdapter nearByInfoImgsAdapter;
    private int wh;

    public TestListViewAdapter(Activity context, QiuBaiBean list) {
        super();
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.wh = (SysUtils.getScreenWidth(context) - SysUtils.Dp2Px(context, 99)) / 3;
//        if (list.getData().size() > 15) {
//            data = list.getData().subList(0, 15);
//        } else {
        data = list.getData();
//        }
//        this.finalImageLoader = FinalBitmap.create(context);
//        this.finalImageLoader.configLoadingImage(R.drawable.ic_head);
    }


    @Override
    public int getCount() {
        if (data == null) return 0;
        return data.size();
    }

    @Override
    public Object getItem(int arg0) {
        if (data == null) return 0;
        return data.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return data == null ? null : arg0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        if (MyApplication.map.get(position) == null) {
            MyApplication.map.put(position, 0);
        }
        try {
            if (data.size() == 0) {
                return null;
            }
            final ViewHolder holder;
            if (convertView == null || ((ViewHolder) convertView.getTag()).id != position) {
                convertView = mInflater.inflate(R.layout.item_listview, null);
                holder = new ViewHolder();
                holder.id = position;
                holder.headphoto = (CircleImageView) convertView.findViewById(R.id.info_iv_header);
                holder.disName = (TextView) convertView.findViewById(R.id.info_tv_name);
                holder.time = (TextView) convertView.findViewById(R.id.info_tv_time);
                holder.content = (TextView) convertView.findViewById(R.id.info_tv_content);
                holder.rl4 = (RelativeLayout) convertView.findViewById(R.id.rl4);
                holder.gv_images = (MyGridView) convertView.findViewById(R.id.gv_images);
                holder.location = (TextView) convertView.findViewById(R.id.location);
                holder.zan = (ImageView) convertView.findViewById(R.id.zan);
                holder.zan_num = (TextView) convertView.findViewById(R.id.zan_num);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            QiuBaiBean.DataEntity bean = data.get(position);

            String name = null, xingbie = null, time = null, content = null, headpath = null, contentimage = null, loc = null;
            StringBuilder sb = new StringBuilder();
            if (bean != null) {
                name = bean.getUser().getLogin();
                xingbie = bean.getUser().getGender();
                int minute = (int) (Math.random() * 50);
                time = minute + " 分钟前";
                content = bean.getContent();
                loc = bean.getDistance();
                String avatar = bean.getUser().getId() + "";
                if (avatar.length() > 5) {
                    headpath = "http://pic.qiushibaike.com/system/avtnew/" + new StringBuilder(avatar).substring(0, 4) + "/" + avatar + "/thumb/" + bean.getUser().getIcon() + "?imageView2/1/w/50/h/50";
                } else if (avatar.length() <= 5) {
                    headpath = "http://pic.qiushibaike.com/system/avtnew/" + new StringBuilder(avatar).substring(0, 1) + "/" + avatar + "/thumb/" + bean.getUser().getIcon() + "?imageView2/1/w/50/h/50";
                }
                for (int i = 0; i < bean.getPic_urls().size(); i++) {
                    String tempUrl = bean.getPic_urls().get(i).getPic_url();
                    int index = tempUrl.indexOf("w/500/q/80");
                    StringBuilder url = new StringBuilder(tempUrl).delete(index, tempUrl.length()).append("w/180/q/120");
                    sb.append(url + "#");
                }
                contentimage = sb.toString();
            }

            if (loc != null && !loc.equals("")) {
                holder.location.setText(loc);
            }
            if (name != null && !name.equals("")) {
                holder.disName.setText(name);
            }
            if (contentimage != null && !contentimage.equals("")) {
                holder.rl4.setVisibility(View.VISIBLE);
                initInfoImages(holder.gv_images, contentimage);
            } else {
                holder.rl4.setVisibility(View.GONE);
            }
            if (time != null && !time.equals("")) {
                holder.time.setText(time);
            }
            if (content != null && !content.equals("")) {
                holder.content.setText(content);
                Linkify.addLinks(holder.content, Linkify.WEB_URLS);
            }
            if (headpath != null && !headpath.equals("")) {
//                finalImageLoader.display(holder.headphoto, headpath);
                Glide.with(context).load(headpath).fitCenter().into(holder.headphoto);
//                LoadImageUtil.add(context.getApplicationContext(), headpath, holder.headphoto);
            } else {
                holder.headphoto.setImageResource(R.drawable.ic_head);
            }
            final String finalName = name;
            final String finalXingbie = xingbie;
            final String finalLoc = loc;
            holder.location.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    Toast.makeText(context, finalLoc, Toast.LENGTH_SHORT).show();
                }
            });
            if (MyApplication.map.get(position) > 0) {
                holder.zan.setImageResource(R.drawable.zan_red);
                holder.zan_num.setText("1");
                holder.zan_num.setTextColor(context.getResources().getColor(R.color.red));
            }
            holder.zan.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    String num = (String) holder.zan_num.getText();
                    if (num.equals("0")) {
                        MyApplication.map.put(position, 1);
                        holder.zan.setImageResource(R.drawable.zan_red);
                        holder.zan_num.setText("1");
                        holder.zan_num.setTextColor(context.getResources().getColor(R.color.red));
                    } else {
                        Toast.makeText(context, "不能重复点赞。。", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("eee");
        }
        return convertView;
    }


    public void initInfoImages(MyGridView gv_images, final String imgspath) {
        if (imgspath != null && !imgspath.equals("")) {
            String[] imgs = imgspath.split("#");
            System.out.println("hehehehehe---------------------------");
            for (String s : imgs) {
                System.out.println("hehehehehe " + s);
            }
            System.out.println("hehehehehe---------------------------");
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < imgs.length; i++) {
                list.add(imgs[i]);
            }
            int w = 0;
            switch (imgs.length) {
                case 0:
                    gv_images.setNumColumns(0);
                    break;
                case 1:
                    w = wh;
                    gv_images.setNumColumns(1);
                    break;
                case 2:
                case 4:
                    w = 2 * wh + SysUtils.Dp2Px(context, 2);
                    gv_images.setNumColumns(2);
                    break;
                case 3:
                case 5:
                case 6:
                    w = wh * 3 + SysUtils.Dp2Px(context, 2) * 2;
                    gv_images.setNumColumns(3);
                    break;
            }
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(w, RelativeLayout.LayoutParams.WRAP_CONTENT);
            gv_images.setLayoutParams(lp);
            nearByInfoImgsAdapter = new TestGridViewAdapter(context, list);
            gv_images.setAdapter(nearByInfoImgsAdapter);
            gv_images.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Toast.makeText(context, "请先登录。。", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    static class ViewHolder {
        int id;
        CircleImageView headphoto;
        ImageView zan;
        TextView disName;
        TextView zan_num;
        TextView time;
        TextView location;
        TextView content;
        MyGridView gv_images;
        RelativeLayout rl4;
    }


}
