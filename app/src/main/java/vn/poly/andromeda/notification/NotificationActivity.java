package vn.poly.andromeda.notification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import vn.poly.andromeda.R;
import vn.poly.andromeda.profile.ProfileActivity;
import vn.poly.andromeda.search.SearchActivity;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
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
                startActivity(new Intent(NotificationActivity.this, SearchActivity.class));
                return true;
            case R.id.icon_profile:
                startActivity(new Intent(NotificationActivity.this, ProfileActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}