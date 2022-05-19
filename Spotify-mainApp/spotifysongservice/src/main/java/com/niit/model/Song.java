package com.niit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Song {
    @Id
    private int songId;
    private String songName;
    private String songArtist;
    private String songPath;

    public Song() {
    }

    public Song(int songId, String songName, String songArtist, String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.songArtist = songArtist;
        this.songPath = songPath;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", songArtist='" + songArtist + '\'' +
                ", songPath='" + songPath + '\'' +
                '}';
    }
}
