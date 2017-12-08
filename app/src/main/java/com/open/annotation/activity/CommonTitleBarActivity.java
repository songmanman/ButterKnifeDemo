package com.open.annotation.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.open.annotation.BaseAnnotationActivity;
import com.open.annotation.R;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7  15:13
 * @version:2.10
 * @modifyTime:2017/12/7 15:13
 * @modifyAuthor:fengguangjing
 * @description: *************************************************************************************************************************************************************************
 **/
@EActivity
public class CommonTitleBarActivity<T> extends BaseAnnotationActivity<T> {

    @Nullable @ViewById(R.id.txt_left)
    public TextView txt_left;// 左文字

    @Nullable @ViewById(R.id.txt_title)
    public TextView txt_title;// 中标题

    @Nullable @ViewById(R.id.txt_right)
    public TextView txt_right;// 右文字

    @Nullable @ViewById(R.id.id_iv_left)
    public ImageView id_iv_left;// 左图片

    @Nullable @ViewById(R.id.id_iv_right)
    public ImageView id_iv_right;// 右图片

    @Nullable @ViewById(R.id.layout_titlebar)
    public RelativeLayout layout_titlebar;

    @Nullable @ViewById(R.id.txt_time)
    public TextView txt_time;//中间底部刷新时间

    @Nullable  @ViewById(R.id.id_iv_right2)
    public ImageView id_iv_right2;//右侧图片2

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addContentView(R.layout.activity_common_titlebar,true);
    }

    public void setLeftTextVisivable(boolean visiable) {
        if (txt_left != null) {
            if (visiable) {
                txt_left.setVisibility(View.VISIBLE);
                id_iv_left.setVisibility(View.GONE);
            } else {
                txt_left.setVisibility(View.GONE);
                id_iv_left.setVisibility(View.VISIBLE);
            }
        }
    }

    public void setLeftTextValue(String textvalue) {
        if (txt_left != null) {
            txt_left.setText(textvalue);
        }
    }

    public void setRightTextVisivable(boolean visiable) {
        if (txt_right != null) {
            if (visiable) {
                txt_right.setVisibility(View.VISIBLE);
                id_iv_right.setVisibility(View.GONE);
            } else {
                txt_right.setVisibility(View.GONE);
                id_iv_right.setVisibility(View.VISIBLE);
            }
        }
    }

    public void setRightTextValue(String textvalue) {
        if (txt_right != null) {
            txt_right.setText(textvalue);
        }
    }

    /**
     * 中间 标题
     */
    public void setCenterTextValue(String textvalue) {
        if (txt_title != null) {
            txt_title.setText(textvalue);
        }
    }

    /**
     * 中间右侧图标
     */
    public void setCenterCompoundDrawables(int resId) {
        if (txt_title != null) {
            txt_title.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(resId), null);
        }
    }

    /**
     * 中间底部刷新时间
     */
    public void setCenterTimeTextValue(String textvalue) {
        if (txt_time != null) {
            txt_time.setText(textvalue);
            txt_time.setVisibility(View.VISIBLE);
        }
    }

    public void setLeftVisivableGone() {
        txt_left.setVisibility(View.GONE);
        id_iv_left.setVisibility(View.GONE);
    }

    public void setRightVisivableGone() {
        txt_right.setVisibility(View.GONE);
        id_iv_right.setVisibility(View.GONE);
    }

    public void setLeftImageResId(int resid) {
        id_iv_left.setVisibility(View.VISIBLE);
        id_iv_left.setImageResource(resid);
    }

    /**
     * 右侧图标 默认刷新功能
     */
    public void setRightImageResId(int resid) {
        id_iv_right.setVisibility(View.VISIBLE);
        id_iv_right.setImageResource(resid);
    }

    /**
     * 右侧图标2 默认搜索按钮
     */
    public void setRightImage2ResId(int resid) {
        id_iv_right2.setVisibility(View.VISIBLE);
        id_iv_right2.setImageResource(resid);
    }

}
