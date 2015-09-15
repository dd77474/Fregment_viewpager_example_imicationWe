package sx.com.fragment_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import sx.com.fregment_activity.R;
import sx.com.info.MainTxlTittle;

/**
 * Created by ranran on 2015/8/16.
 */
public class MyExpandListAdapter extends BaseExpandableListAdapter {
    private List<MainTxlTittle> mainTxlTittleList;
    private LayoutInflater layoutInflater;

    public MyExpandListAdapter(List<MainTxlTittle> mainTxlTittleList, Context context) {
        this.mainTxlTittleList = mainTxlTittleList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getGroupCount() {
        return mainTxlTittleList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mainTxlTittleList.get(groupPosition).getMainTxlInfoList().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return mainTxlTittleList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mainTxlTittleList.get(groupPosition).getMainTxlInfoList().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View view = convertView;
        TittleViewHolder tittleViewHolder;
        if (null == view) {
            view = layoutInflater.inflate(R.layout.adapter_txl_expandlist_tittle, null);
            tittleViewHolder = new TittleViewHolder(view);
            view.setTag(tittleViewHolder);
        } else {
            tittleViewHolder = (TittleViewHolder) view.getTag();
        }
        if (groupPosition == 0) {
            tittleViewHolder.tittle_tv.setVisibility(View.GONE);//第一个组返不显示
        }else{
            tittleViewHolder.tittle_tv.setText(mainTxlTittleList.get(groupPosition).getTittle());
        }
        view.setClickable(true);
        return view;


    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view = convertView;
        ContentViewHolder contentViewHolder;
        if (null == view) {
            view = layoutInflater.inflate(R.layout.adapter_txl_expandlist_content, null);
            contentViewHolder = new ContentViewHolder(view);
            view.setTag(contentViewHolder);
        } else {
            contentViewHolder = (ContentViewHolder) view.getTag();
        }
        if (groupPosition != 0) {
            contentViewHolder.content_tv.setText(mainTxlTittleList.get(groupPosition).getMainTxlInfoList().get(childPosition).getName());
        } else {
            if (childPosition == 0) {
                contentViewHolder.imageView.setImageResource(R.drawable.a_4);
            }
            if (childPosition == 1) {
                contentViewHolder.imageView.setImageResource(R.drawable.a_a);
            }
            if (childPosition == 2) {
                contentViewHolder.imageView.setImageResource(R.drawable.a_a);
            }
            if (childPosition == 3) {
                contentViewHolder.imageView.setImageResource(R.drawable.a_9);
            }
            contentViewHolder.content_tv.setText(mainTxlTittleList.get(groupPosition).getMainTxlInfoList().get(childPosition).getName());
        }

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    private static class TittleViewHolder {
        private TextView tittle_tv;

        public TittleViewHolder(View view) {
            this.tittle_tv = (TextView) view.findViewById(R.id.main2_expandablelistview_tittle);

        }
    }

    private static class ContentViewHolder {
        private TextView content_tv;
        private ImageView imageView;

        public ContentViewHolder(View view) {
            this.content_tv = (TextView) view.findViewById(R.id.main2_expandablelistview_content);
            this.imageView = (ImageView) view.findViewById(R.id.main2_expandablelistview_touxiang);
        }
    }
}
