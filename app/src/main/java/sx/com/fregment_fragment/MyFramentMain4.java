package sx.com.fregment_fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sx.com.fregment_activity.R;

/**
 * Created by ranran on 2015/8/13.
 */
public class MyFramentMain4 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentmain4, container, false);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
