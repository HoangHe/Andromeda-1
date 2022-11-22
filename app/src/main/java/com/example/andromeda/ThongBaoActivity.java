package com.example.andromeda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ThongBaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Thông Báo");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar_thong_bao,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())  {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.icon_search:
                startActivity(new Intent(ThongBaoActivity.this, TimKiemActivity.class));
                return true;
            case R.id.icon_profile:
                startActivity(new Intent(ThongBaoActivity.this, ProfileActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}