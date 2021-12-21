package com.hvgiang86.tournote.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.NoteListAdapter;
import com.hvgiang86.tournote.models.Note;
import com.hvgiang86.tournote.models.SubNote;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<Note> noteList = new ArrayList<>();

        List<SubNote> subNoteList = new ArrayList<>();
        subNoteList.add(new SubNote("30/2/2020", "Nội dung này được note lại khi tôi tới nơi này!"));

        for (int i = 0; i < 3; i++) {

            noteList.add(new Note("Note thu " + (i + 1), "Day la phan mo ta cua note nay", subNoteList));
        }

        ListView noteListView = findViewById(R.id.second_activity_note_list);
        NoteListAdapter noteListAdapter = new NoteListAdapter(this, noteList);

        noteListView.setAdapter(noteListAdapter);

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
}