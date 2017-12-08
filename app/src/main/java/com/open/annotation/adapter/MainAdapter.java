package com.open.annotation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.open.annotation.R;
import com.open.annotation.bean.CommonBean;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.ViewById;

import java.util.List;



/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7 9:42
 * @version:2.10
 * @modifyTime:2017/12/7 9:42
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/

@EBean
public class MainAdapter  extends CommonAdapter<CommonBean,MainViewHolder>{
    public MainAdapter(Context context) {
        super(context);
    }

    @Override
    MainViewHolder build(Context context) {
        return MainViewHolder_.build(context);
    }


}
