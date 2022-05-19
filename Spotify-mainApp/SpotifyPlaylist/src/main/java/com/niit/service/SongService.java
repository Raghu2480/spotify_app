package com.niit.service;

import com.niit.exception.SongAlreadyExistsException;
import com.niit.exception.SongNotFoundException;
import com.niit.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongService {
    Song saveSong(Song song) throws SongAlreadyExistsException;
    List<Song> getAllSong() throws Exception;
    List<Song> getAllSongsByUsername(String username) throws Exception;
    boolean deleteSongFromPlaylist(int songId) throws SongNotFoundException;
}
