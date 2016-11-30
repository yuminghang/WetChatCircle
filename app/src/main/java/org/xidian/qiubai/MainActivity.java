package org.xidian.qiubai;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {


    private FrameLayout fragment_container;
    private MainFragment f1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment_container = (FrameLayout) findViewById(R.id.fragment_container);
        select();
    }

    private void select() {
        FragmentManager fm = getSupportFragmentManager();  //获得Fragment管理器
        FragmentTransaction ft = fm.beginTransaction(); //开启一个事务
        f1 = new MainFragment();
        ft.replace(R.id.fragment_container, f1);
        ft.commit();   //提交事务
    }

}
