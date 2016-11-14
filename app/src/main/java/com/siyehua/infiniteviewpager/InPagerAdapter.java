package com.siyehua.infiniteviewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * view pager adapter
 * Created by siyehua on 2016/11/14.
 */
public class InPagerAdapter extends PagerAdapter {
    private ArrayList<View> list;

    public InPagerAdapter(ViewPager viewPager, ArrayList<View> list) {
        this.list = list;
        viewPager.setAdapter(this);
        //set the pager in middle so user can not scroll tho end or start.
        viewPager.setCurrentItem(getCount() / 2, false);
    }

    /**
     * we use the max count,so user can not scroll to end or start.
     *
     * @return
     */
    @Override
    public int getCount() {
        int tmp = Integer.MAX_VALUE / list.size();
        tmp = tmp % 2 == 0 ? tmp : tmp - 1;
        return list == null ? 0 : tmp * list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        position = position % list.size();
        container.addView(list.get(position));
        return list.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        position = position % list.size();
        container.removeView(list.get(position));
    }
}
