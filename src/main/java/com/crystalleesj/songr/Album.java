package com.crystalleesj.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long albumId;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;

    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageURL;

    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }

    public Album() {}

//    REF - https://coderanch.com/t/515213/engineering/JUnit-tests-Getters-Setters

    public long getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() { return artist; }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setTitle(String title) {
        if (title != "") {
            this.title = title;
        } else {
            System.out.println("Can't save a title because it is empty");
        }
    }

    public void setArtist(String artist) {
        if (artist != "") {
            this.artist = artist;
        } else {
            System.out.println("Can't save a artist because it is empty");
        }
    }

    public void setSongCount(int songCount) {
        if (songCount > 0) {
            this.songCount = songCount;
        } else {
            System.out.println("Can't save a songCount because it is empty");
        }
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Can't save a length because it is empty");
        }
    }

    public void setImageURL(String imageURL) {
        if (imageURL != "") {
            this.imageURL = imageURL;
        } else {
            System.out.println("Can't save a imageURL because it is empty");
        }
    }
}
