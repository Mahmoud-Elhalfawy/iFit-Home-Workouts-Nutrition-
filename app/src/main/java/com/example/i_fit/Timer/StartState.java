package com.example.i_fit.Timer;

public class StartState implements TimerState {
    @Override
    public void change(Timer timer) {
        timer.startTimer();
    }
}
