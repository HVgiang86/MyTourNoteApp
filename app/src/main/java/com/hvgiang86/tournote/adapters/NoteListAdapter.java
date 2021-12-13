package com.hvgiang86.tournote.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.hvgiang86.tournote.R;

import org.w3c.dom.Text;

public class NoteListAdapter extends BaseAdapter {
    private String[] items;
    private Activity activity;
    private int layout;

    public NoteListAdapter(Activity activity, int layout, String[] items) {
        this.items = items;
        this.activity = activity;
        this.layout = layout;
    }

    public static class ViewHolder {
        private CardView cardView;
        private TextView tvCategoryName;
        private TextView tvNumberOfPosts;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gọi Inflater ra để bắt đầu ánh xạ view và data
        LayoutInflater inflater = activity.getLayoutInflater();

        //Đổ dữ liệu vào biến view, view này là item_fruit layout
        convertView = inflater.inflate(layout,null);

        //set text cho từng view trong danh sách với từng item
        TextView nameTextView = (TextView) convertView.findViewById(R.id.item_fruit_tv_fruit);
        nameTextView.setText(items[position]);

        TextView idtextView = (TextView) convertView.findViewById(R.id.item_fruit_tv_id);
        idtextView.setText("ID: " + (position + 1));

        //return kết quả
        return convertView;
    }
}
