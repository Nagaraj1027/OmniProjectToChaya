package com.example.omniprojecttochaya.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.holder.ViewHolder;
import com.example.omniprojecttochaya.model.User;
import com.example.omniprojecttochaya.model.UserData;

import java.util.ArrayList;

public class DisplayData extends BaseAdapter {

    ArrayList<UserData> al_userdata;
    ArrayList<User> al_users;
    Activity activity;
    int i;

    public DisplayData(ArrayList<UserData> al_userdata, Activity activity) {
        this.al_userdata = al_userdata;
        this.activity = activity;
    }

    public DisplayData(ArrayList<User> al_users, Activity activity,int i) {
        this.al_users = al_users;
        this.activity = activity;
        this.i=i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.row_simple_listview1, null);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText(al_userdata.get(position).getCity());
        viewHolder.avatar.setImageResource(R.drawable.ic_launcher_background);
        return convertView;
    }

    @Override
    public int getCount() {
        if (i == 1) {
            return al_users.size();
        } else {
            return al_userdata.size();
        }
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
