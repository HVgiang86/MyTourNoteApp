package com.hvgiang86.tournote.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.hvgiang86.tournote.R;

import org.w3c.dom.Text;

public class ContactActivity extends AppCompatActivity {
    public static final String KEY_SHOW_ABOUT   = "show_what";
    public static final String VALUE_SHOW_ABOUT = "show_about";
    public static final String VALUE_SHOW_HELP  = "show_help";
    public static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Intent intent = getIntent();
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
        }

        count++;
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