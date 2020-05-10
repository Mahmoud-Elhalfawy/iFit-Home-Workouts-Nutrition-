package com.example.i_fit.Controller;

import com.example.i_fit.Model.Circuit;
import com.example.i_fit.Model.Workout;
import com.example.i_fit.R;
import com.example.i_fit.Activities.TabataWorkoutActivity;
import com.example.i_fit.Timer.Timer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Handler;

public class ThreadController extends Thread {
TabataWorkoutActivity strategy;
 public Boolean running;
 Handler handler;
 Timer timer;
 boolean next=true;
 int flag=0;
 int j=0;
 int reps=0;
 boolean train;
 int i=0;
int day;
Circuit x;
 private HashMap<Integer, ArrayList<Circuit>> training;

    public ThreadController(TabataWorkoutActivity strategy, Timer timer, int day){
        super();
        this.strategy=strategy;
        this.timer=timer;
        training=strategy.training;
        this.day=day;

    }

    @Override
    public void run() {
        boolean next=true;
        int flag=0;
        int j=0;
        int reps=0;
        boolean train;
        int i=0;
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.reset();
         x=training.get(day).get(j);
        while(running) {
            if(strategy.pause) {
               timer.reset();
               strategy.next=false;
                continue;
            }

            try {
                checkNext();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try {
                startTraining();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }





public void checkNext() throws InterruptedException {
    if(strategy.next){
        strategy.alert();
        if(next) {
            j = j + 1;
            Thread.sleep(50);
            strategy.switchC();
            next=false;
        }
        if (j < training.get(day).size()) {
            x = training.get(day).get(j);
            reps = 0;
            i = 0;

        }

    }

}




public boolean checkWorkout(){
    if (i >= x.getWorkouts().size()) {
        if (reps < x.getReps() - 1)
            ++reps;
        else {
            j = j + 1;
            if (j < training.get(day).size()) {
                x = training.get(day).get(j);
                reps = 0;
            }else
                return false;
        }
        i = 0;
    }
    return true;
}




public void startTraining() throws InterruptedException {
    if (j < training.get(day).size() || strategy.next) {
        if(!checkWorkout())
            return ;
        Thread.sleep(50);
        if (timer.getSeconds() <= 5 && flag == 0)
            strategy.showTraining(x.getWorkouts().get(i));
        else if (flag == 1 && timer.getSeconds() <= 5)
            strategy.rest();
        else {
            timer.reset();
            strategy.flag=0;
            if (flag == 1) {
                flag = 0;
                if(!strategy.next)
                    i++;
                strategy.next=false;
                next=true;
            } else
                flag = 1;
        }
    }else {
        Thread.sleep(50);
        timer.reset();
        strategy.showTraining(new Workout("End Of Training", R.drawable.end));
    }

}


}
