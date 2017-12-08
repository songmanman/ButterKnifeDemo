//package com.open.annotation.adapter;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//
//import org.androidannotations.annotations.AfterInject;
//import org.androidannotations.annotations.EBean;
//import org.androidannotations.annotations.RootContext;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
///**
// * ****************************************************************************************************************************************************************************
// *
// * @author :fengguangjing
// * @createTime: 2017/12/7 9:42
// * @version:2.10
// * @modifyTime:2017/12/7 9:42
// * @modifyAuthor:fengguangjing
// * @description: ***************************************************************************************************************************************************************************
// **/
//@EBean
//public abstract class CommonAdapter<T, IV extends ViewHolder<T>> extends BaseAdapter {
//    @RootContext
//    Context context;
//    List<T> list;
//
//    public CommonAdapter(Context context) {
//        this.context = context;
//        this.list = new ArrayList<>();
//    }
//
//    @Override
//    public int getCount() {
//        return list.size();
//    }
//
//    @Override
//    public T getItem(int position) {
//        return list.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        IV view = null;
//        if (convertView == null) {
//            view = build(context);
//        } else {
//            view = (IV) convertView;
//        }
//        view.bind(getItem(position));
//        return view;
//    }
//
//    abstract IV build(Context context);
//
//
//
//    public List<T> getList() {
//        return list;
//    }
//
//    public void setList(List<T> list) {
//        this.list = list;
//    }
//
//
//    public void update(List<T> items) {
//        this.list.clear();
//        this.list.addAll(items);
//        notifyDataSetChanged();
//    }
//
//    public void append(List<T> items) {
//        this.list.addAll(items);
//        notifyDataSetChanged();
//    }
//}
