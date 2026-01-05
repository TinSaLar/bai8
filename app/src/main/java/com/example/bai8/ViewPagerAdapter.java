package com.example.bai8;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull AppCompatActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) return new HomeFragment();
        if (position == 1) return new FavoriteFragment();
        return new SettingsFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

