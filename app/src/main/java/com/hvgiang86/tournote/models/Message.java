package com.hvgiang86.tournote.models;

public class Message {
    private String content;
    private boolean isSender;

    public Message(String content, boolean isSender) {
        this.content = content;
        this.isSender = isSender;
    }

    public String getContent() {
        return content;
    }

    public boolean isSender() {
        return isSender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(boolean sender) {
        isSender = sender;
    }
}
