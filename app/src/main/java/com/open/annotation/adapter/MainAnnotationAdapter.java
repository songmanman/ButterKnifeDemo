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
public class MainAnnotationAdapter extends CommonAdapter<CommonBean,MainAnnotationViewHolder> {
    public MainAnnotationAdapter(Context context) {
        super(context);
    }

    @Override
    MainAnnotationViewHolder build(Context context) {
        return  MainAnnotationViewHolder_.build(context);
    }
}

