//package com.open.annotation;
//
//import android.os.PersistableBundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.Window;
//import android.widget.ListView;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//
//import com.open.annotation.activity.CommonTitleBarActivity;
//import com.open.annotation.adapter.MainAdapter;
//import com.open.annotation.bean.CommonBean;
//import com.open.annotation.fragment.MainPullFragment;
//
//import org.androidannotations.annotations.EActivity;
//
//import java.util.ArrayList;
//
//
//@EActivity
//public class MainActivity extends CommonTitleBarActivity<CommonBean> {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        addContentView(R.layout.activity_main);
//    }
//
//    @Override
//    public void initValues() {
//        setCenterTextValue("ssss");
//    }
//
//    @Override
//    public void addfragment() {
//        Fragment fragment = MainPullFragment.newInstance(this,true);
//        getSupportFragmentManager().beginTransaction().replace(R.id.layout_main, fragment).commit();
//    }
//}
