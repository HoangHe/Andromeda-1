package vn.poly.andromeda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import vn.poly.andromeda.notification.NotificationActivity;
import vn.poly.andromeda.profile.ProfileActivity;
import vn.poly.andromeda.search.SearchActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        // Định dạng màu cho Actionbar
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));
        // Hiện Thị Logo
        actionBar.setLogo(R.mipmap.ic_launcher);
        actionBar.setDisplayUseLogoEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.icon_search:
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                return true;
            case R.id.icon_profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                return true;
            case R.id.icon_thong_bao:
                startActivity(new Intent(MainActivity.this, NotificationActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}