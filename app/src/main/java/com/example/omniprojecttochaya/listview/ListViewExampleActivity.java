package com.example.omniprojecttochaya.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.omniprojecttochaya.R;

import com.example.omniprojecttochaya.adapters.DisplayData;
import com.example.omniprojecttochaya.holder.ViewHolder;
import com.example.omniprojecttochaya.model.UserData;

import java.util.ArrayList;
import java.util.List;


public class ListViewExampleActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<UserData> al_userdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        lv = findViewById(R.id.lv);

        createListdata();

        DisplayData displayData = new DisplayData(al_userdata, ListViewExampleActivity.this);
        lv.setAdapter(displayData);
    }

    void createListdata() {

        al_userdata = new ArrayList<UserData>();

        for (int i = 0; i < 3; i++) {

            UserData userData = new UserData();
            userData.setCity("Hyderabad" + i);
            userData.setCountry("India" + i);
           /* if (i == 0) {
                userData.setCity("Hyderabad");
                userData.setCountry("India");
            }
            if (i == 1) {
                userData.setCity("Bangalore");
                userData.setCountry("India");
            }

            if (i == 2) {
                userData.setCity("Delhi");
                userData.setCountry("India");
            }*/

            al_userdata.add(userData);
        }
    }

    /*class DisplayData extends BaseAdapter {

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder viewHolder;

            if (convertView == null) {
                LayoutInflater layoutInflater = getLayoutInflater();
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
            return al_userdata.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
    }*/

    /*private class ViewHolder {
        ImageView avatar;
        TextView tvName;

        private ViewHolder(View view) {
            tvName = (TextView) view.findViewById(R.id.tvName);
            avatar = (ImageView) view.findViewById(R.id.avatar);

        }

    }*/
}


