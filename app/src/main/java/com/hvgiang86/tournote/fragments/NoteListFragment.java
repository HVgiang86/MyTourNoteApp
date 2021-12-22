package com.hvgiang86.tournote.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.NoteListAdapter;
import com.hvgiang86.tournote.models.Note;
import com.hvgiang86.tournote.models.SubNote;

import java.util.ArrayList;
import java.util.List;

public class NoteListFragment extends ListFragment {
    private List<Note> noteList;

    public NoteListFragment() {
        // Required empty public constructor
    }

    public NoteListFragment (List<Note> noteList) {
        this.noteList = noteList;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_note_list, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        NoteListAdapter noteListAdapter = new NoteListAdapter(getActivity(),noteList);
        getListView().setAdapter(noteListAdapter);

    }
}