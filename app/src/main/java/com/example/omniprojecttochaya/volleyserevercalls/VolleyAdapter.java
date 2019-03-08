package com.example.omniprojecttochaya.volleyserevercalls;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.model.Volley_pojo1;

import java.util.ArrayList;

/**
 * Created by nagaraj on 11/02/2019.
 */

public class VolleyAdapter extends BaseAdapter {

    private Activity context;
    private ArrayList<Volley_pojo1> al;

    public VolleyAdapter(Activity context, ArrayList<Volley_pojo1> al) {
        super();
        this.context = context;
        this.al = al;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.volley_row_layout, null, true);

        Log.d("al.size()", al.size() + "");
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewEmail);
       // ImageView userImage = (ImageView) listViewItem.findViewById(R.id.textViewEmail);

        textViewId.setText(al.get(position).getId());
        textViewName.setText(al.get(position).getFirst_name());
        textViewEmail.setText(al.get(position).getLast_name());
        //userimage.setText(al.get(position).getAvatar());

        return listViewItem;
    }
}