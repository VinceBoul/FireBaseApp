package com.google.firebase.codelab.friendlychat.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.google.firebase.codelab.friendlychat.fragments.OneFragment;
import com.google.firebase.codelab.friendlychat.fragments.PlusOneFragment;


/**
 * Created by Vince on 09/11/2016.
 */

public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    Bundle bundle;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        Fragment currentFragment = null;
        switch (index) {
            case 0:
                currentFragment = new OneFragment();
                break;
            case 1:
                currentFragment = new PlusOneFragment();
                break;
        }

        return currentFragment;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}