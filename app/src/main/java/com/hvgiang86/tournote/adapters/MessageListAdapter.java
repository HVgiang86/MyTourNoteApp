package com.hvgiang86.tournote.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.models.Message;


import java.util.List;

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageViewHolder> {
    private List<Message> messageList;
    private Activity activity;

    public MessageListAdapter(List<Message> messageList, Activity activity) {
        this.messageList = messageList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MessageListAdapter.MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        //1: sender. 0: receiver
        switch (viewType) {
            case 1:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_sender,parent,false);
                break;
            case 0:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_receiver,parent,false);
                break;
            default:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_sender,parent,false);
        }
        return new MessageViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        if (messageList.get(position).isSender()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MessageListAdapter.MessageViewHolder holder, int position) {
        String content = messageList.get(position).getContent();
        holder.tvContent.setText(content);
    }

    @Override
    public int getItemCount() {
        return (messageList != null) ? messageList.size() : 0;
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder{
        private TextView tvContent;

        public MessageViewHolder(View itemView) {
            super(itemView);
            this.tvContent = itemView.findViewById(R.id.item_message_tv_content);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
