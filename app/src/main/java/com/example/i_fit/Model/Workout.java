package com.example.i_fit.Model;

public class Workout {
    private String name;
    private int gif;
    private String description;
    private boolean expanded;

    public String getDescription() {
        return description;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Workout(String name, int gif){
        this.name=name;
        this.gif=gif;
        expanded=false;
    }

    public Workout(String name, int gif,String description){
        this.name=name;
        this.gif=gif;
        this.description=description;
        expanded=false;
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
