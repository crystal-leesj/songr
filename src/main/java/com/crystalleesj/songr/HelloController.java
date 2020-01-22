package com.crystalleesj.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String getHome(){
        return "home";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalizeWords(@PathVariable String word, Model m){

        m.addAttribute("capitalizedWord", wordsToCapitalize(word));
        return "home";
    }

    public static String wordsToCapitalize(String wordsToCapitalize) {
        return wordsToCapitalize.toUpperCase();
    }

    @GetMapping("/albums")
    public String displayAlbums(Model m){
        Album[] albumList = new Album[]{new Album("Easy Listening for Love","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg"), new Album("Psycho", "Red Velvet", 16, 215000, "https://i1.sndcdn.com/artworks-000657166189-dxjm1z-t500x500.jpg"), new Album("Any song", "Zico", 12, 215000, "https://1409791524.rsc.cdn77.org/data/thumbs/full/540454/650/0/0/0/zico-unveils-new-concept-concept-photo.jpg")};
        m.addAttribute("albums", albumList);
        return "albums";
    }

}
