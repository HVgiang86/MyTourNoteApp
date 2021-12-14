package com.hvgiang86.tournote.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.MessageListAdapter;
import com.hvgiang86.tournote.models.Message;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    public static final String KEY_SHOW_ABOUT   = "show_what";
    public static final String VALUE_SHOW_ABOUT = "show_about";
    public static final String VALUE_SHOW_HELP  = "show_help";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message("Hello", true));
        messageList.add(new Message("Hi", false));
        messageList.add(new Message("Nice to meet you", true));
        messageList.add(new Message("Nice to meet you too", false));
        messageList.add(new Message("He he", false));
        messageList.add(new Message("I'm Giang from VietNam", true));
        messageList.add(new Message("Oh! I'm David Teo from America", false));
        messageList.add(new Message("Bye!", true));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        /*Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String valueShow = bundle.getString(KEY_SHOW_ABOUT, "null");
            TextView titleView = findViewById(R.id.about_help_title);
            TextView contentView = findViewById(R.id.about_help_content);

            if (valueShow.equals(VALUE_SHOW_ABOUT)) {
                titleView.setText("About");
                contentView.setText(R.string.about_content);
            }
            else if (valueShow.equals(VALUE_SHOW_HELP)) {
                titleView.setText("Help");
                contentView.setText(R.string.help_content);
            }
        }
        else {
            Toast.makeText(this, "Bundle Null!", Toast.LENGTH_SHORT).show();
        }*/


        //Khai bao Recycler View
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.contact_activity_rv_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);;
        //set adapter cho recycler view
        recyclerView.setAdapter(new MessageListAdapter(messageList, this));
        //Khai bao su kien onClick
        //

    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}