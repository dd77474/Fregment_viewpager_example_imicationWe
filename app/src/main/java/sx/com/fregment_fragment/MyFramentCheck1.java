package sx.com.fregment_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sx.com.fregment_activity.R;
import sx.com.utils.FragTpye;

/**
 * Created by ranran on 2015/8/13.
 */
public class MyFramentCheck1 extends Fragment {
    private TextView tv_txl, tv_fx, tv_wo;
    private android.support.v4.app.FragmentManager fm;
    private android.support.v4.app.FragmentTransaction ft;
    private FragTpye fragTpye;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check1, container, false);
        findView(view);//找控件
        return view;
    }

    //找控件
    private void findView(View view) {
        tv_txl = (TextView) view.findViewById(R.id.fragment_check__tv_txl);
        tv_fx = (TextView) view.findViewById(R.id.fragment_check__tv_fx);
        tv_wo = (TextView) view.findViewById(R.id.fragment_check__tv_wo);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fm = getActivity().getSupportFragmentManager();
//        startListen();//监听
    }

    //监听
  /*  private void startListen() {
        tv_txl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
//                ft.replace(R.id.frameLatout_main, new MyFramentMain2());
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
        tv_wo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_main, new MyFramentMain4());
                ft.replace(R.id.frameLatout_check, new MyFramentCheck4());
                ft.commit();
            }
        });
    }*/

    @Override
    public void onPause() {
        super.onPause();
    }
}
