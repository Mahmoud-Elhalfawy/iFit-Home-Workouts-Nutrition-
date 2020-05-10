package com.example.i_fit.Model;

public class ListItem {
    String name;
    String artist;
    String url;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ListItem(String name, String artist, String url) {
        this.name = name;
        this.artist = artist;
        this.url=url;
    }

    public String getName() {
        return name;
    }

    public ListItem() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
