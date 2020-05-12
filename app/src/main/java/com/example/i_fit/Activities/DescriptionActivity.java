
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
import com.example.i_fit.Adapter.DescriptionAdapter;
import com.example.i_fit.Model.Circuit;
import com.example.i_fit.Model.Tabata;
import com.example.i_fit.Model.Workout;
import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DescriptionActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
DescriptionAdapter adapter;
List<Workout> listItems;
DrawerLayout drawerLayout;
NavigationView navigationView;
RecyclerView recyclerView;
Tabata tabata;
int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        drawerLayout=findViewById(R.id.drawerLayout);

//        Bundle bundle=getIntent().getExtras();
//        day=bundle.getInt("day",1);
        tabata=new Tabata();
        recyclerView=findViewById(R.id.rv);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fillList(1);
        adapter=new DescriptionAdapter(this,listItems);
        recyclerView.setAdapter(adapter);

        Toolbar toolBar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolBar);
        navigationView=findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    public void fillList(int day){
        listItems=new ArrayList<>();
        HashMap<Integer, ArrayList<Circuit>> t=tabata.getTraining();
        HashMap<String,Workout> workoutHashMap=new HashMap<>();
        ArrayList<Circuit> circuits=t.get(day);
        for(Circuit x:circuits){
            ArrayList<Workout> w=x.getWorkouts();
            for(Workout workout:w) {
                if (!(workoutHashMap.containsKey(workout.getDescription()))) {
                    workoutHashMap.put(workout.getDescription(), workout);
                    listItems.add(workout);
                }
            }
        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.programs: {
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(DescriptionActivity.this, TabataDaysActivity.class));

            }break;
            case R.id.music: {
                drawerLayout.closeDrawer(GravityCompat.START);

                startActivity(new Intent(DescriptionActivity.this, SongsActivity.class));

            }break;
        }
        return true;    }



    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }
}
