package com.example.i_fit.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.i_fit.Adapter.DaysAdapter;
import com.example.i_fit.Model.DaysItem;
import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class TabataDaysActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
RecyclerView recyclerView;
DaysAdapter adapter;
List<DaysItem> listItems;
DrawerLayout drawerLayout;
NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);
        recyclerView=findViewById(R.id.recView);
        Toolbar toolBar=findViewById(R.id.toolbar3);
        setSupportActionBar(toolBar);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fillList();
        adapter=new DaysAdapter(this,listItems);
        recyclerView.setAdapter(adapter);
        drawerLayout=findViewById(R.id.dlayout3);
        navigationView=findViewById(R.id.nav_view3);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

public void fillList(){
        listItems=new ArrayList<>();
        DaysItem monday=new DaysItem("Metabolic Monday (Total Body)",R.drawable.metabolic,1);
        listItems.add(monday);
    DaysItem tuesday=new DaysItem("Turbo Tuesday (Cardio I)",R.drawable.turbo,2);
    listItems.add(tuesday);
    DaysItem wednesday=new DaysItem("Wild Out Wednesday (Legs & Abs)",R.drawable.skater,3);
    listItems.add(wednesday);
    DaysItem thursday=new DaysItem("Turned Up Thursday (Upper Body)",R.drawable.turnedup,4);
    listItems.add(thursday);
    DaysItem friday=new DaysItem("Fired Up Friday (Cardio II)",R.drawable.firedup,5);
    listItems.add(friday);
}

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.programs: {
                startActivity(new Intent(TabataDaysActivity.this, TabataDaysActivity.class));
                drawerLayout.closeDrawer(GravityCompat.START);

            }break;
            case R.id.music: {
                startActivity(new Intent(TabataDaysActivity.this, SongsActivity.class));
                drawerLayout.closeDrawer(GravityCompat.START);

            }break;
        }
        return true;
    }
}
