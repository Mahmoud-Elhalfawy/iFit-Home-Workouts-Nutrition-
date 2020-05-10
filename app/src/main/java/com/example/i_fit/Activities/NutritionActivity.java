package com.example.i_fit.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.i_fit.R;
import com.google.android.material.navigation.NavigationView;

public class NutritionActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private SeekBar seekBar;
    private Button submit;
    private TextView routine;
    private RadioGroup radioGroup;
    private RadioButton gender;
    private EditText ageText;
    private int age;
    private EditText heightText;
    private int height;
    private EditText weightText;
    private int weight;
    private int g;
    double BMR;
    double factor;
    double activityFactor;
    double BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        Toolbar toolBar=findViewById(R.id.toolbarn);
        setSupportActionBar(toolBar);
        drawerLayout=findViewById(R.id.dlayoutn);
        navigationView=findViewById(R.id.nav_viewn);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolBar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        seekBar=findViewById(R.id.seekBar);
        routine=findViewById(R.id.routineID);
        submit=findViewById(R.id.submitID);
        radioGroup=findViewById(R.id.radioGroup);
        ageText=findViewById(R.id.ageID);
        ageText=findViewById(R.id.ageID);
        weightText=findViewById(R.id.weightID);
        heightText=findViewById(R.id.heightID);
        submit.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                gender=findViewById(checkedId);
                if (gender.getId()==R.id.maleID)
                    g=1;
                else
                    g=2;
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress) {
                    case 0: {
                        routine.setText("Sedentary\n(No Exercise)");
                        factor = 1.2;
                    }
                    break;
                    case 1: {
                        routine.setText("Light\n(1->3 exercises/week)");
                        factor=1.375;
                    }break;

                    case 2: {
                        routine.setText("Moderate\n(3->5 exercises/week)");
                        factor=1.55;
                    }break;
                    case 3: {
                        routine.setText("Very Active\n(6->7 exercises/week)");
                        factor=1.725;
                    }break;
                    case 4: {
                        routine.setText("Extremely Active\n(Physical Job or very heavy exercises)");
                        factor=1.9;
                    }
                    break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void onClick(View v) {
        if(!(ageText.getText().toString().equals("")|| heightText.getText().toString().equals("")
                ||weightText.getText().toString().equals("")||g==0)){
             age=Integer.parseInt(ageText.getText().toString());
             height=Integer.parseInt(heightText.getText().toString());
             weight=Integer.parseInt(weightText.getText().toString());
             if(g==1)
                 BMR=(10 * weight) + (6.25 * height) - (5 * age) + 5;
             else
                 BMR=(10 * weight) + (6.25 * height) - (5 * age) -161;

                activityFactor=BMR*factor;
                BMI=weight/(Math.pow(height/100.0,2));

        }else
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();


    }
}
