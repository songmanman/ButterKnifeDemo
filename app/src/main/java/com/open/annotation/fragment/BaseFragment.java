package com.open.annotation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/710:18
 * @version:2.10
 * @modifyTime:2017/12/710:18
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public abstract class BaseFragment<T> extends Fragment {

    /**
     * 设置fragment layoutid
     * @return
     */
    public abstract int getContentViewId();

    protected View mRootView;
    protected Context mContext;
    Unbinder mUnbinder;
    List<T> list;
    /***分页信息*/
    int pageNo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(getContentViewId(), container, false);
        this.mContext = getActivity();
        mUnbinder = ButterKnife.bind(this, mRootView);//绑定framgent
        initValues(savedInstanceState);
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bindEvent();
    }

    /**
     * 初始化fragment控件
     * @param savedInstanceState
     */
    protected abstract void initValues(Bundle savedInstanceState);


    void bindEvent(){

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();//解绑
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
