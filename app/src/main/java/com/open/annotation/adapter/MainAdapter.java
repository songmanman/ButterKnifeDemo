package com.open.annotation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.open.annotation.R;
import com.open.annotation.bean.CommonBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

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

public class MainAdapter extends CommonAdapter<CommonBean,MainAdapter.ViewHolder> {

    public MainAdapter(Context mContext, List<CommonBean> list) {
        super(mContext, list);
    }

    @Override
    public ViewHolder bindHoler() {
        return new ViewHolder();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.adapter_main;
    }

    @Override
    public void bindData(ViewHolder holder, int position, CommonBean item) {
        holder.txt_name.setText("sss");
    }

    public  class ViewHolder extends CommonViewHolder{
        @BindView(R.id.txt_name)
        TextView txt_name;
    }
}
