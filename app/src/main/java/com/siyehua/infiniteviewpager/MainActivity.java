package com.siyehua.infiniteviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private InPagerAdapter inPagerAdapter;
    private ArrayList<View> views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.vp_ad);

        views = new ArrayList<>();
        View tmp;
        views.add(tmp = LayoutInflater.from(this).inflate(R.layout.item, null));
        tmp.setBackgroundResource(R.drawable._001);
        ((TextView) tmp.findViewById(R.id.content)).setText(1 + "");

        views.add(tmp = LayoutInflater.from(this).inflate(R.layout.item, null));
        tmp.setBackgroundResource(R.drawable._002);
        ((TextView) tmp.findViewById(R.id.content)).setText(2 + "");

        views.add(tmp = LayoutInflater.from(this).inflate(R.layout.item, null));
        tmp.setBackgroundResource(R.drawable._003);
        ((TextView) tmp.findViewById(R.id.content)).setText(3 + "");

        views.add(tmp = LayoutInflater.from(this).inflate(R.layout.item, null));
        tmp.setBackgroundResource(R.drawable._004);
        ((TextView) tmp.findViewById(R.id.content)).setText(4 + "");

        views.add(tmp = LayoutInflater.from(this).inflate(R.layout.item, null));
        tmp.setBackgroundResource(R.drawable._005);
        ((TextView) tmp.findViewById(R.id.content)).setText(5 + "");


        //init and set adapter
        inPagerAdapter = new InPagerAdapter(viewPager, views);
    }
}
