package com.niit.controller;

import com.niit.exception.SongAlreadyExistsException;
import com.niit.model.Song;
import com.niit.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/api/v2/")
public class SongController {
    private SongService songService;
    private ResponseEntity responseEntity;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }
    @PostMapping("song")
    public ResponseEntity<?> saveSong(@RequestBody Song song) throws SongAlreadyExistsException {
        try {
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
}
