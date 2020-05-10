package com.example.i_fit.Interfaces;

import com.example.i_fit.Model.Workout;

public interface Strategy {
    void showTraining(final Workout w);
    void rest();
    void showAnimation(int s);
    void showAnimationRest();
    void shuffle();
    void play();

}
