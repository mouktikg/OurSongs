package com.micro.customer.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.micro.customer.client.SongsClient;
import com.micro.customer.model.Song;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {
	
private final SongsClient songsClient;
	
	@RequestMapping(value = "/getPreference", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Song> getAllSongs() {
		return songsClient.getAllSongs();
	}
	
	
}
