package com.open.annotation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/79:22
 * @version:2.10
 * @modifyTime:2017/12/79:22
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public abstract  class CommonAdapter<T,VH extends CommonViewHolder> extends BaseAdapter{
    private List<T> list;
    public LayoutInflater inflater;
    public Context mContext;

    public CommonAdapter(Context mContext, List<T> list ) {
        this.inflater = LayoutInflater.from(mContext);
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public T getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        VH holder = null;
        T item = this.getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(getLayoutResId(), parent, false);
            holder= bindHoler();
            holder.setConvertView(convertView);
            convertView.setTag(holder);
        }else{
            holder= (VH) convertView.getTag();
        }
        bindData(holder,position,item);
        return convertView;
    }
    public abstract VH bindHoler();
    public abstract int getLayoutResId();
    public abstract void bindData(VH holder, int position,T item);
}
