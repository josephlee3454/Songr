package com.example.songr4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // this inteface will load methods like save, update , delete, getone, put


}
