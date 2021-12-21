package com.hvgiang86.tournote.models;

public class SubNote {
    private String timeMark;
    private String contentNote;

    public SubNote(String timeMark, String contentNote) {
        this.timeMark = timeMark;
        this.contentNote = contentNote;
    }

    public String getTimeMark() {
        return timeMark;
    }

    public void setTimeMark(String timeMark) {
        this.timeMark = timeMark;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String contentNote) {
        this.contentNote = contentNote;
    }
}
