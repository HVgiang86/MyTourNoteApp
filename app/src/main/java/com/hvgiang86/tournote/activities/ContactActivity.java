package com.hvgiang86.tournote.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hvgiang86.tournote.R;
import com.hvgiang86.tournote.adapters.NoteListAdapter;

import org.w3c.dom.Text;

public class ContactActivity extends AppCompatActivity {
    public static final String KEY_SHOW_ABOUT   = "show_what";
    public static final String VALUE_SHOW_ABOUT = "show_about";
    public static final String VALUE_SHOW_HELP  = "show_help";

    private static final String[] items = {"lorem", "ipsum", "dolor",
            "sit", "amet", "consectetuer",
            "adipiscing", "elit", "morbi",
            "vel", "ligua", "vitae",
            "arcu", "aliquet", "mollis",
            "eiam", "vel", "erat",
            "placerat", "ante", "porttitor",
            "sodales", "pellentesque", "augue",
            "purus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        //Khai bao list view
        ListView myListView = findViewById(R.id.my_list_view);
        //Khai bao adapter
        NoteListAdapter noteListAdapter = new NoteListAdapter(this, R.layout.item_fruit, items);
        //Gan adapter vao list view
        myListView.setAdapter(noteListAdapter);
        //Khai bao su kien onClick
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ContactActivity.this,"Item selected: " + items[position], Toast.LENGTH_SHORT).show();
                TextView notificationTextView = findViewById(R.id.contact_activity_notification);
                notificationTextView.setText(items[position] + " selected!");
            }
        });
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