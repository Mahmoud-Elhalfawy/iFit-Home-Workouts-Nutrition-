package com.example.i_fit.Model;

public class DaysItem {
    private String name;
    private int image;
    private int n;

    public DaysItem(String name, int image,int n) {
        this.name = name;
        this.image = image;
        this.n=n;
    }

    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
