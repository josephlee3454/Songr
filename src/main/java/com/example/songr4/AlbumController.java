package com.example.songr4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

//import org.springframework.web.bind.annotation.DeleteMapping;


@Controller
public class AlbumController {



    @GetMapping("/hello-world")
    public String showHelloPage(){
        return "hello-world-page.html";
    }

    @GetMapping("/")
    public String ShowSplash(){return "splash.html";}


    ///jdpa stuff

    @Autowired // autowired instiates the the album repo
    //
    public AlbumRepository albumRepository;


    /////////////////////////////////////
//
//albums.add(new Album("No Need to Argue","cranberries",12,"3","http://3.bp.blogspot.com/-C7YwgREqx4o/TrggVVRdLNI/AAAAAAAAAbE/PwxI-3RYqb0/s1600/The_Cranberries+fashion.jpg"));
//        albums.add(new Album("Final Straw","Snow Patrol",9,"3","https://rhodesmedia.com/wp-content/uploads/2020/11/snow-ad.jpg"));
//        albums.add(new Album("The Detour","Ekoh",12,"5","https://www.reviewjournal.com/wp-content/uploads/2018/08/11004041_web1_copy_image1.jpeg"));

    @GetMapping("/albums")
    public String showAlbums(Model m){
        ArrayList<Album> albumsList = (ArrayList<Album> )albumRepository.findAll();
        System.out.println(albumsList);
//        ArrayList<Album> albumsList = (ArrayList<Album>) ;
        m.addAttribute("albumsList", albumsList);
//        System.out.println(albumsList);

        return "albums";
    }

    @GetMapping("/capitalize/{var}")
    public String capitalize (
            Model m,
            @PathVariable String var
    ) {

        System.out.println(var.toUpperCase());
        m.addAttribute("uppercase",var.toUpperCase());

        return "capitalize";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums(String title, String artist, int songCount, String songLength, String imgUrl){
        Album newAlbum = new Album( title, artist, songCount, songLength, imgUrl);
//        m.addAttribute("albumList",albums);
        albumRepository.save(newAlbum);
        return new RedirectView("/");

    }


    @DeleteMapping("/albums/{id}")
    public RedirectView deleteAlbum(@PathVariable long id){
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }





}
