package com.open.annotation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.View;

import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.open.annotation.AnimateFirstDisplayListener;
import com.open.annotation.MessageHanlder;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;



/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7 10:18
 * @version:2.10
 * @modifyTime:2017/12/7 10:18
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/
@EFragment
public abstract class BaseFragment<F extends BaseFragment> extends Fragment {
    public static final String TAG = BaseFragment.class.getSimpleName();
    public static final String KEY_CONTENT = BaseFragment.class.getSimpleName() + ":Content";
    public String mContent = "";
    /**
     * 设置fragment layoutid
     *
     * @return
     */
//    public abstract int getContentViewId();

//    protected View mRootView;
    protected Context mContext;
    /***分页信息*/
    int pageNo;


    WeakReferenceHandler weakReferenceHandler;
    public View view;
    public boolean isVisibleToUser;
    private ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        mRootView = inflater.inflate(getContentViewId(), container, false);
//        this.mContext = getActivity();
//        return mRootView;
//    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mContent = savedInstanceState.getString(KEY_CONTENT);
        }
    }

    /**
     * 初始化fragment控件
     */
    @AfterViews
    void initValues(){}

    @AfterViews
    void bindEvent() {

    }


    public void setFragment(F f) {
        weakReferenceHandler = new WeakReferenceHandler(f);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_CONTENT, mContent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (weakReferenceHandler != null) {
            weakReferenceHandler.removeCallbacksAndMessages(-1);
            weakReferenceHandler = null;
        }
    }

    /**
     * handler处理信息
     *
     * @param msg
     */
    void handlerMessage(Message msg) {
    }

    protected ImageLoadingListener getImageLoadingListener() {
        return animateFirstListener;
    }



    public boolean onBackPressed() {
        return false;
    }


    /*
	 * (non-Javadoc)
	 *
	 * @see android.support.v4.app.Fragment#setUserVisibleHint(boolean)
	 */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        // TODO Auto-generated method stub
        super.setUserVisibleHint(isVisibleToUser);
        initUI(isVisibleToUser);
    }

    private boolean isFirst = true;

    protected void initUI(final boolean isVisibleToUser) {
        if (weakReferenceHandler != null) {
            weakReferenceHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (getActivity() == null || !isVisibleToUser) {
                        initUI(isVisibleToUser);
                    } else {
                        if(isFirst){
                            weakReferenceHandler.sendEmptyMessageDelayed(MessageHanlder.MESSAGE_HANDLER, 50);
                            isFirst = false;
                        }
//                        else{
//                            weakReferenceHandler.sendEmptyMessageDelayed(MESSAGE_DEFAULT_POSITION, 50);
//                        }

                    }
                }
            }, 200);
        }
    }



}
