package com.niit.controller;

import com.niit.exception.SongAlreadyExistsException;
import com.niit.exception.SongNotFoundException;
import com.niit.model.Song;
import com.niit.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v3/")
public class SongController {
    private SongService songService;
    private ResponseEntity responseEntity;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }
    @PostMapping("song/{username}")
    public ResponseEntity<?> saveSong(@RequestBody Song song,@PathVariable String username) throws SongAlreadyExistsException {
        try {
            song.setUsername(username);
            songService.saveSong(song);
            responseEntity = new ResponseEntity(song , HttpStatus.CREATED);
        } catch (SongAlreadyExistsException e) {
            throw new SongAlreadyExistsException();
        }
        catch (Exception e)
        {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
    @GetMapping("songs")
    public ResponseEntity<?> getAllSongs(){
        try{
            responseEntity = new ResponseEntity(songService.getAllSong(), HttpStatus.OK);
        }catch (Exception e){
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
    @GetMapping("songs/{username}")
    public ResponseEntity<?> getAllSongsByUsername(@PathVariable String username)
    {
        try
        {
            responseEntity=new ResponseEntity(songService.getAllSongsByUsername(username),HttpStatus.OK);
        }catch (Exception e){
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
    @DeleteMapping("songs/{songId}")
    public ResponseEntity<?> deleteSongFromPlaylist(@PathVariable int songId) throws SongNotFoundException
    {
        try
        {
            responseEntity=new ResponseEntity<>(songService.deleteSongFromPlaylist(songId),HttpStatus.OK);
        }
        catch(SongNotFoundException e){
            throw new SongNotFoundException();
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

}
