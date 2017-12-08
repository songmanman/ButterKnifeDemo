//package com.open.annotation.fragment;
//
//import android.os.Handler;
//import android.os.Message;
//
//import java.lang.ref.WeakReference;
//
///**
// * ****************************************************************************************************************************************************************************
// * handler弱引用
// *
// * @author :fengguangjing
// * @createTime: 2017/12/7  14:31
// * @version:2.10
// * @modifyTime:2017/12/7 14:31
// * @modifyAuthor:fengguangjing
// * @description: *************************************************************************************************************************************************************************
// **/
//
//public class WeakReferenceHandler<F extends BaseFragment> extends Handler {
//    WeakReference<F> weakReferenceHandler;
//
//    public WeakReferenceHandler(F fragment) {
//        weakReferenceHandler = new WeakReference<F>(fragment);
//    }
//
//    @Override
//    public void handleMessage(Message msg) {
//        F fragment = weakReferenceHandler.get();
//        if (fragment != null && fragment.isVisible() && fragment.getUserVisibleHint()) {
//            fragment.handlerMessage(msg);
//            super.handleMessage(msg);
//        }
//    }
//}
