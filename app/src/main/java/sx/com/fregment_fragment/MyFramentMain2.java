package sx.com.fregment_fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

import sx.com.fragment_adapter.MyExpandListAdapter;
import sx.com.fregment_activity.R;
import sx.com.info.MainInfo;
import sx.com.info.MainTxlInfo;
import sx.com.info.MainTxlTittle;

/**
 * Created by ranran on 2015/8/13.
 */
public class MyFramentMain2 extends Fragment {
    private ExpandableListView expandableListView;
    private List<MainTxlTittle> mainTxlTittleList = new ArrayList<MainTxlTittle>();//tittleList
    private MyExpandListAdapter myExpandListAdapter;
    private List<MainTxlInfo> mainTxlInfos;

    public MyFramentMain2() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentmain2, null);
        findView(view);

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                mainTxlInfos = new ArrayList<MainTxlInfo>();
                mainTxlInfos.add(new MainTxlInfo("新的朋友"));
                mainTxlInfos.add(new MainTxlInfo("群聊"));
                mainTxlInfos.add(new MainTxlInfo("标签"));
                mainTxlInfos.add(new MainTxlInfo("公众号"));
                mainTxlTittleList.add(new MainTxlTittle(mainTxlInfos, "0"));
            }
            if (i ==1) {
                mainTxlInfos = new ArrayList<MainTxlInfo>();
                mainTxlInfos.add(new MainTxlInfo("啊狗"));
                mainTxlInfos.add(new MainTxlInfo("啊猫"));
                mainTxlTittleList.add(new MainTxlTittle(mainTxlInfos, "A"));
            }
            if (i ==2) {
                mainTxlInfos = new ArrayList<MainTxlInfo>();
                mainTxlInfos.add(new MainTxlInfo("B哥"));
                mainTxlInfos.add(new MainTxlInfo("宝贝"));
                mainTxlTittleList.add(new MainTxlTittle(mainTxlInfos, "B"));
            }
            if (i == 3) {
                mainTxlInfos = new ArrayList<MainTxlInfo>();
                mainTxlInfos.add(new MainTxlInfo("肥猪王"));
                mainTxlInfos.add(new MainTxlInfo("飞一脸"));
                mainTxlTittleList.add(new MainTxlTittle(mainTxlInfos, "F"));
            }
        }
        return view;
    }

    //找控件
    private void findView(View view) {
        expandableListView = (ExpandableListView) view.findViewById(R.id.main2_expandableListView);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myExpandListAdapter = new MyExpandListAdapter(mainTxlTittleList, getActivity());
        expandableListView.setAdapter(myExpandListAdapter);
        deleteJt();//去掉剪头和展开每一项
        myExpandListAdapter.notifyDataSetChanged();
    }

    //去掉剪头和展开每一项
    public void deleteJt() {
        expandableListView.setGroupIndicator(null);//去掉箭头
        //展开每一项
        for (int i = 0; i < myExpandListAdapter.getGroupCount(); i++) {
            if(i==0) {

            }
            expandableListView.expandGroup(i);//展开当前项
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
