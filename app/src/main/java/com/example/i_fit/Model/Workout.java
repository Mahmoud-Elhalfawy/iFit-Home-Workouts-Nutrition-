package com.example.i_fit.Model;

public class Workout {
    private String name;
    private int gif;

    public Workout(String name,int gif){
        this.name=name;
        this.gif=gif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGif() {
        return gif;
    }

    public void setGif(int gif) {
        this.gif = gif;
    }
}
