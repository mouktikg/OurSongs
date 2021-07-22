package com.micro.customer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.micro.customer.model.Song;

@FeignClient(name = "songs")
public interface SongsClient {
    @GetMapping("/api/songs/getAllSongs")
    List<Song> getAllSongs();
}
