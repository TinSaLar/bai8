package com.example.bai8;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {
        TextView tv = new TextView(getContext());
        tv.setText("SETTINGS TAB – Cài đặt");
        tv.setTextSize(20);
        tv.setPadding(30, 30, 30, 30);

        View layout = new View(getContext());
        layout.setBackgroundColor(android.graphics.Color.parseColor("#2196F3")); // Xanh dương
        return tv;
    }
}
