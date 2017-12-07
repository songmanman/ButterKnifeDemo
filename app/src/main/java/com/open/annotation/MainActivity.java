package com.open.annotation;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.open.annotation.adapter.MainAdapter;
import com.open.annotation.bean.CommonBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends BaseAnnotationActivity<CommonBean> {
    @BindView(R.id.listview)
    ListView listview;
    MainAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addContentView(R.layout.activity_main);
    }

    @Override
    void initValues() {
        super.initValues();
        Log.d(TAG, "initValues=====");
        list = new ArrayList<>();
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        adapter = new MainAdapter(this, list);
        listview.setAdapter(adapter);
    }


    @OnItemClick(R.id.listview)
    public void onItemClick(int position) {
        Toast.makeText(getBaseContext(), "item" + position, Toast.LENGTH_SHORT).show();
    }
}
