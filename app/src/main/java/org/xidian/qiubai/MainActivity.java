package org.xidian.qiubai;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private ListView listview;
    private TestListViewAdapter listViewAdapter;
    private List<QiuBaiBean> listBean;
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private QiuBaiBean bean;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    listViewAdapter = new TestListViewAdapter(MainActivity.this, bean);
                    listview.setAdapter(listViewAdapter);
                    listview.setOnScrollListener(new AbsListView.OnScrollListener() {
                        @Override
                        public void onScrollStateChanged(AbsListView absListView, int i) {

                        }

                        @Override
                        public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                            LoadImageUtil.load();
                        }
                    });
                    LoadImageUtil.load();
                    listview.setOnItemClickListener(new OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                            String avatar = bean.getData().get(arg2).getUser().getId() + "";
                            String headpath = "";
                            if (avatar.length() > 5) {
                                headpath = "http://pic.qiushibaike.com/system/avtnew/" + new StringBuilder(avatar).substring(0, 4) + "/" + avatar + "/thumb/" + bean.getData().get(arg2).getUser().getIcon() + "?imageView2/1/w/50/h/50";
                            } else if (avatar.length() <= 5) {
                                headpath = "http://pic.qiushibaike.com/system/avtnew/" + new StringBuilder(avatar).substring(0, 1) + "/" + avatar + "/thumb/" + bean.getData().get(arg2).getUser().getIcon() + "?imageView2/1/w/50/h/50";
                            }
                            MyApplication.bean = bean.getData().get(arg2);
                            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                            startActivity(intent);
                            LoadImageUtil.stop();
                        }
                    });
                    break;
            }
        }
    };
    private String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listBean = new ArrayList<QiuBaiBean>();
        initView();
        volley_get();
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
    }

    // 利用Volley实现Get请求
    private void volley_get() {
        String url = "http://circle.qiushibaike.com/article/nearby/list?page=1&latitude=39.912134&longitude=116.419933&count=30&rqcnt=237&r=69e5427a1479389638720";
        // 1 创建RequestQueue对象
        mRequestQueue = Volley.newRequestQueue(this);
        // 2 创建StringRequest对象
        mStringRequest = new StringRequest(url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println("请求结果:" + Thread.currentThread().getName());
                        System.out.println("请求结果:" + response);
                        res = response;
                        Gson gson = new Gson();
                        bean = gson.fromJson(res, QiuBaiBean.class);
                        handler.sendEmptyMessage(0);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("请求错误:" + error.toString());
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                // self-defined user agent
                Map<String, String> headerMap = new HashMap<String, String>();
                headerMap.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.76 Mobile Safari/537.36");
                return headerMap;
            }
        };
        // 3 将StringRequest添加到RequestQueue
        mRequestQueue.add(mStringRequest);
    }


}
