package com.open.annotation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;


import com.open.annotation.adapter.CommonAdapter;
import com.open.annotation.adapter.CommonViewHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/615:44
 * @version:2.10
 * @modifyTime:2017/12/615:44
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/
public class BaseAnnotationActivity<T> extends AppCompatActivity {
    public static final String TAG = BaseAnnotationActivity.class.getSimpleName();
    @BindView(R.id.layout_parent)
    RelativeLayout layout_parent;

    @BindView(R.id.layout_titlebar)
    RelativeLayout layout_titlebar;

    @BindView(R.id.layout_content)
    RelativeLayout layout_content;

    /**注解 绑定解绑**/
    Unbinder mUnbinder;
    public List<T> list;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        injectView();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        injectView();
    }

    /**
     * 绑定注解
     */
    void injectView() {
        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }

    /****
     * 子activity addview
     * @param layoutId
     */
    void addContentView(int layoutId) {
        if (layoutId <= 0) {
            return;
        }
        View view = LayoutInflater.from(this).inflate(R.layout.activity_base_annotation,null);
        layout_content = view.findViewById(R.id.layout_content);
        layout_content.addView(LayoutInflater.from(this).inflate(layoutId, null),
                new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.MATCH_PARENT
                )
        );
        setContentView(view);
        initValues();
        bindEvent();
    }

    void initValues() {
    }

    void bindEvent() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
