package com.open.annotation.activity;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;
import android.widget.Toast;

import com.open.annotation.R;
import com.open.annotation.adapter.MainAnnotationAdapter;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemLongClick;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/8  15:01
 * @version:2.10
 * @modifyTime:2017/12/8 15:01
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EActivity(R.layout.activity_annotation_listview)
public class MainAnnotationActivity extends Activity {
    @ViewById
    ListView listview;
    @Bean
    MainAnnotationAdapter adapter;

    @AfterViews
    public void initValue() {
        listview.setAdapter(adapter);
        List<CommonBean> list = new ArrayList<>();
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        adapter.append(list);
    }


    /**
     * 名字必须是这个
     */
    @ItemClick
    void listviewItemClicked(CommonBean item) {
        Toast.makeText(this, "点击了" + item.toString(), Toast.LENGTH_SHORT).show();
    }

    /**
     * 名字必须是这个
     */
    @ItemLongClick
    void listviewItemLongClicked(CommonBean item) {
        adapter.delete(item);
    }
}

