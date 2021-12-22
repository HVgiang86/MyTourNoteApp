package com.hvgiang86.tournote.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.models.Note;

import java.util.List;

public class NoteListAdapter extends BaseAdapter {
    private Activity activity;
    private List<Note> noteList;

    public NoteListAdapter(Activity activity, List<Note> noteList) {
        this.activity = activity;
        this.noteList = noteList;
    }

    @Override
    public int getCount() {
        return noteList.size();
    }

    @Override
    public Note getItem(int position) {
        return noteList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.note_item,null);

        TextView noteIdTextView = (TextView) convertView.findViewById(R.id.item_note_tv_note_id);
        TextView noteTitle = (TextView) convertView.findViewById(R.id.item_note_tv_note_title);
        TextView noteDescriptionTextView = (TextView) convertView.findViewById(R.id.item_note_tv_note_description);
        TextView timeMarkTextView = (TextView) convertView.findViewById(R.id.item_note_tv_time_mark);
        TextView noteContentTextView = (TextView) convertView.findViewById(R.id.item_note_tv_note_content);

        noteIdTextView.setText( (position + 1) + "/" + noteList.size());
        noteTitle.setText(noteList.get(position).getNoteTitle());
        noteDescriptionTextView.setText(noteList.get(position).getNoteDescription());

        if (noteList.get(position).getNotes().get(0) != null) {
            timeMarkTextView.setText(noteList.get(position).getNotes().get(0).getTimeMark());
            noteContentTextView.setText(noteList.get(position).getNotes().get(0).getContentNote());
        }
        else {
            timeMarkTextView.setText("empty");
            noteContentTextView.setText(" ");
        }

        //button event handling
        ImageButton editButton = (ImageButton) convertView.findViewById(R.id.item_note_ibt_edit);
        ImageButton shareButton = (ImageButton) convertView.findViewById(R.id.item_note_ibt_share);
        ImageButton deleteButton = (ImageButton) convertView.findViewById(R.id.item_note_ibt_delete);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Edit Button selected!",Toast.LENGTH_SHORT).show();
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Share Button selected!",Toast.LENGTH_SHORT).show();
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Delete Button selected!",Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout itemNote = (LinearLayout) convertView.findViewById(R.id.item_note);
        itemNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, noteList.get(position).getNoteTitle() + " has been selected",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
