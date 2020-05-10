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

import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

public class Main3Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
private DrawerLayout drawerLayout;
private NavigationView navigationView;
private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mHandler=new Handler();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolBar=findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        drawerLayout=findViewById(R.id.dlayout);
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        mHandler.postDelayed(() -> {
            drawerLayout.openDrawer(GravityCompat.START);

        },1000);

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
        super.onBackPressed();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.programs: {
                
                startActivity(new Intent(Main3Activity.this, MainMenuActivity.class));
                drawerLayout.closeDrawer(GravityCompat.START);

            }break;
            case R.id.music: {
                startActivity(new Intent(Main3Activity.this, SongsActivity.class));
                drawerLayout.closeDrawer(GravityCompat.START);

            }break;
        }
        return true;
    }
}
