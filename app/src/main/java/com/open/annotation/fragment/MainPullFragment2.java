package com.open.annotation.fragment;


import android.util.Log;
import android.widget.Toast;

import com.open.annotation.R;
import com.open.annotation.adapter.MainAnnotationAdapter;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ItemClick;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7  15:26
 * @version:2.10
 * @modifyTime:2017/12/7 15:26
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EFragment(R.layout.common_pulltorefresh_listview)
public class MainPullFragment2 extends CommonPullToRefreshListViewFragment {
    @Bean
    MainAnnotationAdapter adapter;

    @AfterViews
    void initValue() {
        super.initValues();
        mPullToRefreshListView.setAdapter(adapter);
        Log.d("MainPullFragment","initValue");
        List<CommonBean> list = new ArrayList<>();
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        adapter.append(list);
    }

    @ItemClick(R.id.pullrefreshlist)
    void  ItemClicked(CommonBean item) {
        Toast.makeText(getActivity(), "点击了" + item.toString(), Toast.LENGTH_SHORT).show();
    }
}
