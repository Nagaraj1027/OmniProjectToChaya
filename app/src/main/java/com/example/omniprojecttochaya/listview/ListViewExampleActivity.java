package com.example.omniprojecttochaya.listview;

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

import java.util.List;


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

    public class RowItem {
        private int imageId;
        private String title;

        public RowItem(int imageId, String title) {
            this.imageId = imageId;
            this.title = title;
        }

        public int getImageId() {
            return imageId;
        }

        public void setImageId(int imageId) {
            this.imageId = imageId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    class DisplayData extends BaseAdapter {
        List<RowItem> rowItems;

        ImageView avatar;
        TextView tvName;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.row_simple_listview, null);

         /*   if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.row_simple_listview, null);
                holder = new DisplayData();
                holder.avatar = (ImageView) convertView.findViewById(R.id.img);
                holder.tvName = (TextView) convertView.findViewById(R.id.tv);
                convertView.setTag(holder);
                Log.e("Hello", "Hello");
            } else {
                holder = (DisplayData) convertView.getTag();
                Log.e("Hello2", "Hello2");
            }*/
            tvName = view.findViewById(R.id.tv);
            avatar = view.findViewById(R.id.img);
        /*    rowItems = (RowItem) getItem(position);
            holder.tvName.setText(rowItems.getTitle());
            holder.avatar.setImageResource(rowItems .getImageId());*/
            return view;
        }
            @Override
            public int getCount(){
                return 10;
            }

            @Override
            public Object getItem (int position){
                return null;
            }

            @Override
            public long getItemId ( int position){
                return 0;
            }


        }
    }

