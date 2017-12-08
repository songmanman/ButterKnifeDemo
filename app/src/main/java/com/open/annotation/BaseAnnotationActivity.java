package com.open.annotation;

import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;


import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.open.annotation.activity.WeakActivityReferenceHandler;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;



/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/6 15:44
 * @version:2.10
 * @modifyTime:2017/12/6 15:44
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/
@EActivity(R.layout.activity_base_annotation)
public class BaseAnnotationActivity<T> extends AppCompatActivity {
    public static final String TAG = BaseAnnotationActivity.class.getSimpleName();
    private ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();
    public WeakActivityReferenceHandler weakReferenceHandler;

    @ViewById(R.id.layout_parent)
    public RelativeLayout layout_parent;

    @ViewById(R.id.layout_titlebar)
    public RelativeLayout layout_titlebar;

    @ViewById(R.id.layout_content)
    public  RelativeLayout layout_content;

    public List<T> list;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_base_annotation);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
//        injectView();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
//        injectView();
    }

    /**
     * 绑定注解
     */
    void injectView() {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /****
     * 子activity addview
     * @param layoutId
     */
    public void addContentView(int layoutId) {
        addContentView(layoutId,false);
    }

    public void addContentView(int layoutId,boolean titlebar) {
        if (layoutId <= 0) {
            return;
        }
//        View view = LayoutInflater.from(this).inflate(R.layout.activity_base_annotation,null);
        if (titlebar){
            layout_titlebar = (RelativeLayout)  findViewById(R.id.layout_titlebar);
            layout_titlebar.addView(LayoutInflater.from(this).inflate(layoutId, null),
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            150
                    )
                    );
        }else{
            layout_content = (RelativeLayout)  findViewById(R.id.layout_content);
            layout_content.addView(LayoutInflater.from(this).inflate(layoutId, null),
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.MATCH_PARENT
                    )
            );
        }
//        setContentView(view);
        injectView();
        initValues();
        bindEvent();
        addfragment();
    }

    public void initValues() {
    }

    public void bindEvent() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void handleMessage(Message msg){}

    protected ImageLoadingListener getImageLoadingListener() {
        return animateFirstListener;
    }

    /**
     * 绑定fragment
     */
    public void addfragment(){

    }
}
