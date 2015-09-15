package sx.com.fregment_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import sx.com.fragment_adapter.MyAdapterMain;
import sx.com.fregment_activity.R;
import sx.com.info.MainInfo;

/**
 * Created by ranran on 2015/8/13.
 */
public class MyFramentMain1 extends Fragment {
    private ListView lv_main;
    private MyAdapterMain myAdapterMain;
    private List<MainInfo>  mainInfoList=new ArrayList<MainInfo>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentmain1, container, false);
        myAdapterMain=new MyAdapterMain(mainInfoList,getActivity());
        findView(view);
        //往list里加数据
        for(int i=0;i<5;i++){
            if(i==0){
                mainInfoList.add(new MainInfo("肥猪王","肥猪王这个名字是来自于灵感!"));
            }
            if(i==1){
                mainInfoList.add(new MainInfo("德基","肥猪王这个名字是来自于灵感!你好我大号大家好我去"));
            }
            if(i==2){
                mainInfoList.add(new MainInfo("文兄","肥猪王这个名字是来自于灵感!大家好才是真的好啊为客户可完全核电业务"));
            }
            if(i==3){
                mainInfoList.add(new MainInfo("亮哥","肥猪王这个名字是来自于灵感!ask大货车啊四季度或可完全啊的"));
            }
            if(i==4){
                mainInfoList.add(new MainInfo("斗士撇","肥猪王这个名字是来自于灵感!可在DH新疆喀什以后的企业污水"));
            }
        }


        return view;
    }

    private void findView(View view) {
        lv_main= (ListView) view.findViewById(R.id.main1_listView);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lv_main.setAdapter(myAdapterMain);
        myAdapterMain.notifyDataSetChanged();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
