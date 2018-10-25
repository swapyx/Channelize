package com.apps.swapyx.channelize.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.apps.swapyx.channelize.Fragments.TaskListFragment;
import com.apps.swapyx.channelize.Fragments.TimerFragment;

/**
 * Created by SwapyX on 24-07-2017.
 */

public class SwipeAdapter extends FragmentPagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TaskListFragment();
            case 1:
                return new TimerFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
