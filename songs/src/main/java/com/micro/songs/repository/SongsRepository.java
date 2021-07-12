package com.micro.songs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.micro.songs.model.Song;

public interface SongsRepository extends MongoRepository<Song, String>, SongsRepositoryCustom{

}
