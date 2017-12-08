//package com.open.annotation;
//
//import android.graphics.Bitmap;
//import android.view.View;
//import android.widget.ImageView;
//
//import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
//import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
//
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * ****************************************************************************************************************************************************************************
// *
// * @author :fengguangjing
// * @createTime: 2017/12/7  15:08
// * @version:2.10
// * @modifyTime:2017/12/7 15:08
// * @modifyAuthor:fengguangjing
// * @description: *************************************************************************************************************************************************************************
// **/
//
//public   class AnimateFirstDisplayListener extends SimpleImageLoadingListener {
//    public static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());
//
//    @Override
//    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
//        if (loadedImage != null) {
//            ImageView imageView = (ImageView) view;
//            boolean firstDisplay = !displayedImages.contains(imageUri);
//            if (firstDisplay) {
//                FadeInBitmapDisplayer.animate(imageView, 500);
//                displayedImages.add(imageUri);
//            }
//        }
//    }
//}
