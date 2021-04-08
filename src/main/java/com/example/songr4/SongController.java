package com.example.songr4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;


    @PostMapping("/mySongs")
    public RedirectView updateSong(String songTitle, int songLength, int songTrack, Long albumId){
        Album myAlbum = albumRepository.findById(albumId).get();
        Song song = new Song(songTitle, songLength, songTrack, myAlbum);
        myAlbum.
    }

}
