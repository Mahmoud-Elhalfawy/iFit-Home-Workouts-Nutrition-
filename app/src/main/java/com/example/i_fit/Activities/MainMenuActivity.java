
package com.example.i_fit.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

public class MainMenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    GridView gridView;
    int[] images = {R.drawable.circlecroppedd, R.drawable.foodcroppedd, R.drawable.musiccropped, R.drawable.progressp, R.drawable.contact};
    String[] texts = {"Training Programs", "Nutrition", "Music", "Track Progress", "Contact Us"};
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        Toolbar toolBar=findViewById(R.id.toolbarm);
        setSupportActionBar(toolBar);
        drawerLayout=findViewById(R.id.dlayoutm);
        navigationView=findViewById(R.id.nav_viewm);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            switch (position){
                case 0:
                    startActivity(new Intent(MainMenuActivity.this,TabataDaysActivity.class));
                    break;
                case 2:
                    startActivity(new Intent(MainMenuActivity.this,SongsActivity.class));
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.programs: {
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(MainMenuActivity.this, TabataDaysActivity.class));

            }break;
            case R.id.music: {
                drawerLayout.closeDrawer(GravityCompat.START);

                startActivity(new Intent(MainMenuActivity.this, SongsActivity.class));

            }break;
        }
        return true;
    }


    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.trial, null);

            ImageView imageView = view1.findViewById(R.id.imageView);
            imageView.setImageResource(images[position]);

            TextView textView = view1.findViewById(R.id.textView);
            textView.setText(texts[position]);

            return view1;
        }

    }
}
