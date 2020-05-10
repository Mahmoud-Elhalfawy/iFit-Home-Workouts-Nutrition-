package com.example.i_fit.Model;

import java.util.ArrayList;

public class Circuit {
    private ArrayList<Workout> workouts;
    private int reps;


    public Circuit(){
        workouts=new ArrayList<>();
    }


    public Circuit(ArrayList<Workout>workouts,int reps){
        this.workouts=workouts;
        this.reps=reps;
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }
}
