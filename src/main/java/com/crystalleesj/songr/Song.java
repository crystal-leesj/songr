package com.crystalleesj.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long songId;

    @ManyToOne
    Album album;

    private String title;
    private int length;
    private int trackNumber;

    public Song() {
    }

    public long getSongId() {
        return songId;
    }

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getLlength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

}