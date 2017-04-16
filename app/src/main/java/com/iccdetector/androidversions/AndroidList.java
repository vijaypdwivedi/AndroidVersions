package com.iccdetector.androidversions;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vijay on 4/16/2017.
 */

public class AndroidList extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.version_list);

        ArrayList<AndroidVersion> androidVersionArrayList = new ArrayList<AndroidVersion>();


        androidVersionArrayList.add(new AndroidVersion("Nougat","Android 7.0",R.drawable.nougat));
        androidVersionArrayList.add(new AndroidVersion("Marshmallow","Android 6.0",R.drawable.marshmallow));

        androidVersionArrayList.add(new AndroidVersion("Lollipop","Android 5.0 – 5.1.1", R.drawable.lollipop));
        androidVersionArrayList.add(new AndroidVersion("Kit Kat"," Android 4.4 – 4.4.4",R.drawable.kitkat));

        androidVersionArrayList.add(new AndroidVersion("Jelly Bean","Android 4.1 – 4.3.1",R.drawable.jelly_bean));
        androidVersionArrayList.add(new AndroidVersion("Ice Cream Sandwich","Android 4.0 – 4.0.4", R.drawable.ice_cream));

        androidVersionArrayList.add(new AndroidVersion("Honeycomb","Android 3.0 – 3.2.6", R.drawable.honeycomb));
        androidVersionArrayList.add(new AndroidVersion("Gingerbread","Android 2.3 – 2.3.7", R.drawable.gingerbread));

        androidVersionArrayList.add(new AndroidVersion("Froyo"," Android 2.2 – 2.2.3", R.drawable.froyo ));
        androidVersionArrayList.add(new AndroidVersion("Eclair", "Android 2.0 – 2.1", R.drawable.eclair ));

        androidVersionArrayList.add(new AndroidVersion("Donut","Android 1.6", R.drawable.donut));
        androidVersionArrayList.add(new AndroidVersion("Cupcake", "Android 1.5",R.drawable.cupcake));

        AndroidVersionAdapter androidVersionAdapter = new AndroidVersionAdapter(this,androidVersionArrayList);

        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(androidVersionAdapter);


    }
}
