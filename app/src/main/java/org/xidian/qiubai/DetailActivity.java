package org.xidian.qiubai;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends Activity {
    CircleImageView headphoto;
    TextView disName;
    TextView time;
    TextView location;
    TextView content;
    MyGridView gv_images;
    RelativeLayout rl4;
    private TestGridViewAdapterDetail nearByInfoImgsAdapter;
    private int wh;
    private ImageView zan;
    private TextView zan_num;

    //bundle.putString("avatar", headpath);
//    bundle.putString("name", bean.getData().get(arg2).getUser().getLogin());
//    bundle.putString("content", bean.getData().get(arg2).getContent());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detail);
        this.wh = (SysUtils.getScreenWidth(DetailActivity.this) - SysUtils.Dp2Px(DetailActivity.this, 99)) / 3;
        initView();
        initData();
    }

    private void initData() {
        try {
            QiuBaiBean.DataEntity bean = MyApplication.bean;

            String name = null, xingbie = null, times = null, contents = null, headpath = null, contentimage = null, loc = null;
            StringBuilder sb = new StringBuilder();
            if (bean != null) {
                name = bean.getUser().getLogin();
                xingbie = bean.getUser().getGender();
                int minute = (int) (Math.random() * 50);
                times = minute + " 分钟前";
                contents = bean.getContent();
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
                location.setText(loc);
            }
            if (name != null && !name.equals("")) {
                disName.setText(name);
            }
            if (contentimage != null && !contentimage.equals("")) {
                rl4.setVisibility(View.VISIBLE);
                initInfoImages(gv_images, contentimage);
            } else {
                rl4.setVisibility(View.GONE);
            }
            if (times != null && !times.equals("")) {
                time.setText(times);
            }
            if (contents != null && !contents.equals("")) {
                content.setText(contents);
//            Linkify.addLinks(content, Linkify.WEB_URLS);
            }
            if (headpath != null && !headpath.equals("")) {
//                finalImageLoader.display(headphoto, headpath);
                Glide.with(DetailActivity.this).load(headpath).fitCenter().into(headphoto);
//                LoadImageUtil.add(DetailActivity.this, headpath, headphoto);
            } else {
                headphoto.setImageResource(R.drawable.ic_head);
            }
            final String finalName = name;
            final String finalXingbie = xingbie;
            headphoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    if (finalXingbie.equals("M")) {
                        Toast.makeText(DetailActivity.this, finalName + " " + "男", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(DetailActivity.this, finalName + " " + "女", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } catch (Exception e) {

        }
    }

    private void initView() {
        headphoto = (CircleImageView) findViewById(R.id.info_iv_header);
        disName = (TextView) findViewById(R.id.info_tv_name);
        time = (TextView) findViewById(R.id.info_tv_time);
        content = (TextView) findViewById(R.id.info_tv_content);
        rl4 = (RelativeLayout) findViewById(R.id.rl4);
        gv_images = (MyGridView) findViewById(R.id.gv_images);
        location = (TextView) findViewById(R.id.location);
        zan = (ImageView) findViewById(R.id.zan);
        zan_num = (TextView) findViewById(R.id.zan_num);
        zan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String num = (String) zan_num.getText();
                if (num.equals("0")) {
                    zan.setImageResource(R.drawable.zan_red);
                    zan_num.setText(String.valueOf(Integer.parseInt(num) + 1));
                    zan_num.setTextColor(DetailActivity.this.getResources().getColor(R.color.red));
                } else {
                    Toast.makeText(DetailActivity.this, "不能重复点赞。。", Toast.LENGTH_SHORT).show();
                }
            }
        });
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
                    w = 2 * wh + SysUtils.Dp2Px(DetailActivity.this, 2);
                    gv_images.setNumColumns(2);
                    break;
                case 3:
                case 5:
                case 6:
                    w = wh * 3 + SysUtils.Dp2Px(DetailActivity.this, 2) * 2;
                    gv_images.setNumColumns(3);
                    break;
            }
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(w, RelativeLayout.LayoutParams.WRAP_CONTENT);
            gv_images.setLayoutParams(lp);
            nearByInfoImgsAdapter = new TestGridViewAdapterDetail(DetailActivity.this, list);
            gv_images.setAdapter(nearByInfoImgsAdapter);
            gv_images.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    Toast.makeText(DetailActivity.this, "GridView图片第" + (arg2 + 1) + "个", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LoadImageUtil.load();
    }
}
