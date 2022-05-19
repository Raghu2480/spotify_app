package com.niit.service;

import com.niit.exception.SongAlreadyExistsException;
import com.niit.exception.SongNotFoundException;
import com.niit.model.Song;
import com.niit.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    private SongRepository songRepository;
    @Autowired
    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song saveSong(Song song) throws SongAlreadyExistsException {
        if(songRepository.findById(song.getSongId()).isPresent())
        {
            throw new SongAlreadyExistsException();
        }
        return songRepository.save(song);
    }

    @Override
    public List<Song> getAllSong() throws Exception {
        return songRepository.findAll();
    }

    @Override
    public List<Song> getAllSongsByUsername(String username) throws Exception {
        return songRepository.findAllSongByUsername(username);
    }

    @Override
    public boolean deleteSongFromPlaylist(int songId) throws SongNotFoundException {
        songRepository.deleteById(songId);
        return true;
    }

}
