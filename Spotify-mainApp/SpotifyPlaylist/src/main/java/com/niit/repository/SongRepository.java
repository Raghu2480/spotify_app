package com.niit.repository;

import com.niit.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends MongoRepository<Song, Integer> {
    List<Song> findAllSongByUsername(String username);
}
