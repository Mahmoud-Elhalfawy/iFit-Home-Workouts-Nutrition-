
package com.example.i_fit.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.i_fit.R;

public class SplashActivity extends AppCompatActivity {
Handler handler;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar=findViewById(R.id.progress);
        handler=new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this,MainMenuActivity.class));
            finish();
            },3000);

    }
}
