package sx.com.fregment_fragment;

import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sx.com.fregment_activity.R;

/**
 * Created by ranran on 2015/8/13.
 */
public class MyFramentCheck4 extends Fragment {
    private TextView tv_wx,tv_txl, tv_fx;
    private android.support.v4.app.FragmentManager fm;
    private android.support.v4.app.FragmentTransaction ft;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_check4, container, false);
        findView(view);//找控件
        return view;
    }
    //找控件
    private void findView(View view) {
        tv_wx = (TextView) view.findViewById(R.id.fragment_check__tv_wx);
        tv_txl = (TextView) view.findViewById(R.id.fragment_check__tv_txl);
        tv_fx = (TextView) view.findViewById(R.id.fragment_check__tv_fx);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fm = getActivity().getSupportFragmentManager();
//        startListen();//监听
    }

 /*   //监听
    private void startListen() {
        tv_wx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_main, new MyFramentMain1());
                ft.replace(R.id.frameLatout_check, new MyFramentCheck1());
                ft.commit();
            }
        });
        tv_txl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_main, new MyFramentMain2());
                ft.replace(R.id.frameLatout_check, new MyFramentCheck2());
                ft.commit();
            }
        });
        tv_fx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_main, new MyFramentMain3());
                ft.replace(R.id.frameLatout_check, new MyFramentCheck3());
                ft.commit();
            }
        });
    }*/
    @Override
    public void onPause() {
        super.onPause();
    }
}
