package com.example.songr4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//step 1 give model a entity
// step 2 Give your class a id
// step 3 needs default constructor
// step 4 create a class name<entityclasssname> repository

// jdbc set up
// add the dependencies
// add application.properties spring.datasource properties
@Entity
    public class Album {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String title;
        String artist;
        int songCount;
        String songLength;
        String imgUrl;

        public Album(String title, String artist, int songCount, String songLength, String imgUrl) {
            this.title = title;
            this.artist = artist;
            this.songCount = songCount;
            this.songLength = songLength;
            this.imgUrl = imgUrl;
        }
        public Album(){ }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public int getSongCount() {
            return songCount;
        }

        public void setSongCount(int songCount) {
            this.songCount = songCount;
        }

        public String getSongLength() {
            return songLength;
        }

        public void setSongLength(String songLength) {
            this.songLength = songLength;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }



    }


