package com.hvgiang86.tournote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

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
            if (!valueShow.equals("null")) {
                Toast.makeText(this, "Show value: " + valueShow, Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Get wrong value from bundle", Toast.LENGTH_SHORT).show();
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