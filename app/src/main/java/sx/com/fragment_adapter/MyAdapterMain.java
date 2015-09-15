package sx.com.fragment_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import sx.com.fregment_activity.R;
import sx.com.info.MainInfo;

/**
 * Created by ranran on 2015/8/16.
 */
public class MyAdapterMain extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<MainInfo> mainInfoList;

    public MyAdapterMain(List<MainInfo> mainInfoList, Context context) {
        this.mainInfoList = mainInfoList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mainInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return mainInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (null == view) {
            view = layoutInflater.inflate(R.layout.adapter_main1, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_name.setText(mainInfoList.get(position).getName());
        viewHolder.tv_content.setText(mainInfoList.get(position).getContent());
        return view;
    }

    private class ViewHolder {
        private TextView tv_name, tv_content;

        public ViewHolder(View view) {
            tv_name= (TextView) view.findViewById(R.id.adapter_main_name);
            tv_content=(TextView) view.findViewById(R.id.adapter_main_content);
        }
    }
}
