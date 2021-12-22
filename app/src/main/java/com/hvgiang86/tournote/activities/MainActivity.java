package com.hvgiang86.tournote.activities;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.NoteListPagerAdapter;
import com.hvgiang86.tournote.models.Category;
import com.hvgiang86.tournote.models.Note;
import com.hvgiang86.tournote.models.SubNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TourNote_MainActivity";
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    public static List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"***************main Activity on creat!");

//        init item list
        categoryList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {

            List<Note> noteList = new ArrayList<>();
            List<SubNote> subNoteList = new ArrayList<>();
            subNoteList.add(new SubNote("30/2/2020", "Nội dung này được note lại khi tôi tới nơi này!"));

            for (int j = 0; j < random.nextInt(5) + 1; j++) {

                noteList.add(new Note("Note thu " + (j + 1), "Day la phan mo ta cua note nay", subNoteList));
            }

            String categoryName = null;
            switch (i) {
                case 0:
                    categoryName = "Gà";
                    break;
                case 1:
                    categoryName = "Vịt";
                    break;
                case 2:
                    categoryName = "Chó";
                    break;
                case 3:
                    categoryName = "Mèo";
                    break;
            }

            categoryList.add(new Category(categoryName,noteList));
        }


//        Drawer Layout
        drawerLayout = findViewById(R.id.main_activity_drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);

        //        Action Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setElevation(0);

//        List Tab Layout
        fragmentAdditionControl();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_action,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(this, "Search button selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Intent intent = new Intent(this, ContactActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(ContactActivity.KEY_SHOW_ABOUT,ContactActivity.VALUE_SHOW_ABOUT);
                intent.putExtras(bundle);

                startActivity(intent);
                return true;
            case R.id.help:
                intent = new Intent(this, ContactActivity.class);
                bundle = new Bundle();
                bundle.putString(ContactActivity.KEY_SHOW_ABOUT,ContactActivity.VALUE_SHOW_HELP);
                intent.putExtras(bundle);

                startActivity(intent);
                return true;
            case R.id.second_activity:
                intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void fragmentAdditionControl() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_activity_view_paper);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.main_activity_tab_layout);
        FragmentManager fragmentManager = getSupportFragmentManager();

        PagerAdapter pagerAdapter = new NoteListPagerAdapter(fragmentManager,categoryList);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager,true);
    }
}