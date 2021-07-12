package com.micro.songs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.songs.model.Song;
import com.micro.songs.repository.SongsRepository;

@Service
public class SongsService {
@Autowired
private SongsRepository songRepo;

	
	public Song createSong(Song song) {
		return songRepo.insert(song);
	}
	
	public List<Song> getAllSongs() {
		return songRepo.findAll();
	}
	
	public String showName() {
		return songRepo.showName();
	}
}
