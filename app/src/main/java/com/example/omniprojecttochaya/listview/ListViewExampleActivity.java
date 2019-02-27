package com.example.omniprojecttochaya.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.omniprojecttochaya.R;

public class ListViewExampleActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        lv = findViewById(R.id.lv);

        DisplayData displayData = new DisplayData();
        lv.setAdapter(displayData);
    }

    class DisplayData extends BaseAdapter {


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ImageView avatar;
            TextView tvName;

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.row_simple_listview, null);

            tvName = view.findViewById(R.id.tv);
            avatar = view.findViewById(R.id.img);


            return view;
        }

        @Override
        public int getCount() {
            return 10;
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
}
