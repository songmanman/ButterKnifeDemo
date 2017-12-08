package com.open.annotation.fragment;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.open.annotation.R;
import com.open.annotation.adapter.MainAnnotationAdapter;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ItemLongClick;
import org.androidannotations.annotations.ViewById;

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
public class MainPullFragment extends Fragment {
    @ViewById
    ListView pullrefreshlist;
    @Bean
    MainAnnotationAdapter adapter;

    @AfterViews
    public void initValue() {
        Log.d("MainPullFragment","initValue");
        pullrefreshlist.setAdapter(adapter);
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
    @ItemClick(R.id.pullrefreshlist)
    void  ItemClicked(CommonBean item) {
        Toast.makeText(getActivity(), "点击了" + item.toString(), Toast.LENGTH_SHORT).show();
    }

    /**
     * 名字必须是这个
     */
    @ItemLongClick(R.id.pullrefreshlist)
    void  ItemLongClicked(CommonBean item) {
        adapter.delete(item);
    }

}
