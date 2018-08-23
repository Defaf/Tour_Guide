package com.dhaffaf.jeddahguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by WIN8 on 25/12/17.
 */

public class MyPager  extends FragmentPagerAdapter {
    /**
     * @param fm
     */
    public MyPager(FragmentManager fm) {
        super(fm);
    }

    /**
     *
     * @param position tab position
     * @return null if there is no tab
     */
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                Education learn = new Education();
                return learn;
            case 1:
                Historical history = new Historical();
                return history;
            case 2:
                Food eat = new Food();
                return eat;
            case 3:
                Fun play = new Fun();
                return play;
        }
        return null;
    }
    //show the 4 tabs
    @Override
    public int getCount() {
        return 4;
    }
}
