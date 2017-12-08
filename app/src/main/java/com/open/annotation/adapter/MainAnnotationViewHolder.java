package com.open.annotation.adapter;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.open.annotation.R;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/8  15:07
 * @version:2.10
 * @modifyTime:2017/12/8 15:07
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EViewGroup(R.layout.adapter_main)
public  class MainAnnotationViewHolder extends ViewHolder<CommonBean> {
    @ViewById
    TextView txt_name;

    public MainAnnotationViewHolder(Context context) {
        super(context);
    }

    @Override
    public void bind(CommonBean item) {
        txt_name.setText("111");
    }


}
