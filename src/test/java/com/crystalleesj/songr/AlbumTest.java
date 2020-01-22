package com.crystalleesj.songr;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    @Test
    public void test_getTitle() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        assertEquals("Shining road", album.getTitle());
    }

    @Test
    public void test_getArtist() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        assertEquals("Sultan of the Disco", album.getArtist());
    }

    @Test
    public void test_getSongCount() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        assertEquals(2, album.getSongCount());
    }

    @Test
    public void test_getLength() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        assertEquals(202000, album.getLength());
    }

    @Test
    public void test_getImageURL() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        assertEquals("https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg", album.getImageURL());
    }

    @Test
    public void test_setTitle() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        album.setTitle("different title");
        assertTrue(album.getTitle() == "different title");
    }

    @Test
    public void test_setArtist() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        album.setArtist("different artist");
        assertTrue(album.getArtist() == "different artist");
    }

    @Test
    public void test_setSongCount() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        album.setSongCount(10);
        assertTrue(album.getSongCount() == 10);
    }

    @Test
    public void test_setLength() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        album.setLength(9090);
        assertTrue(album.getLength() == 9090);
    }

    @Test
    public void test_setImageURL() {
        Album album = new Album("Shining road","Sultan of the Disco", 2, 202000, "https://images.shazam.com/coverart/t466289493-b1461738873_s400.jpg");
        album.setImageURL("different image url");
        assertTrue(album.getImageURL() == "different image url");
    }
}