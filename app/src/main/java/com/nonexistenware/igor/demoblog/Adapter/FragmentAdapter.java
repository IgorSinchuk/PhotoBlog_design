package com.nonexistenware.igor.demoblog.Adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.nonexistenware.igor.demoblog.Fragment.HomeFragment;
import com.nonexistenware.igor.demoblog.Fragment.UserFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return HomeFragment.getInstance();
        else if (position == 1)
            return UserFragment.getInstance();
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home 1";
            case 1:
                return "User 1";
        }
        return "";
    }
}
