package com.example.i_fit.Timer;

import android.os.CountDownTimer;

public class Timer {
    private TimerState timerState;

   private  long timeLeftMilli=1200000;   //2 minutes

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private CountDownTimer timer;
    private boolean timerRunning;
    private int seconds=0;

    public CountDownTimer getTimer() {
        return timer;
    }

    public void setTimer(CountDownTimer timer) {
        this.timer = timer;
    }

    public Timer(){
        timerState=new StartState();
    }



    public void startTimer(){
        timer=new CountDownTimer(timeLeftMilli,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                    timeLeftMilli=millisUntilFinished;
                    updateTimer();
            }

            @Override
            public void onFinish() {
                timer.cancel();

            }


        }.start();
    }

    public  long getTimeLeftMilli() {
        return timeLeftMilli;
    }

    public void updateTimer(){
        seconds=(int)(1200000-timeLeftMilli)/1000;
}

public void setTimerState(TimerState timerState){
        this.timerState=timerState;

}


public void change(){
        timerState.change(this);
}

public void stop(){
        timer.cancel();
}

    public void setTimeLeftMilli(long timeLeftMilli) {
        this.timeLeftMilli = timeLeftMilli;
    }

public void reset(){
        stop();
        timer.start();
}


}
