package com.micro.songs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.micro.songs.model.Song;
import com.micro.songs.service.SongsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/songs")
public class SongsController {
	
//@Autowired
private final SongsService songService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Song createSong(@RequestBody Song song) {
		return songService.createSong(song);
	}
	
	@RequestMapping(value = "/getAllSongs", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Song> getAllSongs() {
		return songService.getAllSongs();
	}
	
	@RequestMapping(value = "/showName", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getName() {
		return songService.showName();
	}
}
