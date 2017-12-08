package com.open.annotation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/8  15:05
 * @version:2.10
 * @modifyTime:2017/12/8 15:05
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EBean
public class MainAnnotationAdapter extends BaseAdapter {
    @RootContext
    Context context;
    List<CommonBean> list;

    @AfterInject
    void init() {
        this.list = new ArrayList<CommonBean>();
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public CommonBean getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          MainAnnotationViewHolder view = null;
        if (convertView == null) {
            view = MainAnnotationViewHolder_.build(context);
        } else {
            view = (MainAnnotationViewHolder) convertView;
        }
        view.bind(getItem(position));
        return view;
    }

    public void update(List<CommonBean> items) {
        this.list.clear();
        this.list.addAll(items);
        notifyDataSetChanged();
    }

    public void append(List<CommonBean> items) {
        this.list.addAll(items);
        notifyDataSetChanged();
    }

    public void delete(CommonBean item) {
        this.list.remove(item);
        notifyDataSetChanged();
    }

}

