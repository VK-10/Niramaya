package com.example.niramaya_health;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Home_Page();
            case 1:
                return new Patient_List();
            case 2:
                return new Upcoming_appointment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
