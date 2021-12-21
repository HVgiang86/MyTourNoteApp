package com.hvgiang86.tournote.models;

import java.util.List;

public class Note {
    private String  noteTitle;
    private String  noteDescription;
    private int     thumbnailImageResource;
    private List<SubNote> notes;

    public Note(String noteTitle, String noteDescription, List<SubNote> notes) {
        this.noteTitle = noteTitle;
        this.noteDescription = noteDescription;
        this.notes = notes;
    }

    public void addSubNote(SubNote note) {
        notes.add(note);
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public int getThumbnailImageResource() {
        return thumbnailImageResource;
    }

    public void setThumbnailImageResource(int thumbnailImageResource) {
        this.thumbnailImageResource = thumbnailImageResource;
    }

    public List<SubNote> getNotes() {
        return notes;
    }

    public void setNotes(List<SubNote> notes) {
        this.notes = notes;
    }
}
