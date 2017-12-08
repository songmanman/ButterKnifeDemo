package com.open.annotation.fragment;

import android.content.Context;
import android.text.format.DateUtils;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.open.annotation.MessageHanlder;
import com.open.annotation.R;

import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;


/**
 * ****************************************************************************************************************************************************************************
 *
 * @author :fengguangjing
 * @createTime: 2017/12/7 10:31
 * @version:2.10
 * @modifyTime:2017/12/7 10:31
 * @modifyAuthor:fengguangjing
 * @description: ***************************************************************************************************************************************************************************
 **/
//,VH extends ViewHolder<T>,A extends CommonAdapter<T,VH>
@EFragment
public class CommonPullToRefreshListViewFragment  extends  BaseFragment<CommonPullToRefreshListViewFragment>
implements PullToRefreshListView.OnRefreshListener<ListView> {
    @ViewById(R.id.pullrefreshlist)
    PullToRefreshListView mPullToRefreshListView;
//    @Bean
//    A adapter;

//    public static CommonPullToRefreshListViewFragment newInstance(Context mContext,boolean isVisibleToUser) {
//        CommonPullToRefreshListViewFragment fragment = new CommonPullToRefreshListViewFragment_().builder().build();
//        fragment.setFragment(fragment);
//        fragment.mContext = mContext;
//        fragment.setUserVisibleHint(isVisibleToUser);
//        return fragment;
//    }

//    @Override
//    public int getContentViewId() {
//        return R.layout.common_pulltorefresh_listview;
//    }


    @Override
    void initValues() {
        super.initValues();
        mPullToRefreshListView.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
    }

    @Override
    void bindEvent() {
        super.bindEvent();
        mPullToRefreshListView.setOnRefreshListener(this);

    }

    @Override
    public void onRefresh(PullToRefreshBase<ListView> refreshView) {
        String label = DateUtils.formatDateTime(getActivity(), System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);
        // Update the LastUpdatedLabel
        refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);
        // Do work to refresh the list here.
        if (mPullToRefreshListView.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_START) {
            pageNo = 1;
//            weakReferenceHandler.sendEmptyMessage(MessageHanlder.MESSAGE_HANDLER);
        } else if (mPullToRefreshListView.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_END) {
            pageNo++;
//            weakReferenceHandler.sendEmptyMessage(MessageHanlder.MESSAGE_HANDLER);
        }
    }


}
