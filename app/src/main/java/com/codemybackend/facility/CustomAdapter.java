package com.codemybackend.facility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class CustomAdapter extends BaseAdapter {

    private List<Response.RecordsBean> item;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, List<Response.RecordsBean> item) {
        this.item = item;
        this.context = context;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.each_result_item, viewGroup, false);

        Response.RecordsBean item = (Response.RecordsBean) getItem(i);

        TextView textView = (TextView) rowView.findViewById(R.id.list_item_text);

        textView.setText(item.getH_name());
        return rowView;
    }
}
