package com.open.annotation.adapter;

import android.view.View;

import butterknife.ButterKnife;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7 9:55
 * @version:2.10
 * @modifyTime:2017/12/7 9:55
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

public class CommonViewHolder {
    private View convertView;

    public void setConvertView(View convertView) {
        this.convertView = convertView;
        ButterKnife.bind(this, convertView);
    }

    public View getConvertView() {
        return convertView;
    }
}
