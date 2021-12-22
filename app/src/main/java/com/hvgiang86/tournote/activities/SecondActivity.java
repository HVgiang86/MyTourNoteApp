package com.hvgiang86.tournote.activities;

import static com.hvgiang86.tournote.activities.MainActivity.categoryList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.NoteListPagerAdapter;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);

        fragmentAdditionControl();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void fragmentAdditionControl() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.third_activity_view_paper);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.third_activity_tab_layout);
        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        PagerAdapter pagerAdapter = new NoteListPagerAdapter(fragmentManager,categoryList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager,true);
    }
}
