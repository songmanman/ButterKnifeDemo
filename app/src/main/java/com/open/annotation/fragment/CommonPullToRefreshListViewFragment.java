package com.open.annotation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.open.annotation.R;
import com.open.annotation.adapter.CommonAdapter;
import com.open.annotation.adapter.CommonViewHolder;
import com.open.annotation.bean.CommonBean;

import butterknife.BindView;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/710:31
 * @version:2.10
 * @modifyTime:2017/12/710:31
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public class CommonPullToRefreshListViewFragment<T,VH extends CommonViewHolder,A extends CommonAdapter<T,VH>> extends  BaseFragment<T>
implements PullToRefreshListView.OnRefreshListener<ListView>{

    @BindView(R.id.pull_refresh_list)
    PullToRefreshListView mPullToRefreshListView;
    A adapter;

    public static CommonPullToRefreshListViewFragment newInstance(Context mContext) {
        CommonPullToRefreshListViewFragment fragment = new CommonPullToRefreshListViewFragment();
        fragment.mContext = mContext;
        return fragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.common_pulltorefresh_listview;
    }

    @Override
    protected void initValues(Bundle savedInstanceState) {

    }

    @Override
    public void onRefresh(PullToRefreshBase<ListView> refreshView) {

    }
}
