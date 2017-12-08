package com.open.annotation.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.open.annotation.R;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/8  14:26
 * @version:2.10
 * @modifyTime:2017/12/8 14:26
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EViewGroup(R.layout.adapter_main)
public class MainViewHolder extends ViewHolder<CommonBean>{
    @ViewById
    TextView txt_name;

    public MainViewHolder(Context context) {
        super(context);
    }

    public MainViewHolder(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainViewHolder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void bind(CommonBean item) {
        super.bind(item);
        txt_name.setText(item.getClass().getSimpleName());
    }
}
