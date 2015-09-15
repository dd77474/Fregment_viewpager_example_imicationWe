package sx.com.fregment_activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sx.com.fregment_fragment.MyFramentCheck1;
import sx.com.fregment_fragment.MyFramentCheck2;
import sx.com.fregment_fragment.MyFramentCheck3;
import sx.com.fregment_fragment.MyFramentCheck4;
import sx.com.fregment_fragment.MyFramentMain1;
import sx.com.fregment_fragment.MyFramentMain2;
import sx.com.fregment_fragment.MyFramentMain3;
import sx.com.fregment_fragment.MyFramentMain4;
import sx.com.viewpager_adapter.FragementViewPagerAdapter;


public class MainActivity extends FragmentActivity {
    private android.support.v4.app.FragmentManager fm;
//    private FrameLayout frameLayout;
    private ViewPager viewPager;
    private int framentType;
    private TextView tv1, tv2, tv3, tv4;
    private List<Fragment> flist = new ArrayList<Fragment>();
    private FragementViewPagerAdapter fragPagerAdapter;
    private android.support.v4.app.FragmentTransaction ft;
//    private FragTpye type;
//
//    public FragTpye getType() {
//        return type;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        viewPager=this.findViewById(R.id)
     fm = getSupportFragmentManager();
        findView();
        bangding();
        starListen();
//        //设置type
//        type=new  FragTpye();
//        type.setFtp(1);
//        framentType=type.getFtp();
  /*      ft=fm.beginTransaction();
        ft.add(R.id.frameLatout, myFrament);
//        ft.replace(android.R.id.content,myFrament);
        ft.commit();*/
    }

    private void findView() {
//        frameLayout = (FrameLayout) this.findViewById(R.id.frameLatout_main);
        viewPager = (ViewPager) this.findViewById(R.id.main_viewpager);
        tv1 = (TextView) findViewById(R.id.fragment_check__tv_wx);
        tv2 = (TextView) findViewById(R.id.fragment_check__tv_txl);
        tv3 = (TextView) findViewById(R.id.fragment_check__tv_fx);
        tv4 = (TextView) findViewById(R.id.fragment_check__tv_wo);
        flist.add(new MyFramentMain1());
        flist.add(new MyFramentMain2());
        flist.add(new MyFramentMain3());
        flist.add(new MyFramentMain4());
    }

    private void starListen() {
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
                fragPagerAdapter.notifyDataSetChanged();
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_check, new MyFramentCheck1());
                ft.commit();
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
                fragPagerAdapter.notifyDataSetChanged();
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_check, new MyFramentCheck2());
                ft.commit();
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
                fragPagerAdapter.notifyDataSetChanged();
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_check, new MyFramentCheck3());
                ft.commit();
            }

        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft = fm.beginTransaction();
                ft.replace(R.id.frameLatout_check, new MyFramentCheck4());
                ft.commit();
                viewPager.setCurrentItem(3);
                fragPagerAdapter.notifyDataSetChanged();
            }
        });
/*        frameLayout.setOnTouchListener(new View.OnTouchListener() {
                                           private float startX, startY, offsetX, offsetY;//X Y上的两点和XY上的偏移

                                           @Override
                                           public boolean onTouch(View v, MotionEvent event) {

                                               switch (event.getAction()) {
                                                   case MotionEvent.ACTION_DOWN:
                                                       startX = event.getX();
                                                       startY = event.getY();
                                                       break;
                                                   case MotionEvent.ACTION_UP:
                                                       offsetX = event.getX() - startX;
                                                       offsetY = event.getY() - startY;
                                                       if (Math.abs(offsetX) > Math.abs(offsetY)) {//判断是水平还是垂直
                                                           if (offsetX < -5) {
                                                               listen_Left();
                                                           } else if (offsetX > 5) {
                                                               listen_Right();
                                                           }
                                                       }
                                                       break;
                                               }
                                               return true;//必须用成TRUE
                                           }
                                       }
        );*/
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        ft = fm.beginTransaction();
                        ft.replace(R.id.frameLatout_check, new MyFramentCheck1());
                        ft.commit();
                        break;
                    case 1:
                        ft = fm.beginTransaction();
                        ft.replace(R.id.frameLatout_check, new MyFramentCheck2());
                        ft.commit();
                        break;
                    case 2:
                        ft = fm.beginTransaction();
                        ft.replace(R.id.frameLatout_check, new MyFramentCheck3());
                        ft.commit();
                        break;
                    case 3:
                        ft = fm.beginTransaction();
                        ft.replace(R.id.frameLatout_check, new MyFramentCheck4());
                        ft.commit();
                        break;
                }


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void listen_Left() {

    }

    private void listen_Right() {

    }


    private void bangding() {
        fragPagerAdapter= new FragementViewPagerAdapter(getSupportFragmentManager(), flist);
        viewPager.setAdapter(fragPagerAdapter);
//        ft = fm.beginTransaction();
//        ft.remove(new MyFramentCheck1());
//        ft.commit();
    /*     //添加底部按钮
        ft = fm.beginTransaction();
        ft.add(R.id.frameLatout_check, new MyFramentCheck1());
        ft.commit();*/
     /*   ft = fm.beginTransaction();
        ft.add(R.id.frameLatout_main, new MyFramentMain1());
//        if(null!=(FrameLayout) this.findViewById(R.id.frameLatout_check)) {
        ft.add(R.id.frameLatout_check, new MyFramentCheck1());*/
//        }else{
//            ft.add(R.id.frameLatout_check_land, new MyFramentCheck1());//横屏
//        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        int id=item.getItemId();
//        switch (id){
//            case R.id.action_settings:
//                 item.setIcon(R.drawable.title_search_home_page);
//            break;
//        }
        return super.onOptionsItemSelected(item);
    }
}
