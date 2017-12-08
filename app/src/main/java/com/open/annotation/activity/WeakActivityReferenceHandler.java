//package com.open.annotation.activity;
//
//import android.annotation.SuppressLint;
//import android.os.Build;
//import android.os.Handler;
//import android.os.Message;
//
//
//import java.lang.ref.WeakReference;
//
///**
// * ****************************************************************************************************************************************************************************
// *
// * @author :fengguangjing
// * @createTime: 2017/12/7  15:05
// * @version:2.10
// * @modifyTime:2017/12/7 15:05
// * @modifyAuthor:fengguangjing
// * @description: *************************************************************************************************************************************************************************
// **/
//
//public class WeakActivityReferenceHandler extends Handler {
//    WeakReference<BaseAnnotationActivity> weakReferenceHandler;
//
//    public WeakActivityReferenceHandler(BaseAnnotationActivity activity) {
//        weakReferenceHandler = new WeakReference<BaseAnnotationActivity>(activity);
//    }
//
//    @SuppressLint("NewApi") @Override
//    public void handleMessage(Message msg) {
//        BaseAnnotationActivity activity = weakReferenceHandler.get();
//        if (activity != null && !activity.isFinishing()) {
//            if(Build.VERSION.SDK_INT>Build.VERSION_CODES.JELLY_BEAN_MR1){
//                if(!activity.isDestroyed() ){
//                    activity.handleMessage(msg);
//                    super.handleMessage(msg);
//                }
//            }else{
//                activity.handleMessage(msg);
//                super.handleMessage(msg);
//            }
//        }
//    }
//}
