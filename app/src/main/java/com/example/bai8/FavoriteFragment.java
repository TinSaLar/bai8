package com.example.bai8;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FavoriteFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {
        TextView tv = new TextView(getContext());
        tv.setText("FAVORITE TAB – Yêu thích");
        tv.setTextSize(20);
        tv.setPadding(30, 30, 30, 30);

        View layout = new View(getContext());
        layout.setBackgroundColor(android.graphics.Color.parseColor("#FFC107")); // Vàng
        return tv;
    }
}
