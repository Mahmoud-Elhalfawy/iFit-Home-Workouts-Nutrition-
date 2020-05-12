package com.example.i_fit.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.i_fit.Model.ListItem;
import com.example.i_fit.Adapter.MyAdapter;
import com.example.i_fit.Data.DataHandler;
import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;
    final int MY_PERMISSION_REQUEST=1;
    Handler mHandler;
    DataHandler dataHandler;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        recyclerView=findViewById(R.id.recyclerVeiw);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHandler=new Handler();
        initiateMusic();
        adapter=new MyAdapter(this,listItems);

        for(ListItem x:listItems){
            Log.d("Name", x.getArtist());
        }
        recyclerView.setAdapter(adapter);
        Toolbar toolBar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolBar);
        drawerLayout=findViewById(R.id.dlayout2);
        navigationView=findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }





    public void initiateMusic(){
        listItems=new ArrayList<>();
        if(ContextCompat.checkSelfPermission(SongsActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(SongsActivity.this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)){
                ActivityCompat.requestPermissions(SongsActivity.this,new String[]{Manifest.permission
                        .READ_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST);
            }else{
                ActivityCompat.requestPermissions(SongsActivity.this,new String[]{Manifest.permission
                        .READ_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST);
            }

        }else
            getMusic();


    }



    public void getMusic(){
        ContentResolver contentResolver=getContentResolver();
        Uri Uri= MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor=contentResolver.query(Uri,null,null,null,null,null);

        if(cursor!=null && cursor.moveToFirst()){
            int songUri=cursor.getColumnIndex(MediaStore.Audio.Media.DATA);
            int songA=cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST);
            int songN=cursor.getColumnIndex(MediaStore.Audio.Media.TITLE);
            do{
                String sU=cursor.getString(songUri);
                String sN=cursor.getString(songN);
                String sA=cursor.getString(songA);
                listItems.add(new ListItem(sN,sA,sU));
            }while(cursor.moveToNext());
        }
cursor.close();
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSION_REQUEST: {
                if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    if (ContextCompat.checkSelfPermission(SongsActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_GRANTED) {
                        getMusic();
                    }
                } else
                    Toast.makeText(this, "5ara 3la dma8ak", Toast.LENGTH_SHORT).show();
            }
            break;
        }
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
                drawerLayout.closeDrawer(GravityCompat.START);
                startActivity(new Intent(SongsActivity.this, TabataDaysActivity.class));

            }break;
            case R.id.music: {
                drawerLayout.closeDrawer(GravityCompat.START);

                startActivity(new Intent(SongsActivity.this, SongsActivity.class));

            }break;
        }
        return true;
    }


}
