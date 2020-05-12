package com.example.i_fit.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.i_fit.Controller.ThreadController;
import com.example.i_fit.Model.Circuit;
import com.example.i_fit.Model.ListItem;
import com.example.i_fit.Data.DataHandler;
import com.example.i_fit.Model.Workout;
import com.example.i_fit.R;
import com.example.i_fit.Interfaces.Strategy;
import com.example.i_fit.Timer.Timer;
import com.example.i_fit.Model.Tabata;
import com.example.i_fit.Util.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TabataWorkoutActivity extends AppCompatActivity implements Strategy {
    private Tabata tabata;
    private TextView trainingText;
    private TextView timerText;
    private Timer timer;
    private Handler mHandler;
    private ImageButton shuffle;
    private ImageButton play;
    private ImageButton nextB;
    private ImageButton sound;
    private ImageButton back;
    private ImageView prevB;
    private Button pauseTraining;
    private Button skip;
    public boolean pause;
    public boolean next;
    public boolean mute;
    public pl.droidsonroids.gif.GifImageView gifImageView;
    pl.droidsonroids.gif.GifImageView gifImageView2;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       // finish();
    }

    int random;
    MediaPlayer mediaPlayer;
    ArrayList<ListItem> arrayList;
    final int MY_PERMISSION_REQUEST=1;
   static ThreadController thread;

    Boolean running=true;
    Circuit c;
    public int flag=0;
    int i=0;
    int j=0;
    int day;
     public HashMap<Integer, ArrayList<Circuit>> training;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);
        Log.d("TAG", "onCreate: "+timer+" "+thread);

        Bundle bundle=getIntent().getExtras();
        day=bundle.getInt("day",0);
        pauseTraining=findViewById(R.id.button);
        nextB=findViewById(R.id.next);
        prevB=findViewById(R.id.prev);
        sound=findViewById(R.id.sound);
         gifImageView=findViewById(R.id.gifView);
        gifImageView2=findViewById(R.id.gifView2);
         trainingText=findViewById(R.id.trainingText);
        timerText=findViewById(R.id.timerText);
        play=findViewById(R.id.play);
        shuffle=findViewById(R.id.shuffle);
        skip=findViewById(R.id.skip);
        back=findViewById(R.id.back);
        timer=new Timer();
        timer.change();
        tabata=new Tabata();
        mHandler=new Handler();
        training=tabata.getTraining();
        thread=new ThreadController(this,timer,day);
        Log.d("TAG", "onCreate: "+timer + " "+thread);
        thread.running=true;
        thread.start();

        nextB.setOnClickListener(v -> nextSong());
        prevB.setOnClickListener(v->prevSong());
        sound.setOnClickListener(v -> {
            if(mediaPlayer!=null) {
                if (mute) {
                    mute = false;
                    mediaPlayer.setVolume(1,1);
                    mHandler.post(() -> {
                       sound.setImageResource(R.drawable.sound);
                        Toast.makeText(this, "Sound On", Toast.LENGTH_SHORT).show();
                    });
                }else{
                    mute = true;
                    mediaPlayer.setVolume(0,0);
                    mHandler.post(() -> {
                        sound.setImageResource(R.drawable.soundoff);
                        Toast.makeText(this, "Sound Off", Toast.LENGTH_SHORT).show();
                    });
                }
            }
        });

        back.setOnClickListener(v->{

            finish();

        });

skip.setOnClickListener((v)-> next=true);

    pauseTraining.setOnClickListener(v -> {
        flag=0;
        if(pause) {
            pause = false;
            mHandler.post(() -> {
                pauseTraining.setText("Pause Training");
            });
        }else{
        pause=true;
        mHandler.post(() -> {
           pauseTraining.setText("Resume Training");
        });
        showTraining(new Workout("Pause",R.drawable.hourglass));

        }

    });

    play.setOnClickListener(v -> play());

    shuffle.setOnClickListener(v -> shuffle());

try {
    initiateMusic();
}catch (Exception e){
    finish();
}
    if(mediaPlayer!=null) {
        mediaPlayer.setOnCompletionListener(mp -> nextSong());
    }

    }

    public void initiateMusic(){
        arrayList=new ArrayList<>();


                DataHandler d=new DataHandler(this,new Util());
                HashMap<String,ListItem> h=d.getAllSongs();
                if(h.size()>0) {
                    for (Map.Entry<String, ListItem> entry : h.entrySet()) {
                        ListItem l=entry.getValue();
                        arrayList.add(l);
                    }
                    random=new Random().nextInt(arrayList.size());
                    mediaPlayer = MediaPlayer.create(TabataWorkoutActivity.this, Uri.parse(arrayList.get(random).getUrl()));
                }else
                    Toast.makeText(this, "No Songs added", Toast.LENGTH_LONG).show();
    }


    public void showCount(Workout w){
        mHandler.post(() -> {


            showAnimation(w.getGif());
            trainingText.setText(w.getName());
            //if(!w.getName().equals("End Of Training"))
            timerText.setText(String.valueOf(3-timer.getSeconds()));

        });
    }
    public void showTraining( Workout w){

       mHandler.post(() -> {


           showAnimation(w.getGif());
                trainingText.setText(w.getName());
           //if(!w.getName().equals("End Of Training"))
               timerText.setText(String.valueOf(timer.getSeconds()));

           });

    }
    public void switchC(){
        mHandler.post(() -> Toast.makeText(TabataWorkoutActivity.this, "Next Circuit will start after this workout", Toast.LENGTH_LONG).show());
    }

    public void rest(){


        mHandler.post(() -> {

            showAnimationRest();
            timerText.setText(String.valueOf(timer.getSeconds()));
            trainingText.setText("Rest for 10 seconds");

        });

    }

public void alert(){
    mHandler.post(() -> trainingText.setText("Get Ready for Next Circuit"));

}

 public void showAnimation(int s){
    if(flag==0) {
        gifImageView.setImageResource(s);

        flag=1;

    }

 }

    public void showAnimationRest() {
        if (flag == 0) {
            gifImageView.setImageResource(R.drawable.hourglass);
            flag=1;
        }
    }

    public void play(){
        if(mediaPlayer!=null)
            if(mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mHandler.post(() -> {
                   play.setImageResource(R.drawable.play);
                });
            }
            else{
                mediaPlayer.start();
                mHandler.post(() -> {
                    play.setImageResource(R.drawable.pause);
                    Toast.makeText(this, arrayList.get(random).getName(), Toast.LENGTH_SHORT).show();
                });
            }

    }
public void nextSong() {
    if (arrayList.size() > 1) {
        random = random + 1;
        if (mediaPlayer != null) {
            if (random >= arrayList.size())
                random = 0;
            if (mediaPlayer.isPlaying())
                mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = MediaPlayer.create(TabataWorkoutActivity.this, Uri.parse(arrayList.get(random).getUrl()));
            mediaPlayer.setOnCompletionListener(mp -> nextSong());
            mediaPlayer.start();
            if(mute)
                mediaPlayer.setVolume(0,0);
            mHandler.post(() ->{
                    play.setImageResource(R.drawable.pause);
                    Toast.makeText(this, arrayList.get(random).getName(), Toast.LENGTH_SHORT).show();

            });

        }
    }
}


public void prevSong(){
    if (arrayList.size() > 1) {
        random = random - 1;
        if (mediaPlayer != null) {
            if (random < 0)
                random = arrayList.size()-1;
            if (mediaPlayer.isPlaying())
                mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = MediaPlayer.create(TabataWorkoutActivity.this, Uri.parse(arrayList.get(random).getUrl()));
            mediaPlayer.setOnCompletionListener(mp -> nextSong());
            mediaPlayer.start();
            if(mute)
                mediaPlayer.setVolume(0,0);
            mHandler.post(() ->{
                play.setImageResource(R.drawable.pause);
                Toast.makeText(this, arrayList.get(random).getName(), Toast.LENGTH_SHORT).show();
            });
        }
    }


}
    public void shuffle(){
        if(arrayList.size()>1) {
            int randomInt = 0;
            Random randomGenerator = new Random();
            if (mediaPlayer != null) {
                do {
                    randomInt = randomGenerator.nextInt(arrayList.size());
                } while (randomInt == random);
                random = randomInt;
                if (mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(TabataWorkoutActivity.this, Uri.parse(arrayList.get(randomInt).getUrl()));
                mediaPlayer.setOnCompletionListener(mp -> nextSong());
                mediaPlayer.start();
                mHandler.post(() ->{
                        Toast.makeText(this, arrayList.get(random).getName(), Toast.LENGTH_SHORT).show();
                        play.setImageResource(R.drawable.pause);
                });

            }
        }

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        timer.reset();
        Log.d("TAG", "onRestart: ");
        pause=false;
        if(mediaPlayer!=null) {
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    nextSong();
                }
            });
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop: ");
        pause=true;
        if(mediaPlayer!=null) {
            mediaPlayer.setOnCompletionListener(null);
            if(mediaPlayer.isPlaying())
                mediaPlayer.pause();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause: ");

        }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: ");
        boolean retry = true;
        while (retry) {
            try {
                thread.running=false;
            } catch (Exception e) {

            }
            retry = false;
        }
        if(mediaPlayer!=null)
            mediaPlayer.release();
      //  thread=null;
        timer.reset();
        timer.stop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
       // pause=false;

    }





    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSION_REQUEST: {
                if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    if (ContextCompat.checkSelfPermission(TabataWorkoutActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                            == PackageManager.PERMISSION_GRANTED) {
                        initiateMusic();
                    }
                } else
                    Toast.makeText(this, "5ara 3la dma8ak", Toast.LENGTH_SHORT).show();
            }
            break;
        }
    }





}


//    public void getMusic(){
//        ContentResolver contentResolver=getContentResolver();
//        Uri Uri= MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        Cursor cursor=contentResolver.query(Uri,null,null,null);
//
//        if(cursor!=null && cursor.moveToFirst()){
//            int songUri=cursor.getColumnIndex(MediaStore.Audio.Media.DATA);
//            do{
//                String sU=cursor.getString(songUri);
//                arrayList.add(sU);
//            }while(cursor.moveToNext());
//        }
//
//    }





//Taking from Storage


//        if(ContextCompat.checkSelfPermission(TDaysActivity.this,Manifest.permission.READ_EXTERNAL_STORAGE)
//                != PackageManager.PERMISSION_GRANTED){
//            if(ActivityCompat.shouldShowRequestPermissionRationale(TDaysActivity.this,
//                    Manifest.permission.READ_EXTERNAL_STORAGE)){
//                ActivityCompat.requestPermissions(TDaysActivity.this,new String[]{Manifest.permission
//                        .READ_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST);
//            }else{
//                ActivityCompat.requestPermissions(TDaysActivity.this,new String[]{Manifest.permission
//                        .READ_EXTERNAL_STORAGE},MY_PERMISSION_REQUEST);
//            }
//
//        }else {
//            getMusic();
//
//            mediaPlayer = MediaPlayer.create(TDaysActivity.this, Uri.parse(arrayList.get(new Random().nextInt(arrayList.size()))));
//        }