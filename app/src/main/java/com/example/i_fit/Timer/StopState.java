package com.example.i_fit.Timer;

public class StopState implements TimerState {
    @Override
    public void change(Timer timer) {
        timer.stop();
    }
}
