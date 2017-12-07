package com.open.annotation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.open.annotation.MessageHanlder;
import com.open.annotation.R;
import com.open.annotation.adapter.CommonAdapter;
import com.open.annotation.adapter.CommonViewHolder;
import com.open.annotation.bean.CommonBean;

import butterknife.BindView;
import butterknife.OnItemClick;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7 10:31
 * @version:2.10
 * @modifyTime:2017/12/7 10:31
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public class CommonPullToRefreshListViewFragment<T,VH extends CommonViewHolder,A extends CommonAdapter<T,VH>> extends  BaseFragment<T,CommonPullToRefreshListViewFragment>
implements PullToRefreshListView.OnRefreshListener<ListView>,AdapterView.OnItemClickListener{

    @BindView(R.id.pull_refresh_list)
    PullToRefreshListView mPullToRefreshListView;
    A adapter;

    public static CommonPullToRefreshListViewFragment newInstance(Context mContext,boolean isVisibleToUser) {
        CommonPullToRefreshListViewFragment fragment = new CommonPullToRefreshListViewFragment();
        fragment.setFragment(fragment);
        fragment.mContext = mContext;
        fragment.setUserVisibleHint(isVisibleToUser);
        return fragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.common_pulltorefresh_listview;
    }

    @Override
    protected void initValues() {
        mPullToRefreshListView.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
    }

    @Override
    void bindEvent() {
        mPullToRefreshListView.setOnRefreshListener(this);
        mPullToRefreshListView.setOnItemClickListener(this);
    }



    @Override
    public void onRefresh(PullToRefreshBase<ListView> refreshView) {
        String label = DateUtils.formatDateTime(getActivity(), System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
        // Update the LastUpdatedLabel
        refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);
        // Do work to refresh the list here.
        if (mPullToRefreshListView.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_START) {
            pageNo = 1;
            weakReferenceHandler.sendEmptyMessage(MessageHanlder.MESSAGE_HANDLER);
        } else if (mPullToRefreshListView.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_END) {
            pageNo++;
            weakReferenceHandler.sendEmptyMessage(MessageHanlder.MESSAGE_HANDLER);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
