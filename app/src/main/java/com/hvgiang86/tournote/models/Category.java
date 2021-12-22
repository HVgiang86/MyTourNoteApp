package com.hvgiang86.tournote.models;

import java.util.List;

public class Category {
    private String category;
    private List<Note> noteList;

    public Category(String category, List<Note> noteList) {
        this.category = category;
        this.noteList = noteList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }
}
