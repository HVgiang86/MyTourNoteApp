package com.hvgiang86.tournote.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.hvgiang86.tournote.fragments.EmptyNoteFragment;
import com.hvgiang86.tournote.fragments.NoteListFragment;
import com.hvgiang86.tournote.models.Category;

import java.util.List;

public class NoteListPagerAdapter extends FragmentStatePagerAdapter {
    private List<Category> categoryList;

    public NoteListPagerAdapter(@NonNull FragmentManager fm, List<Category> categoryList) {
        super(fm);
        this.categoryList = categoryList;
    }

    @Override
    public Fragment getItem(int i) {
        if (categoryList.size() == 0) {
            return new EmptyNoteFragment();
        }
        else {
            return new NoteListFragment(categoryList.get(i).getNoteList());
        }

    }

    @Override
    public int getCount() {
        if (categoryList.size() == 0) {
            return 1;
        }
        else {
            return categoryList.size();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (categoryList.size() == 0) {
            return "Chung Chung";
        }
        else {
            return categoryList.get(position).getCategory();
        }

    }
}
