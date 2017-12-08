package com.open.annotation;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.open.annotation.activity.CommonTitleBarActivity;
import com.open.annotation.bean.CommonBean;
import com.open.annotation.fragment.MainPullFragment;
import com.open.annotation.fragment.MainPullFragment_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;


@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        addContentView(R.layout.activity_main);
//    }

    @AfterViews
    public void initValues() {

    }

    @AfterViews
    public void addfragment() {
        Log.d("MainActivity","addfragment");
        Fragment fragment = new MainPullFragment() ;
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_main, MainPullFragment_.builder().build()).commit();
    }
}

//public class MainActivity extends CommonTitleBarActivity<CommonBean> {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        addContentView(R.layout.activity_main);
//    }
//
//    @Override
//    public void initValues() {
//        setCenterTextValue("ssss");
//    }
//
//    @Override
//    public void addfragment() {
//        Fragment fragment = MainPullFragment.newInstance(this,true);
//        getSupportFragmentManager().beginTransaction().replace(R.id.layout_main, fragment).commit();
//    }
//}
