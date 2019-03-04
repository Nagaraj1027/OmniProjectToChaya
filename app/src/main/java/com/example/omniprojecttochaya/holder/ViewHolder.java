package com.example.omniprojecttochaya.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.omniprojecttochaya.R;

public class ViewHolder {

    public ImageView avatar;
    public TextView tvName;

    public ViewHolder(View view) {
        tvName = (TextView) view.findViewById(R.id.tvName);
        avatar = (ImageView) view.findViewById(R.id.avatar);

    }

}

