package com.example.songr4;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToMany
    public Album album;
    private String songTitle;
    private int songLength;
    private int songTrack;

    public Song(){};


    public Song(String songTitle, int songLength, int songTrack, Album album){
        this.songTitle =  songTitle;
        this.songLength = songLength;
        this.songTrack = songTrack;
        this.album = album;
    }
    public long getId() {
        return id;
    }
    public Album getAlbum() {
        return album;
    }


    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public int getSongTrack() {
        return songTrack;
    }

    public void setSongTrack(int songTrack) {
        this.songTrack = songTrack;
    }



}
