package com.open.annotation.fragment;


import android.content.Context;
import android.util.Log;

import com.open.annotation.adapter.MainAdapter;
import com.open.annotation.bean.CommonBean;

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

public class MainPullFragment extends CommonPullToRefreshListViewFragment<CommonBean,MainAdapter.ViewHolder,MainAdapter> {

    public static CommonPullToRefreshListViewFragment newInstance(Context mContext, boolean isVisibleToUser) {
        MainPullFragment fragment = new MainPullFragment();
        fragment.setFragment(fragment);
        fragment.mContext = mContext;
        fragment.setUserVisibleHint(isVisibleToUser);
        return fragment;
    }

    @Override
    protected void initValues() {
        super.initValues();
        list.add(new CommonBean());
        list.add(new CommonBean());
        list.add(new CommonBean());
        Log.d(TAG,"=====ssss====");
        adapter = new MainAdapter(getActivity(),list);
        mPullToRefreshListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
