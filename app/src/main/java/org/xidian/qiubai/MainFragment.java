package org.xidian.qiubai;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
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

/**
 * Created by ymh on 2016/11/30.
 */
public class MainFragment extends Fragment {
    static ArrayList<String> titleContainer = new ArrayList<String>();
    public ArrayList<android.support.v4.app.Fragment> fragmentList;
    private View view;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ListView listview;
    private TestListViewAdapter listViewAdapter;
    private List<QiuBaiBean> listBean;
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private QiuBaiBean bean;

    private String res;

    private static void initTitle() {
        //页签项
        titleContainer.add("隔壁");
        titleContainer.add("已粉");
        titleContainer.add("视频");
        titleContainer.add("话题");
    }


    @Override
    public void onResume() {
        super.onResume();
        if (listViewAdapter != null)
            listViewAdapter.notifyDataSetChanged();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.homefragment_layout, container, false);
        findViews();
        initViewpager();
        return view;
    }

    private void findViews() {
        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
//        LinearLayout linear_layout = (LinearLayout) view.findViewById(R.id.linear_layout);
    }

    private void initViewpager() {
        initTitle();
        fragmentList = new ArrayList<>();
        Fragment1 f1 = new Fragment1();
        Fragment1 f2 = new Fragment1();
        Fragment1 f3 = new Fragment1();
        Fragment1 f4 = new Fragment1();
        fragmentList.add(f1);
        fragmentList.add(f2);
        fragmentList.add(f3);
        fragmentList.add(f4);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getChildFragmentManager(), fragmentList, titleContainer);
        mViewPager.setAdapter(myFragmentPagerAdapter);
        mViewPager.setCurrentItem(0);//设置当前显示标签页为第一页
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(myFragmentPagerAdapter);
    }

}
