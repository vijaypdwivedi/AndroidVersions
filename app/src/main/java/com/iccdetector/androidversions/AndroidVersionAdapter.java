package com.iccdetector.androidversions;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vijay on 4/16/2017.
 */

public class AndroidVersionAdapter extends ArrayAdapter<AndroidVersion> {

    public AndroidVersionAdapter(Context context,List<AndroidVersion> objects) {
        super(context, 0, objects);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;

        if(listView == null){

            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        AndroidVersion androidv = getItem(position);
        TextView androidName =(TextView)listView.findViewById(R.id.name);
        androidName.setText(androidv.getAndroidName().toString());

        TextView androidVersion = (TextView) listView.findViewById(R.id.version);
        androidVersion.setText(androidv.getAndroidVersion().toString());

        ImageView andoirdLogo =(ImageView) listView.findViewById(R.id.logo);
        andoirdLogo.setImageResource(androidv.getAndroidLogo());

        return listView;
    }
}
