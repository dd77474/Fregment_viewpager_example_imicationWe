package sx.com.viewpager_adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ranran on 2015/8/20.
 */
public class FragementViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    public FragementViewPagerAdapter(FragmentManager fm,List<Fragment>  fragmentList){
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
