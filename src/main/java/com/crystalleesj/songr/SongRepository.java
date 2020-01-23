package com.crystalleesj.songr;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    // credit to Jerome
    List<Song> findByAlbum(Album album);
}
